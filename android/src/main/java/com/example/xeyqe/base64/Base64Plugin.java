package com.example.xeyqe.base64;

import com.getcapacitor.JSObject;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;
import com.getcapacitor.annotation.CapacitorPlugin;

@CapacitorPlugin(name = "Base64")
public class Base64Plugin extends Plugin {

    private Base64 implementation = new Base64();


    @PluginMethod
    public void getBase64(PluginCall call) {
        Base64Callback resultCallback = new Base64Callback() {
            @Override
            public void onDone(String base64) {
                call.resolve(new JSObject().put("base64", base64));
            }

            @Override
            public void onError(String message) {
                call.reject(message);
            }
        };
        String path = call.getString("path");

        implementation.getBase64(path, resultCallback);
    }

}
