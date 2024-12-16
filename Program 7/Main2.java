interface Polygon {
  
    default double getPerimeter() {
        
       return calculatePerimeter();
    }

    
    double getArea();

   
    double calculatePerimeter();
}


class Rectangle implements Polygon {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

   
    public double getArea() {
        return length * width;
    }


    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}


class Circle implements Polygon {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    public double getArea() {
        return Math.PI * radius * radius;
    }

   
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Polygon rectangle = new Rectangle(5, 3);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        Polygon circle = new Circle(4);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
         System.out.println("Chethana c 1bm23cs077");
    }
}