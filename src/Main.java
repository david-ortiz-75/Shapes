public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape(ShapeTypes.CIRCLE, 5.0);
        Shape square = ShapeFactory.getShape(ShapeTypes.SQUARE, 10.0);
        Shape rectangle = ShapeFactory.getShape(ShapeTypes.RECTANGLE, 15, 10);

        Shape[] shapes = {circle, rectangle, square};

        for (Shape shape : shapes) {

            System.out.println(shape.getShapeType());
            System.out.println(String.format("Area: %.2f", shape.calculateArea()));
            System.out.println(String.format("Perimeter: %.2f", shape.calculatePermieter()));
            System.out.println();
        }
    }
}