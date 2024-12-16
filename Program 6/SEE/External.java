package SEE;

import CIE.Student;
import CIE.Internals;

public class External extends Student {
    public int[] externalMarks = new int[5];

    public External(String usn, String name, int sem, int[] marks) {
        super(usn, name, sem);
        System.arraycopy(marks, 0, externalMarks, 0, marks.length);
    }
public int calculateFinalMarks() {
        int totalMarks = 0;
        for (int i = 0; i < 5; i++) {
            totalMarks += externalMarks[i];
        }
        return totalMarks / 2;
    }
}