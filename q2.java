import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter the height of the triangle : ");
        double height = input.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaInch = areaCm / (2.54 * 2.54);

    System.out.println("The Area of the triangle in sq in is " +areaInch+" and sq cm is "+areaCm);

    }
}