import java.util.Scanner;
public class q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0) {
            int sum1 = 0;

            for (int i = 1; i <= number; i++) {
                sum1 += i;
            }

            int sum2 = number * (number + 1) / 2;

            System.out.println("For loop sum = " + sum1);
            System.out.println("Formula sum = " + sum2);
        }
    }
}