package com.sample.reservation.security;

import org.apache.ws.security.WSPasswordCallback;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;

public class PWCBHandler implements CallbackHandler {

    public void handle(Callback[] callbacks) throws IOException,
                                                    UnsupportedCallbackException {
        for (int i = 0; i < callbacks.length; i++) {


            WSPasswordCallback pwcb = (WSPasswordCallback) callbacks[i];
//Usage value is set to USERNAME_TOKEN_UNKNOWN when the Rampart engine 
//wants the password callback handler to validate the username and password in 
//the username token.  
if (pwcb.getUsage() == WSPasswordCallback.USERNAME_TOKEN_UNKNOWN) {
                if (pwcb.getIdentifer().equals("charitha") && pwcb.getPassword().equals("charitha")) {
                    return;
                } else {
                    throw new UnsupportedCallbackException(callbacks[i], "check failed");
                }
            }

        }
    }
}
