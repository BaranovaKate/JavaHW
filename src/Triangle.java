public class Triangle extends Shape {
    double height;
    double sideOne;
    double sideSecond;
    double sideThird;
    public Triangle ( double height, double sideOne, double sideSecond, double sideThird){
        this.height = height;
        this.sideOne = sideOne;
        this.sideSecond = sideSecond;
        this.sideThird = sideThird;
    }
    public double calculateArea() {
        return 0.5 * sideOne * height;
    }
    public  double calculatePerimeter(){
        return sideOne + sideSecond + sideThird;

    }
}