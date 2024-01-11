public class Rectangle {

    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return width * length;
    }

    public double getPerimeter() {
        return 2 * (width + length);
    }
}

class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }
}




