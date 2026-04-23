import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result[] = new int[4];

        int j = 0;
        for (int i = 6; i <= 9; i++) {
            result[j] = number * i;
            j++;
        }

        j = 0;
        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + result[j]);
            j++;
        }
    }
}