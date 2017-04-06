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
@WebService
public interface IHelloWorld {
    String sayHello(String name);
}
