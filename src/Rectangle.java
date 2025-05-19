public class Rectangle implements Shape {

    private double width;
    private double height;

    /**
     * Constructor to create a Rectangle object
     *
     * @param width the width of the Rectangle used to calculate area and perimeter
     * @param height the height of the Rectangle used to calculate area and perimeter
     */
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Calculates the area of a Rectangle
     *
     * @return the area of a Rectangle as a double
     */
    @Override
    public double calculateArea() {
        return width * height;
    }

    /**
     * Calculates the perimeter of a Rectangle
     *
     * @return the perimeter of a Rectangle as a double
     */
    @Override
    public double calculatePermieter() {
        return (width + height) * 2;
    }

    /**
     * Gets the shape type
     *
     * @return shape type as a String
     */
    @Override
    public String getShapeType() {
        return "Rectangle";
    }
}
