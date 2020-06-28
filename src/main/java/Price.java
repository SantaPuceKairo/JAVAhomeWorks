//Izveidojiet klasi, kurā ir 3 metodes (un katra izsaukta main metodē), kas darbojas: ar cenām

public class Price {

    public String getMinPriceForProduct(double min){return "Min price for the product is " + min + " EUR";}

    public String getMaxPriceForProduct(double max){return "Max price for the product is " + max + " EUR";}

    public String getAveragePriceForProduct(double min, double max){
        double avg = (min + max)/2;
        return "Average price for the product is " + avg + " EUR";}

}


