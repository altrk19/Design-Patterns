package com;

import com.facade.EncType;
import com.facade.EncryptorFacade;

public class MainWithFacade {
    public static void main(String[] args) {
        String text = "Content";
        EncryptorFacade encryptorFacade = new EncryptorFacade();
        encryptorFacade.encrypt(text,EncType.SHA);
        encryptorFacade.encrypt(text,EncType.AES);
        encryptorFacade.encrypt(text,EncType.MD5);
    }
}
//Yazılım componentini kullanan istemci için bir arayüz gibi çalışır. Katmanlar arası bağımlılıkları azaltmak için kullanabilir.
//Örnek verecek olursak, üçüncü parti kütüphaneleri kullanan bir paket, soyutlamayı sağlamak için son kullanıcıya bir arayüz sunar ve biz sadece bu arayüz ile muhattap oluruz