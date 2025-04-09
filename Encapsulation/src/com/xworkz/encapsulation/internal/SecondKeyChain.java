package com.xworkz.encapsulation.internal;

public class SecondKeyChain {

    public void modifyKeychain() {
        KeyChain keyChain = new KeyChain();

        keyChain.setMaterial("Metal");
        keyChain.setShape("Heart");
        keyChain.setKeyCount(4);
        keyChain.setIsPersonalized(true);
        keyChain.setPrice(299.99);

        System.out.println("Material: " + keyChain.getMaterial());
        System.out.println("Shape: " + keyChain.getShape());
        System.out.println("Key Count: " + keyChain.getKeyCount());
        System.out.println("Is Personalized: " + keyChain.isPersonalized());
        System.out.println("Price: " + keyChain.getPrice());
    }
}