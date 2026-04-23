import java.util.Scanner;

public class q9 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the student fee: ");
        float fee = input.nextFloat();
        System.out.print("Enter the university discount percentage: ");
        float discountPercent = input.nextFloat();
        float discount = fee * (discountPercent / 100);
        float finalFee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }    
}