import java.util.Random;

public class VectorFirst {
    private double x;
    private double y;
    private static final String NAME_OF_VECTOR  = "This is a 2d vector";

    public VectorFirst(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double length() {
        return Math.sqrt(x * x + y * y);
    }
    public double dotProd(VectorFirst vector) {
        return x * vector.x + y * vector.y;
    }
    public VectorFirst sumOfVectors(VectorFirst vector) {
        return new VectorFirst (x + vector.x, y + vector.y);
    }

    public VectorFirst substractVectors(VectorFirst vector){
        return new VectorFirst(x - vector.x, y - vector.y);
    }

    public static VectorFirst[] randVectors(int N){
        Random random = new Random();
        VectorFirst[] masVectors = new VectorFirst[N];
        for(int i = 0; i < masVectors.length; i++){
            masVectors[i] = new VectorFirst(random.nextDouble(), random.nextDouble());
        }
        return masVectors;
    }
    public void compare(VectorFirst vector){
        if(this.length() > vector.length()){
            System.out.println("v1 > v2");
        } else {
            System.out.println("v1<v2");
        }
    }
    public void info(){
        System.out.println(NAME_OF_VECTOR);
        System.out.println("X is:" + x + "\n" + "Y is: " + y);
    }
}