
package net.sujan.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Hello", targetNamespace = "http://ws.sujan.net/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Hello {


    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "greetings", targetNamespace = "http://ws.sujan.net/", className = "net.sujan.client.Greetings")
    @ResponseWrapper(localName = "greetingsResponse", targetNamespace = "http://ws.sujan.net/", className = "net.sujan.client.GreetingsResponse")
    @Action(input = "http://ws.sujan.net/Hello/greetingsRequest", output = "http://ws.sujan.net/Hello/greetingsResponse")
    public String greetings(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

}
