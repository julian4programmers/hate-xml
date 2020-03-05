package com.hatexml;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.3.5
 * 2020-03-05T15:42:35.054+01:00
 * Generated source version: 3.3.5
 *
 */
@WebService(targetNamespace = "http://hatexml.com", name = "myEndpoint")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface MyEndpoint {

    @WebMethod(action = "http://hatexml.com")
    @WebResult(name = "myOutput", targetNamespace = "http://hatexml.com", partName = "out")
    public MyOutput foo(

        @WebParam(partName = "in", name = "myInput", targetNamespace = "http://hatexml.com")
        MyInput in
    );
}