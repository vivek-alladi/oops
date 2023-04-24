package Interface.Polymorphism;


interface Shape {
    double getArea();
}

class Circle implements Shape {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.height = height;
        this.width =width;
    }

    public double getArea() {
        return width* height;
    }
}

class random {

    public void someMethod(Shape shape){
        double area = shape.getArea();
        System.out.println(area);
    }

}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(2.0, 3.0);


        random someObject = new random();
        someObject.someMethod(circle);
        someObject.someMethod(rectangle);


    }
}
