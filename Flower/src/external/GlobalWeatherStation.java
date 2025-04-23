package external;

import internal.WeatherStation;

public class GlobalWeatherStation implements WeatherStation {
    public void measureTemperature() {
        System.out.println("Temperature measured by Global Weather Station.");
    }
    public void measureHumidity() {
        System.out.println("Humidity measured by Global Weather Station.");
    }
    public void measurePressure() {
        System.out.println("Pressure measured by Global Weather Station.");
    }
    public void predictRainfall() {
        System.out.println("Rainfall predicted by Global Weather Station.");
    }
    public void issueWarnings() {
        System.out.println("Warnings issued by Global Weather Station.");
    }
    public void recordWindSpeed() {
        System.out.println("Wind speed recorded by Global Weather Station.");
    }
    public void updateForecast() {
        System.out.println("Forecast updated by Global Weather Station.");
    }
    public void analyzeData() {
        System.out.println("Data analyzed by Global Weather Station.");
    }
    public void shareReport() {
        System.out.println("Report shared by Global Weather Station.");
    }
}
