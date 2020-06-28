//izdrukā laika prognozi, saņemot datumu, minimālo un maksimālo temperatūru

public class WeatherDetails {
    public String getDateForWeather(int i, int i1, int i2) {
        return "Weather Forecast for: " + i2+"/"+i1+"/"+i;
    }
    public String getMinTemp(int minTemp) {
        return "Minimal temperature: " + minTemp;
    }

    public String getMaxTemp(int maxTemp) {
        return "Maximal temperature: " + maxTemp;
    }
}


