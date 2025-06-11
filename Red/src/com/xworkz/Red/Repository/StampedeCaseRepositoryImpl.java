package com.xworkz.Red.Repository;

import com.xworkz.Red.Dto.StampedeCaseDto;
import com.xworkz.Red.JDBC.JDBCConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StampedeCaseRepositoryImpl implements StampedeCaseRepository{
    @Override
    public boolean persist(StampedeCaseDto stampedeCaseDto) {
        if (stampedeCaseDto != null) {
            System.out.println("Saving to the db");
            try {
                Class.forName(JDBCConnection.driverName);
                Connection connection = DriverManager.getConnection(JDBCConnection.url, JDBCConnection.userName, JDBCConnection.password);
                String query = "insert into new_table values(0,'"+ stampedeCaseDto.getEvent() +"'," + stampedeCaseDto.getDeaths() + "," + stampedeCaseDto.getInjuries() + ",'" + stampedeCaseDto.getLocation() + "')";
                Statement statement = connection.createStatement();
                statement.executeUpdate(query);
            } catch (ClassNotFoundException | SQLException e) {
                throw new RuntimeException(e);
            }
            System.out.println("persist in repository");
            return true;
        }
        return false;
    }
}