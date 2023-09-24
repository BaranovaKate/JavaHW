package Homework6.Task1;
public class Rectangle extends Shape {
    double sideOne;
    double sideSecond;
    public Rectangle ( double sideOne, double sideSecond){
        this.sideOne = sideOne;
        this.sideSecond = sideSecond;
    }
    public double calculateArea() {
        return sideOne * sideSecond;
    }
    public  double calculatePerimeter(){
        return (sideOne + sideSecond) * 2;
    }
}