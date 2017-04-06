package com.walle.firstsoap.client;

import java.io.IOException;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.apache.wss4j.common.ext.WSPasswordCallback;

public class ClientPassCallbackHandler implements CallbackHandler {

    public void handle(Callback[] callbacks) throws IOException,
            UnsupportedCallbackException {

        WSPasswordCallback pc = (WSPasswordCallback) callbacks[0];
            
        if (pc.getIdentifier().equals("admin")) {
            System.err.println("password="+pc.getPassword()+"--token="+pc.getCustomToken());
            pc.setPassword("admin");

        }

    }

}
