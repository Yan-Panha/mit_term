public class Main {
    public static void main(String[] args) {
        // Creating a Rectangle
        Rectangle rectangle = new Rectangle(5.0, 5.0);
        System.out.println("Rectangle Area: " + rectangle.getArea());
        System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());

        // Creating a Square
        Square square = new Square(5.0);
        System.out.println("Square Area: " + square.getArea());
        System.out.println("Square Perimeter: " + square.getPerimeter());
    }

    }
 G