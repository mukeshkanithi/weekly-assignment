import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int digit[] = new int[10];
        int index = 0;

        while (number != 0) {
            digit[index++] = number % 10;
            number = number / 10;
        }

        for (int i = 0; i < index; i++) {
            System.out.print(digit[i]);
        }
    }
}