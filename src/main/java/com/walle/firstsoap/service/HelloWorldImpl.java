/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.walle.firstsoap.service;

import javax.jws.WebService;

/**
 *
 * @author yqh
 */
@WebService(endpointInterface = "com.walle.firstsoap.service.IHelloWorld")
public class HelloWorldImpl implements IHelloWorld{
    public String sayHello(String name) {
        System.out.println("say hello called");
        return "hello "+name;
    }

}
