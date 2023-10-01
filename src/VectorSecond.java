import java.util.Random;

public class VectorSecond {
    private double x;
    private double y;
    private double z;
    private static final String NAME_OF_VECTOR = "This is a 3d vector";

    public VectorSecond(double x, double y,double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length(){
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double dotProd(VectorSecond vector){
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public VectorSecond sumOfVectors(VectorSecond vector){
        return new VectorSecond(x + vector.x, y + vector.y, z + vector.z);
    }
    public VectorSecond subtractOfVectors(VectorSecond vector){
        return new VectorSecond(x - vector.x, y - vector.y, z - vector.z);
    }

    public static VectorSecond[] randVector(int N){
        Random random = new Random();
        VectorSecond[] mas = new VectorSecond[N];
        for(int i = 0; i < mas.length; i++ ){
            mas[i] = new VectorSecond(random.nextDouble(), random.nextDouble(), random.nextDouble());
        }
        return mas;
    }
    public void compare(VectorSecond vector){
        if(this.length() > vector.length()){
            System.out.println("v1 > v2");
        } else {
            System.out.println("v1 < v2");
        }
    }
    public void info(){
        System.out.println("X is: " + x + " \n" + "Y is: " + y + " \n" + "Z is: " + z);
        System.out.println(NAME_OF_VECTOR);
    }
}