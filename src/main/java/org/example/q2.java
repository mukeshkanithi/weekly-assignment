import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number[] = new int[5];

        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }

        for (int i = 0; i < number.length; i++) {
            if (number[i] > 0) {
                if (number[i] % 2 == 0) {
                    System.out.println(number[i] + " is positive even");
                } else {
                    System.out.println(number[i] + " is positive odd");
                }
            } else if (number[i] < 0) {
                System.out.println(number[i] + " is negative");
            } else {
                System.out.println("zero");
            }
        }

        if (number[0] == number[4]) {
            System.out.println("First and last are equal");
        } else if (number[0] > number[4]) {
            System.out.println("First is greater");
        } else {
            System.out.println("Last is greater");
        }
    }
}