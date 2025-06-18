package com.xworkz.Speaker.Utils;

import lombok.Getter;

public class JdbcConnection {
    private JdbcConnection()
    {
        System.out.println("Jdbc connection constructor");
    }
import lombok.Getter;

    @Getter
    public enum JdbcConnection {
    UserName("root"),
    Url("jdbc:mysql://localhost:3306/Weather")
    Password("Shivani@1234")
    DriverName("com.mysql.cj.jdbc.Driver");
}
