/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.walle.firstsoap.client;

import com.walle.firstsoap.service.IHelloWorld;
import java.util.HashMap;
import java.util.Map;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;

/**
 * @author yqh
 */
public class Client {   
    public static final void main(String[] args) {
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
        factory.setAddress("http://localhost:8080/FirstSOAP/services/HelloWorld");

       Map<String, Object> outProps = new HashMap<String,Object>();

       outProps.put("action", "UsernameToken");

       //设置用户名

       outProps.put("user", "admin");
       outProps.put("password","admin");
       outProps.put("passwordType", "PasswordDigest");

       outProps.put("passwordCallbackClass", ClientPassCallbackHandler.class.getName());
//
//      

       factory.getOutInterceptors().add(new WSS4JOutInterceptor(outProps));

//       factory.getOutInterceptors().add(new AuthAddInterceptor());
//
//       factory.getOutInterceptors().add(new LoggingOutInterceptor());

      

        IHelloWorld hw =factory.create(IHelloWorld.class);
        
        String str =hw.sayHello("you!!!!!!");
        
        System.out.println(str);
    }
}
