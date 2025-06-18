package com.xworkz.Speaker.Repository;

import com.xworkz.Speaker.Dto.SpeakerDto;
import com.xworkz.Speaker.Utils.JdbcConnection;

import java.sql.*;
import java.time.LocalDate;
import java.util.Optional;

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
                    speakerDto.getColor() + "', '" + speakerDto.getBluetooth() + "', NOW())";

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

        @Override
        public Optional<SpeakerDto> findByBrandAndType(String brand, String speakerType) {
            System.out.println("findByBrandAndType in SpeakerRepositoryImpl");

            try {
                Class.forName(JdbcConnection.DriverName.getProperty());
                Connection connection = DriverManager.getConnection(
                        JdbcConnection.Url.getProperty(),
                        JdbcConnection.UserName.getProperty(),
                        JdbcConnection.Password.getProperty()
                );

                Statement statement = connection.createStatement();

                String query = "SELECT * FROM speaker_table WHERE brand='" + brand + "' AND speaker_type='" + speakerType + "'";

                ResultSet resultSet = statement.executeQuery(query);

                while (resultSet.next()) {
                    double price = resultSet.getDouble("price");
                    double wirelessRange = resultSet.getDouble("wireless_range");
                    String color = resultSet.getString("color");
                    String bluetooth = resultSet.getString("bluetooth");
                    LocalDate manufactureDate = resultSet.getDate("ManufactureDate").toLocalDate();

                    SpeakerDto dto = new SpeakerDto(
                            brand,
                            speakerType,
                            price,
                            wirelessRange,
                            color,
                            bluetooth,
                            manufactureDate
                    );
                    return Optional.of(dto);
                }

            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Error fetching data: " + e.getMessage());
            }

            return Optional.empty();
        }
    }
    }

}
