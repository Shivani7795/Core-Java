package com.xworkz.barbie.repository;

import com.xworkz.barbie.dto.ProductDto;
import com.xworkz.barbie.utils.JdbcConnection;
import java.sql.Connection;
import java.sql.DriverManager;

public class ProductRepositoryImpl implements ProductRepository {
    public ProductRepositoryImpl() {
        System.out.println("running no-arg in productRepositoryImpl");
    }
    @Override
    public boolean persist(ProductDto productDto) {
        System.out.println("running in persisting productImplementation");
        try {
            Class.forName(JdbcConnection.driverName);
            Connection connection = DriverManager.getConnection(JdbcConnection.url, JdbcConnection.userName, JdbcConnection.password);
            if (connection != null) {
                System.out.println("database connection successfull");
                return true;
            } else {
                System.out.println("database connection failed");
            return false;
            }
        }catch (Exception e) {
            e.printStackTrace();
            return false;

        }
    }
}
