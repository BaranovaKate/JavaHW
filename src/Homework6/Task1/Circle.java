package Homework6.Task1;
public class Circle extends Shape {
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
    public  double calculatePerimeter(){
        return 2 * 3.14 * radius;
    }
}