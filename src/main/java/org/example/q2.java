import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age[] = new int[3];
        int height[] = new int[3];

        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextInt();
        }

        int minAge = age[0];
        int maxHeight = height[0];
        int minIndex = 0, maxIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (age[i] < minAge) {
                minAge = age[i];
                minIndex = i;
            }
            if (height[i] > maxHeight) {
                maxHeight = height[i];
                maxIndex = i;
            }
        }

        String name[] = {"Amar", "Akbar", "Anthony"};

        System.out.println("Youngest = " + name[minIndex]);
        System.out.println("Tallest = " + name[maxIndex]);
    }
}