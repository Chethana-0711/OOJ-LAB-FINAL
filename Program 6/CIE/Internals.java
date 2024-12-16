package CIE;

public class Internals {
    public int[] internalMarks;

    public Internals(int[] marks) {
        this.internalMarks = new int[marks.length];
        System.arraycopy(marks, 0, internalMarks, 0, marks.length);
    }
}