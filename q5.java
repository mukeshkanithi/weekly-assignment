public class q5 {
    public static void main(String[] args){
        int pens,students,remainder,sharedpens;
        pens = 14;
        students = 3;
        remainder = pens % students;
        sharedpens = pens / students;
        System.out.println("The Pen Per Student is "+sharedpens+" and the remaining pen not distributed is "+ remainder);
    }    
}
