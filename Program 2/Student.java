import java.util.*;

class Student {
    String usn;
    String name;
    int totsub;
    int[] credits;
    int[] marks;

  
    public Student(int totsub) {
        this.totsub = totsub;
        credits = new int[totsub];
        marks = new int[totsub];
    }

    public void accept() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter USN:");
        usn = in.nextLine();

        System.out.println("Enter Name:");
        name = in.nextLine();

        for (int i = 0; i < totsub; i++) {
            System.out.println("Enter credits for subject " + (i + 1) + ":");
            credits[i] = in.nextInt();
            System.out.println("Enter marks for subject " + (i + 1) + ":");
            marks[i] = in.nextInt();
        }
    }

    
    public void display() {
        System.out.println("\nStudent Details:");
        System.out.println("USN: " + usn);
        System.out.println("NAME: " + name);

        for (int i = 0; i < totsub; i++) {
            System.out.println("Subject " + (i + 1) + " -> Credits: " + credits[i] + ", Marks: " + marks[i]);
        }

      
        System.out.printf("SGPA: %.2f\n", calculateSGPA());
    }

   
    public double calculateSGPA() {
        double totcredits = 0;
        double totpoints = 0;

     
        for (int i = 0; i < totsub; i++) {
            totcredits += credits[i];
            totpoints += marks[i] * credits[i];
        }

        return totpoints / totcredits;
    }

    public static void main(String[] args) {
        System.out.println("CHETHANA.C (1BM23CS077)");

      
        Scanner inn = new Scanner(System.in);
        
        
        System.out.println("Enter total number of subjects:");
        int totsub = inn.nextInt();

        Student S1 = new Student(totsub);
        S1.accept();
        S1.display();

    
        Student S2 = new Student(totsub);
        S2.accept();
        S2.display();

      
    }
}

       
   













     
     