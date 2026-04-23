public class q7 {
    public static void main(String[] args){
        double r_km, r_miles;
        double volumeofsphere_km, volumeofsphere_miles;
        double pi = 3.14159;

        r_km = 6378; 
        r_miles = r_km / 1.6;

        volumeofsphere_km = (4.0/3.0) * pi * r_km * r_km * r_km;
        volumeofsphere_miles = (4.0/3.0) * pi * r_miles * r_miles * r_miles;

        System.out.printf("The volume of earth in cubic kilometers is %.2f and cubic miles is %.2f", volumeofsphere_km, volumeofsphere_miles);
    }    
}