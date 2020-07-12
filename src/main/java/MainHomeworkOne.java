public class MainHomeworkOne {

    public static void main(String[] args) {
//Course info
        CourseInfo detailsDate = new CourseInfo();
        String date = detailsDate.getDate(2020, 07, 16);
        System.out.println(" ");
        System.out.println("**************INFORMATION ABOUT COURSE**************");
        System.out.println(" ");
        System.out.println(date);


        CourseInfo detailsTime = new CourseInfo();
        String time = detailsTime.getTime(12.15);
        System.out.println(time);

        CourseInfo detailsLesson = new CourseInfo();
        String lesson = detailsLesson.getCourse("Programming in Java");
        System.out.println(lesson);

        //Weather Info
        WeatherInfo detailsForWeatherDate = new WeatherInfo();
        String forecastDate = detailsForWeatherDate.getDateForWeather(2020, 07, 16);
        System.out.println(" ");
        System.out.println("**********************FORECAST**********************");
        System.out.println(" ");
        System.out.println(forecastDate);

        WeatherInfo detailsMinTemp = new WeatherInfo();
        String minTemp = detailsMinTemp.getMinTemp(15.7);
        System.out.println(minTemp);

        WeatherInfo detailsMaxTemp = new WeatherInfo();
        String maxTemp = detailsMaxTemp.getMaxTemp(28.3);
        System.out.println(maxTemp);


//Price info

        System.out.println(" ");
        System.out.println("**********************PRODUCT PRICE**********************");
        System.out.println(" ");
        double array[] = new double[]{10.11, 11.32, 12.33, 13.0, 9.11, 12.10};
        PriceDetails priceArrayMin = new PriceDetails();
        String minPrice = priceArrayMin.getMin(array);
        System.out.println(minPrice);

        PriceDetails priceArrayMax = new PriceDetails();
        String maxPrice = priceArrayMax.getMax(array);
        System.out.println(maxPrice);

        PriceDetails avgPrice = new PriceDetails();
        String priceAvg = avgPrice.getAveragePriceForProduct(array);
        System.out.println(priceAvg);

    }
}















