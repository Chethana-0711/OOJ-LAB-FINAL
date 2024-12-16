



import java.util.Scanner;
import CIE.Student;
import CIE.Internals;
import SEE.External;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Student[] students = new Student[n];
        Internals[] internals = new Internals[n];
        External[] externals = new External[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details of student " + (i + 1) + ":");
            System.out.print("USN: ");
            String usn = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Semester: ");
            int sem = scanner.nextInt();
            scanner.nextLine();

            students[i] = new Student(usn, name, sem);

            System.out.print("Enter 5 internal marks: ");
            int[] internalMarks = new int[5];
            for (int j = 0; j < 5; j++) {
                internalMarks[j] = scanner.nextInt();
            }
            scanner.nextLine();
            internals[i] = new Internals(internalMarks);

            System.out.print("Enter 5 external marks: ");
            int[] externalMarks = new int[5];
            for (int j = 0; j < 5; j++) {
                externalMarks[j] = scanner.nextInt();
            }
            scanner.nextLine();
            externals[i] = new External(usn, name, sem, externalMarks);
        }

        System.out.println("\nStudent Details:");

        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.println("USN: " + students[i].usn);
            System.out.println("Name: " + students[i].name);
            System.out.println("Semester: " + students[i].sem);
            System.out.print("Internal Marks: ");
            for (int j = 0; j < 5; j++) {
                System.out.print(internals[i].internalMarks[j] + " ");
            }
            System.out.println();

            System.out.print("External Marks: ");
            for (int j = 0; j < 5; j++) {
                System.out.print(externals[i].externalMarks[j] + " ");
            }
            System.out.println();

            System.out.println("Final Marks (External average): " + externals[i].calculateFinalMarks());
            System.out.println();
        }

        
    }
}
