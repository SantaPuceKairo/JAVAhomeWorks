//Izveidojiet klasi, kurā ir 3 metodes (un katra izsaukta main metodē), kas darbojas ar: ar cenām

public class MainPrice {
    public static void main(String[] args) {

        Price minPrice = new Price();
        String priceMin = minPrice.getMinPriceForProduct(13.15);
        System.out.println(priceMin);

        Price maxPrice = new Price();
        String priceMax = maxPrice.getMaxPriceForProduct(18.98);
        System.out.println(priceMax);

        Price avgPrice = new Price();
        String priceAvg = avgPrice.getAveragePriceForProduct(13.15, 18.98);
        System.out.println(priceAvg);

    }
}
