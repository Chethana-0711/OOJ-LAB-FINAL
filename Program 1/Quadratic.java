import java.util.*;

class Quadratic {

    public static void main(String[] args) {
        
        Scanner Q = new Scanner(System.in);
        System.out.println("CHETHANA.C (1BM23CS077)");
        
        System.out.print("Enter value of a: ");
        int a = Q.nextInt();
        
        System.out.print("Enter value of b: ");
        int b = Q.nextInt();
        
        System.out.print("Enter value of  c: ");
        int c = Q.nextInt();

        
        float D= b * b - 4 * a * c;
         

       if(D>0) {
           
            double r1 = (-b + Math.sqrt(D)) / (2 * a);
            double r2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("the roots are real and distinct");
            System.out.println("The roots are = " + r1 + " and " + r2);
       } 
       else if (D == 0) {
           
            double r = -b / (2 * a);
             System.out.println("the roots are real and equal");
            System.out.println("The roots are "+ r);
        } 

        
        else {
            System.out.println("There are no real solutions.");
        } 
          
        }
}

      
