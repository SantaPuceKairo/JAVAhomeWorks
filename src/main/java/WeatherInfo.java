//gives weather forecast, receiving date, min and max temp

public class WeatherInfo {
    public String getDateForWeather(int i, int i1, int i2) {
        return "Weather Forecast for: " + i2+"/"+i1+"/"+i;
    }
    public String getMinTemp(double minTemp) {
         return "Minimal temperature: " + minTemp;
    }

    public String getMaxTemp(double maxTemp) {
        return "Maximal temperature: " + maxTemp;
    }
}