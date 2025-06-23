package com.xworkz.AnnualEvent.Utils;

import lombok.Getter;

@Getter
public enum JdbcConnection {

    DRIVER("com.mysql.cj.jdbc.Driver"),
    URL("jdbc:mysql://localhost:3306/Barbie"),
    USERNAME ("root"),
    SECRET("Shivani@1234");

    private final String property;


    JdbcConnection(String property){
        this.property = property;
    }
}
