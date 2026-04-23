import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int max = 10;
        int digit[] = new int[max];
        int index = 0;

        while (number != 0) {
            if (index == max) {
                max = max * 2;
                int temp[] = new int[max];

                for (int i = 0; i < digit.length; i++) {
                    temp[i] = digit[i];
                }
                digit = temp;
            }

            digit[index++] = number % 10;
            number = number / 10;
        }

        int max1 = 0, max2 = 0;

        for (int i = 0; i < index; i++) {
            if (digit[i] > max1) {
                max2 = max1;
                max1 = digit[i];
            } else if (digit[i] > max2 && digit[i] != max1) {
                max2 = digit[i];
            }
        }

        System.out.println("Largest = " + max1);
        System.out.println("Second Largest = " + max2);
    }
}