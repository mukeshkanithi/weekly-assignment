public class q6 {
    public static void main(String[] args){
        float studentfees, discountedfees;
        studentfees = 125000;
        discountedfees = studentfees * 0.10f;
        studentfees = studentfees - discountedfees;
        
        System.out.println("The discount amount is INR " + discountedfees + " and final discounted fee is INR " + studentfees);
    }    
}