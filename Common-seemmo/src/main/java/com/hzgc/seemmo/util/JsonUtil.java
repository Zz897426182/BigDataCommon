package com.hzgc.seemmo.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hzgc.seemmo.bean.ImageInfo;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class JsonUtil {

    //imageInfo对象转字符串
    public static String objectToJsonString(String imagePath) {
        String imageStr = BASE64Util.getImageStr(imagePath);
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.setImageType(0);
        imageInfo.setImageId(1122);
        imageInfo.setImageData(imageStr);
        return JSON.toJSONString(imageInfo);
    }

    public static String objectToJsonString(byte[] bytes) {
        String imageStr = BASE64Util.getImageStr(bytes);
        ImageInfo imageInfo = new ImageInfo();
        imageInfo.setImageType(0);
        imageInfo.setImageId(1122);
        imageInfo.setImageData(imageStr);
        return JSON.toJSONString(imageInfo);
    }

    //字符串装jsonobject
    public static JSONObject stringToJsonObject(String result) {
        JSONObject jsonObject = JSON.parseObject(result);
        return jsonObject;
    }

    //image to byte[]
    public static byte[] fileToByteArray(String filePath) {
        byte[] bytes = null;
        ByteArrayOutputStream baos = null;
        FileInputStream fis = null;
        byte[] buffer = new byte[1024];

        try {
            File imageFile = new File(filePath);
            fis = new FileInputStream(imageFile);
            baos = new ByteArrayOutputStream();

            int len;
            while((len = fis.read(buffer)) > -1) {
                baos.write(buffer, 0, len);
            }

            bytes = baos.toByteArray();
        } catch (IOException var19) {
            var19.printStackTrace();
        } finally {
            if (null != baos) {
                try {
                    baos.close();
                } catch (IOException var18) {
                    var18.printStackTrace();
                }
            }

            if (null != fis) {
                try {
                    fis.close();
                } catch (IOException var17) {
                    var17.printStackTrace();
                }
            }

        }

        return bytes;
    }
}
