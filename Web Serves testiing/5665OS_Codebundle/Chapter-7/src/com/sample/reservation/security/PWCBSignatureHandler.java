package com.sample.reservation.security;

import org.apache.ws.security.WSPasswordCallback;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;

public class PWCBSignatureHandler implements CallbackHandler {
    public void handle(Callback[] callbacks) throws IOException,
                                                    UnsupportedCallbackException {
        WSPasswordCallback pwcb = (WSPasswordCallback) callbacks[0];

        String id = pwcb.getIdentifer();
        int usage = pwcb.getUsage();
//Usage value is SIGNATURE when rampart wants to get the pass phrase of the 
//private key of the keypair when it wants to create a signature in an outgoing message.
        if (usage == WSPasswordCallback.SIGNATURE) {
            // Logic to get the private key password for given alias
            if ("serviceks".equals(id)) {
                pwcb.setPassword("serviceks");
            } else if ("clientks".equals(id)) {
                pwcb.setPassword("clientks");
            }
        }
    }
}
