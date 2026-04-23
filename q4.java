public class q4 {
    public static void main(String[] args){
        int costprice,sellingprice;
        costprice = 129;
        sellingprice = 191;
        int profit =sellingprice - costprice;
        float profitpercentage = (float)profit/costprice *100;
        System.out.println("The Cost Price is INR "+costprice+"and Selling Price is INR "+ sellingprice);
        System.out.println("The Profit is INR "+profit+"and the Profit Percentage is INR "+profitpercentage);
    }    
}
