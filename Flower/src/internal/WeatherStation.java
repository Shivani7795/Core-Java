package internal;

public interface WeatherStation {
    void measureTemperature();
    void measureHumidity();
    void measurePressure();
    void predictRainfall();
    void issueWarnings();
    void recordWindSpeed();
    void updateForecast();
    void analyzeData();
    void shareReport();
}
