package Lessons.Exercise.InheritanceOverload;

public class Main {
    public static void main(String[] args) {
        Shape undefined = new Shape();

        Shape circle = new Shape(5.50);

        Shape square = new Shape(4,2);

        Shape rectangle = new Shape (4,2.15,2.15);

        Shape triangle = new Shape(3,1.5,1.5,1.5);


        String undefinedShape = undefined.getShapeDetails();
        String circleShape = circle.getShapeDetails();
        String squareShape = square.getShapeDetails();
        String rectangleShape = rectangle.getShapeDetails();
        String triangleShape = triangle.getShapeDetails();

        System.out.println(undefinedShape);
        System.out.println(circleShape);
        System.out.println(squareShape);
        System.out.println(rectangleShape);
        System.out.println(triangleShape);
    }
}
