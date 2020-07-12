//Create a class where are 3 methods and works with prices

import java.text.DecimalFormat;

public class PriceDetails {

    // Method for getting the maximum value
    public String getMax(double[] inputArray){
        double maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return "Maximum price for the product is " + maxValue + " EUR";
    }

    // Method for getting the minimum value
    public String getMin(double[] inputArray){
        double minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return "Minimum price for the product is " + minValue + " EUR";
    }

    public String getAveragePriceForProduct(double[] inputArray){

        double total = 0;

        for(int i=1;i<inputArray.length;i++){
            total = total + inputArray[i];
        }
          double avgValue = total/inputArray.length;
           DecimalFormat df = new DecimalFormat("0.00");
           return "Average price for the product is " + df.format(avgValue) + " EUR";}


}


