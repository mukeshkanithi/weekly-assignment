import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number[] = new double[10];
        double total = 0.0;
        int index = 0;

        while (true) {
            double value = sc.nextDouble();

            if (value <= 0 || index == 10) {
                break;
            }

            number[index] = value;
            index++;
        }

        for (int i = 0; i < index; i++) {
            total += number[i];
            System.out.println(number[i]);
        }

        System.out.println("Total = " + total);
    }
}