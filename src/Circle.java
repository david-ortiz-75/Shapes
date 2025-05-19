public class Circle implements Shape {

    private double radius;

    /**
     * Constructor to create a Circle object
     *
     * @param radius the radius of the circle used to calculate area and perimeter
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates the area of a circle
     *
     * @return the area of a circle as a double
     */
    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    /**
     * Calculates the perimeter of a circle
     *
     * @return the perimeter of a circle as a double
     */
    @Override
    public double calculatePermieter() {
        return 2 * Math.PI * this.radius;
    }

    /**
     * Gets the shape type
     *
     * @return shape type as a String
     */
    @Override
    public String getShapeType() {
        return "Circle";
    }
}
