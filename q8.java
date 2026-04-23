import java.util.Scanner;
public class q8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double km,miles;
        System.out.print("Enter the kilometes : ");
        km = input.nextDouble();
        miles = km / 1.6f;
        System.out.println("The total miles is : "+miles+" mile for the given"+km+"km");
    }
}
