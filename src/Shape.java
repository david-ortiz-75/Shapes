public interface Shape {

    /**
     * Calculates the area of a shape
     * @return the area as a double
     */
    double calculateArea();

    /**
     * Calculates the perimeter of a shape
     * @return the perimeter as a double
     */
    double calculatePermieter();

    /**
     * Gets the shape type
     * @return the shape type as a String
     */
    String getShapeType();
}
