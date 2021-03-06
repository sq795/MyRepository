package com.sunyard.helper;


public class ReportUtil {
	/**
	 * @param tmp
	 * @param bytes
	 * @return
	 */
	public static byte[] int2byte(int tmp, int bytes){
		StringBuffer tmpStr = new StringBuffer(tmp+"");
		int length = tmpStr.length();
		for(int i=0; i<bytes-length; i++){
			tmpStr.insert(0, '0');
		}
		
		return (tmpStr.toString()).getBytes();
	}
	/**
	 * @param b
	 * @return
	 * @throws Exception 
	 */
	public static int byte2int(byte[] b) throws Exception{
		String lengthS = new String(b).trim();
		if(lengthS==null || !lengthS.matches("^[0-9]+$")){
			throw new Exception("报文长度非法");
		}
		return  Integer.parseInt(lengthS) ;
	}
	/**
	 * @param s
	 * @return
	 */
	public static byte[] string2byte(String s){
		if(s == null){
			return null;
		}
		byte[] b = s.getBytes();
		return b;
	}
	/**
	 * @param s
	 * @return
	 */
//	public static byte[] string2byte1(String s){
//		if(s == null){
//			return null;
//		}else{
//			s = "00000000" + s;
//		}
//		byte[] b = s.getBytes();
//		byte[] lengthB = int2byte(b.length - 8, 8);
//		
//		for(int i=0; i<8; i++){
//			b[i] = lengthB[i];
//		}
//		return b;
//	}
	/**
	 * @param b
	 * @return
	 */
	public static String byte2string(byte[] b){
		return new String(b);
	}
	public static byte[] append(byte[] respB, byte[] respLength) {
		int length = respB.length + respLength.length;
		byte[] tmp = new byte[length];
		for(int i=0; i<length; i++){
			if(i<respLength.length){
				tmp[i] = respLength[i];
			}else{
				tmp[i] = respB[i-respLength.length];
			}
		}
		return tmp;
	}
	
	public static String bytesToHexString(byte[] src){
		StringBuffer stringBuilder = new StringBuffer("");
        if (src == null || src.length <= 0) {
            return null;
        }
        for (int i = 0; i < src.length; i++) {
            int v = src[i] & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv);
        }
        return stringBuilder.toString();
    }
   
    public static byte[] hexStringToBytes(String hexString) {
        if (hexString == null || hexString.equals("")) {
            return null;
        }
        hexString = hexString.toUpperCase();
        int length = hexString.length() / 2;
        char[] hexChars = hexString.toCharArray();
        byte[] d = new byte[length];
        for (int i = 0; i < length; i++) {
            int pos = i * 2;
            d[i] = (byte) (charToByte(hexChars[pos]) << 4 | charToByte(hexChars[pos + 1]));
        }
        return d;
    }
  
    private static byte charToByte(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }
}
