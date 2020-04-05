package com.eujian.jasypt;

import org.jasypt.util.text.BasicTextEncryptor;

public class Main {
    public static void main(String[] args) {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        //加密所需的salt(盐)
        textEncryptor.setPassword("81*(!@92*");
        //要加密的数据（数据库的用户名或密码）
        String username = textEncryptor.encrypt("root");
        String password = textEncryptor.encrypt("test");
        System.out.println("demo.username:"+username);
        System.out.println("demo.password:"+password);
    }
}
