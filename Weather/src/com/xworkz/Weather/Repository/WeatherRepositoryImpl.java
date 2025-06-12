package com.xworkz.Weather.Repository;

import com.xworkz.Weather.Dto.WeatherDto;
import com.xworkz.Weather.Utils.JDBCConnection;

import java.sql.*;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class WeatherRepositoryImpl implements WeatherRepository{
    public WeatherRepositoryImpl() {
        System.out.println("constructor in WeatherRepository");
    }
    @Override
    public String persist(WeatherDto weatherDto) {
        System.out.println("persist method in WeatherRepository implementation");
        try{
            Class.forName(JDBCConnection.driverName);
            Connection connection = DriverManager.getConnection(JDBCConnection.url, JDBCConnection.userName, JDBCConnection.password);
            if(connection==null)
            {
                System.err.println("Database is not connected");
                return "failed";
            }
            System.out.println("Database connection established");
            Statement statement=connection.createStatement();
            LocalTime localTime = LocalTime.now();

            String query = "INSERT INTO climate_table VALUES (" +
                    "0, '" + weatherDto.getPlaceName() + "', '" + weatherDto.getWeather() + "', " +
                    weatherDto.getMinTemp() + ", " + weatherDto.getMaxTemp() + ", '" +
                    weatherDto.getCloudy() + "', '" + weatherDto.getRaining() + "', " +
                    weatherDto.getRainMm() + ", " + weatherDto.getHumidity() + ", " +
                    weatherDto.getWindSpeed() + ", '" + weatherDto.getSunrise() + "', '" +
                    weatherDto.getSunset() + "', '" + weatherDto.getMoonrise() + "', '" +
                    weatherDto.getMoonset() + "', '" + weatherDto.getRainStart() + "', '" +
                    weatherDto.getRainEnd() + "', " + weatherDto.getPrecipitation() + ", '" +
                    localTime + "')";

            int row=statement.executeUpdate(query);
            if(row>0)
            {
                System.out.println("Details saved in DB");
                return "success";
            }
            connection.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Add the mysql connector jar file");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Details not saved in DB");
        return "failed";
    }
}
