public class Square implements Shape {

    private double side;

    /**
     * Constructor to create a Square object
     *
     * @param side the side of the Square used to calculate area and perimeter
     */
    public Square(double side) {
        this.side = side;
    }

    /**
     * Calculates the area of a Square
     *
     * @return the area of a Square as a double
     */
    @Override
    public double calculateArea() {
        return side * side;
    }

    /**
     * Calculates the perimeter of a Square
     *
     * @return the perimeter of a Square as a double
     */
    @Override
    public double calculatePermieter() {
        return side * 4;
    }

    /**
     * Gets the shape type
     *
     * @return shape type as a String
     */
    @Override
    public String getShapeType() {
        return "Square";
    }
}