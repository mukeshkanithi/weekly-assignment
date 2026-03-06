import java.util.Scanner;
public class level1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int harrysyob,presentyear;
        int age;
        System.out.print("Enter the yob of harry :");
        harrysyob = sc.nextInt();//year of birth of harry
        System.out.print("Enter the present year :");
        presentyear = sc.nextInt();//enter 2024
        age = presentyear - harrysyob;
        System.out.println("Harrys age is"+age);
    }
}
