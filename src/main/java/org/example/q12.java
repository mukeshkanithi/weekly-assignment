import java.util.Scanner;
public class q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0) {
            int sum1 = 0;
            int i = 1;

            while (i <= number) {
                sum1 += i;
                i++;
            }

            int sum2 = number * (number + 1) / 2;

            System.out.println("While loop sum = " + sum1);
            System.out.println("Formula sum = " + sum2);
        }
    }
}