class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}

class Father {
    int fatherAge;

    public Father(int fatherAge) throws WrongAge {
        if (fatherAge < 0) {
            throw new WrongAge("Father's age cannot be negative.");
        }
        this.fatherAge = fatherAge;
        System.out.println("Father's Age: " + fatherAge);
    }
}

class Son extends Father {
    int sonAge;

    public Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge);
        if (sonAge > fatherAge) {
            throw new WrongAge("Son's age cannot be greater than father's age.");
        }
        this.sonAge = sonAge;
        System.out.println("Son's Age: " + sonAge);
    }
}

public class ExceptionInheritanceDemo {
    public static void main(String[] args) {
       System.out.println("CHETHANA.C(1bm23cs077)");
        try {
            Son son1 = new Son(50, 25);
            System.out.println("Successfully created son and father.");
        } catch (WrongAge e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            Son son2 = new Son(-5, 10);
        } catch (WrongAge e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        try {
            Son son3 = new Son(30, 35);
        } catch (WrongAge e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
