abstract class Shape {
    int d1, d2;

    public Shape(int d1, int d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    abstract void printArea();
}

class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        super(length, width);
    }

    void printArea() {
        int area = d1 * d2;
        System.out.println("Rectangle Area: " + area);
    }
}

class Triangle extends Shape {
    public Triangle(int base, int height) {
        super(base, height);
    }

    void printArea() {
        float area = 0.5f * d1 * d2;
        System.out.println("Triangle Area: " + area);
    }
}

class Circle extends Shape {
    public Circle(int radius) {
        super(radius, 0);
    }

    void printArea() {
        float area = (float) Math.PI * d1 * d1;
        System.out.println("Circle Area: " + area);
    }
}

public class AbstractShape {
    public static void main(String[] args) {
        System.out.println("CHETHANA.C(1BM23CS077)");
        Rectangle r1 = new Rectangle(10, 5);
        Triangle t1 = new Triangle(10, 8);
        Circle c1 = new Circle(7);

        r1.printArea();
        t1.printArea();
        c1.printArea();
    }
}
