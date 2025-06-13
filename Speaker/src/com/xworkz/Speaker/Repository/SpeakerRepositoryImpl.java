package com.xworkz.Speaker.Repository;

import com.xworkz.Speaker.Dto.SpeakerDto;
import com.xworkz.Speaker.Utils.JdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class SpeakerRepositoryImpl implements SpeakerRepository {
    public SpeakerRepositoryImpl() {
        System.out.println("Constructor in SpeakerRepositoryImpl");
    }
    LocalDate localDate=LocalDate.now();
    @Override
    public String persist(SpeakerDto speakerDto) {
        System.out.println("Persist method in SpeakerRepositoryImpl");

        try {
            Class.forName(JdbcConnection.driverName);
            Connection connection = DriverManager.getConnection(
                    JdbcConnection.url, JdbcConnection.userName, JdbcConnection.password
            );

            if (connection == null) {
                System.err.println("Database is not connected");
                return "failed";
            }

            System.out.println("Database connection established");

            Statement statement = connection.createStatement();

            String query = "INSERT INTO speaker_table VALUES (" +
                    "0, '" + speakerDto.getBrand() + "', '" + speakerDto.getSpeakerType() + "', " +
                    speakerDto.getPrice() + ", " + speakerDto.getWirelessRange() + ", '" +
                    speakerDto.getColor() + "', '" + speakerDto.getBluetooth() + "', '" +
                    localDate + "')";


            int rows = statement.executeUpdate(query);

            connection.close();

            if (rows > 0) {
                System.out.println("Speaker details saved in DB");
                return "success";
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Add the MySQL connector JAR file to the project.");
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
        }

        System.out.println("Speaker details not saved in DB");
        return "failed";
    }

}
