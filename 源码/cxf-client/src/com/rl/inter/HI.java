package com.rl.inter;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.4.2
 * 2014-05-13T10:57:38.804+08:00
 * Generated source version: 2.4.2
 * 
 */
@WebService(targetNamespace = "http://inter.cxf.rl.com/", name = "HI")
@XmlSeeAlso({ObjectFactory.class})
public interface HI {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "sayHi", targetNamespace = "http://inter.cxf.rl.com/", className = "com.rl.inter.SayHi")
    @WebMethod
    @ResponseWrapper(localName = "sayHiResponse", targetNamespace = "http://inter.cxf.rl.com/", className = "com.rl.inter.SayHiResponse")
    public java.lang.String sayHi(
        @WebParam(name = "arg0", targetNamespace = "")
        java.lang.String arg0
    );
}
