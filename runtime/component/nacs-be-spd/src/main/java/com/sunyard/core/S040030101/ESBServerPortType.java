package com.sunyard.core.S040030101;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.1
 * 2018-01-04T14:13:20.728+08:00
 * Generated source version: 3.2.1
 * 
 */
@WebService(targetNamespace = "http://esb.spdbbiz.com/services/S040030101/wsdl", name = "ESBServerPortType")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ESBServerPortType {

    @WebMethod(operationName = "CrdAcctClQry", action = "urn:/CrdAcctClQry")
    @WebResult(name = "RspCrdAcctClQry", targetNamespace = "http://esb.spdbbiz.com/services/S040030101", partName = "RspCrdAcctClQry")
    public RspCrdAcctClQryType crdAcctClQry(
            @WebParam(partName = "ReqCrdAcctClQry", name = "ReqCrdAcctClQry", targetNamespace = "http://esb.spdbbiz.com/services/S040030101")
                    ReqCrdAcctClQryType reqCrdAcctClQry
    );
}
