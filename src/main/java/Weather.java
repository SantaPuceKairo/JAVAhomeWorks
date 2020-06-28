//izdrukā laika prognozi, saņemot datumu, minimālo un maksimālo temperatūru

public class Weather {
    public static void main(String[] args) {

        WeatherDetails detailsForWeatherDate = new WeatherDetails();
        String forecastDate = detailsForWeatherDate.getDateForWeather(2020, 12, 16);
        System.out.println(forecastDate);

        WeatherDetails detailsMinTemp = new WeatherDetails();
        String minTemp = detailsMinTemp.getMinTemp(15);
        System.out.println(minTemp);

        WeatherDetails detailsMaxTemp = new WeatherDetails();
        String maxTemp = detailsMaxTemp.getMaxTemp(30);
        System.out.println(maxTemp);

    }
}
