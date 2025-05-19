public class ShapeFactory {
    /**
     * Returns a Shape instance based on a given type
     *
     * @param type an enum specifying the shape (CIRCLE,SQUARE,RECTANGLE)
     * @param params the dimensions of the shape
     * @return a Shape object
     * @throws IllegalArgumentException if an incorrect shape type is provided
     */
    public static Shape getShape(ShapeTypes type, double... params) {
        switch (type) {
            case CIRCLE:
                return new Circle(params[0]);
            case SQUARE:
                return new Square(params[0]);
            case RECTANGLE:
                return new Rectangle(params[0],params[1]);
            default:
                throw new IllegalArgumentException("Unknown shape type");
        }
    }
}
