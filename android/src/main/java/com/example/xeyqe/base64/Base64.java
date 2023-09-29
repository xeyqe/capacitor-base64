package com.example.xeyqe.base64;

import android.util.Log;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;

public class Base64 {

    public void getBase64(String filePath, Base64Callback callback) {
        FileInputStream fis = null;
        try {
            if (filePath.contains("file://")) {
                filePath = filePath.replace("file://", "");
            }
            fis = new FileInputStream(filePath);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] b = new byte[1024];
            for (int readNum; (readNum = fis.read(b)) != -1; ) {
                bos.write(b, 0, readNum);
            }
            callback.onDone(android.util.Base64.encodeToString(bos.toByteArray(), android.util.Base64.URL_SAFE));
        } catch (Exception e) {
            callback.onError((e.getLocalizedMessage()));
        }
    }

}
