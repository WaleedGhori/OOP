/**
 * abstractionClass
 */
abstract class Shape {
    public int value;
    float length;
    float width;
    float areaOfCircle;

    Shape(int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }

    abstract void draw();

    void geometry() {
        System.out.println("This is a class of geometry!");
    }

    abstract float area(float length, float width);
}

class Circle extends Shape {
    Circle(int value) {
        super(value);
    }

    int getValue() {
        return value;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }

    float areaOfCircle;

    float area(float length, float width) {
        areaOfCircle = length * width;
        return areaOfCircle;
    }
}

class Triangle extends Shape {

    Triangle(int value) {
        super(value);
    }

    int getValue() {
        return value;
    }

    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }

    float areaOfTriangle;

    float area(float length, float width) {
        areaOfTriangle = length * width;
        return areaOfTriangle;
    }
}

public class OPPSecond {
    public static void main(String[] args) {
        Circle circle = new Circle(15);
        Triangle triangle = new Triangle(66);
        System.out.println("Circle Value: " + circle.getValue());
        System.out.println("Triangle Value: " + triangle.getValue());

        circle.draw();
        triangle.draw();
        triangle.geometry();

        System.out.println("");

        float secondArea = circle.area(25, 56);
        float thirdArea = triangle.area(50, 60);

        System.out.println(secondArea);
        System.out.println(thirdArea);

    }
}
