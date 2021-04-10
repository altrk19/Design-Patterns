package com.facade;

public class zMainNoFacade {
    public static void main(String[] args) {
        String text = "Content";

        AESEncryptor aesEncryptor = new AESEncryptor();
        aesEncryptor.encrypt(text);

        MD5Encryptor md5Encryptor = new MD5Encryptor();
        md5Encryptor.encrypt(text, "KEY");

        SHAEncryptor shaEncryptor = new SHAEncryptor();
        shaEncryptor.encrypt(text, "KEY", true);

    }
}
