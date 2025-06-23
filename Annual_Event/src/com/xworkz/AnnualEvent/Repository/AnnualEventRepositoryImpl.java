package com.xworkz.AnnualEvent.Repository;

import com.xworkz.AnnualEvent.Dto.AnnualEventDto;
import com.xworkz.AnnualEvent.Utils.JdbcConnection;

import java.sql.*;
import java.util.Optional;

public class AnnualEventRepositoryImpl implements AnnualEventRepository{
    AnnualEventDto annualEventDto = new AnnualEventDto();

    public AnnualEventRepositoryImpl(){
        System.out.println("constructor in RepoImpl");
    }
    @Override
    public boolean persist(AnnualEventDto annualEventDto) {
        if (annualEventDto != null) {
            try {
                Class.forName(JdbcConnection.DRIVER.getProperty());
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }

                String query = "INSERT INTO event_details(institute_name, location, guest_name, event_date, chairs, bookedTime) VALUES (?, ?, ?, ?, ?, ?)";

                try (Connection connection = DriverManager.getConnection(
                        JdbcConnection.URL.getProperty(),
                        JdbcConnection.USERNAME.getProperty(),
                        JdbcConnection.SECRET.getProperty());
                     PreparedStatement pstatement = connection.prepareStatement(query)) {

                    pstatement.setString(1, annualEventDto.getInstituteName());
                    pstatement.setString(2, annualEventDto.getLocation());
                    pstatement.setString(3, annualEventDto.getGuestName());
                    pstatement.setDate(4, java.sql.Date.valueOf(annualEventDto.getEDate()));
                    pstatement.setInt(5, annualEventDto.getChairs());
                    pstatement.setTimestamp(6, annualEventDto.getBookedTime());

                    int result = pstatement.executeUpdate();
                } catch (SQLException e) {
                System.out.println("Failed to save in DB: " + e.getMessage());
                throw new RuntimeException(e);
            }
        }
        return false;
    }
    @Override
    public Optional<AnnualEventDto> findId(int eventId) {
        System.out.println("findById method in ConcertRepoImpl");
        try {
            Class.forName(JdbcConnection.DRIVER.getProperty());
            Connection connection = DriverManager.getConnection(
                    JdbcConnection.URL.getProperty(),
                    JdbcConnection.USERNAME.getProperty(),
                    JdbcConnection.SECRET.getProperty()
            );
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM event_details WHERE id=" + eventId;
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                String instituteName = resultSet.getString("institute_name");
                String location = resultSet.getString("location");
                String guestName = resultSet.getString("guest_name");
                Date eDate = resultSet.getDate("event_date");
                int chairs = resultSet.getInt("chairs");
                Timestamp bookedTime = resultSet.getTimestamp("bookedTime");

                AnnualEventDto annualEventDto = new AnnualEventDto();
                annualEventDto.setInstituteName(instituteName);
                annualEventDto.setLocation(location);
                annualEventDto.setGuestName(guestName);
                annualEventDto.setEDate(eDate.toLocalDate());
                annualEventDto.setChairs(chairs);
                annualEventDto.setBookedTime(bookedTime);

                return Optional.of(annualEventDto);
            }

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error in findId: " + e.getMessage());
        }
        return Optional.empty();
    }
}

