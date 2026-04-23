import java.util.Scanner;
public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int max = 10;
        int factor[] = new int[max];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {

                if (index == max) {
                    max = max * 2;
                    int temp[] = new int[max];

                    for (int j = 0; j < factor.length; j++) {
                        temp[j] = factor[j];
                    }
                    factor = temp;
                }

                factor[index] = i;
                index++;
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.println(factor[i]);
        }
    }
}