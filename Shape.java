package Lessons.Exercise.InheritanceOverload;

public class Shape {
    String shapeName;
    int numberOfEdges;

    public Shape(){
        shapeName = "Undefined shape";
        System.out.println("Shape object is created.");
    }

    public Shape(double radius){
        shapeName = "Circle:";
        System.out.println("Circle object is created.");
    }

    public Shape(int edges, double edgeLength){
        shapeName = "Square:";
        numberOfEdges = edges;
        System.out.println("Square object is created.");
    }

    public Shape(int edges, double a1, double a2){
        shapeName = "Rectangle:";
        numberOfEdges = edges;
        System.out.println("Rectangle object is created.");
    }

    public Shape(int edges, double e1,double e2,double e3){
        shapeName = "Triangle:";
        numberOfEdges = edges;
        System.out.println("Triangle object is created.");
    }

    public String getShapeDetails(){
        return shapeName + " " + numberOfEdges;
    }


}
