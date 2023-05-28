public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
    Rectangle myRectangle = new Rectangle(3.0, 4.0);
System.out.println("My rectangle has a width of " + myRectangle.getWidth() + " and a height of " + myRectangle.getHeight() + ".");
        System.out.println("The area of my rectangle is " + myRectangle.calculateArea() + " and the perimeter is " + myRectangle.calculatePerimeter() + ".");
        myRectangle.setWidth(5.0);
        myRectangle.setHeight(6.0);
        System.out.println("My rectangle now has a width of " + myRectangle.getWidth() + " and a height of " + myRectangle.getHeight() + ".");
        System.out.println("The area of my rectangle is " + myRectangle.calculateArea() + " and the perimeter is " + myRectangle.calculatePerimeter() + ".");