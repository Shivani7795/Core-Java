package com.xworkz.encapsulation.external;

import com.xworkz.encapsulation.internal.KeyChain;

public class ExternalKeyChain {

        public void readKeyChainDetails() {
            KeyChain keyChain = new KeyChain();

            System.out.println("Material: " + keyChain.getMaterial());
            System.out.println("Shape: " + keyChain.getShape());
            System.out.println("Key Count: " + keyChain.getKeyCount());
            System.out.println("Is Personalized: " + keyChain.isPersonalized());
            System.out.println("Price: " + keyChain.getPrice());
        }
    }

