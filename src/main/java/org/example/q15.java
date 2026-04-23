import java.util.Scanner;
public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0) {
            int fact = 1;

            for (int i = 1; i <= number; i++) {
                fact *= i;
            }

            System.out.println("Factorial = " + fact);
        }
    }
}