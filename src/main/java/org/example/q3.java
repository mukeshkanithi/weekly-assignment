import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int digit[] = new int[10];
        int index = 0;

        while (number != 0 && index < 10) {
            digit[index++] = number % 10;
            number = number / 10;
        }

        int max = 0, second = 0;

        for (int i = 0; i < index; i++) {
            if (digit[i] > max) {
                second = max;
                max = digit[i];
            } else if (digit[i] > second && digit[i] != max) {
                second = digit[i];
            }
        }

        System.out.println("Largest = " + max);
        System.out.println("Second Largest = " + second);
    }
}