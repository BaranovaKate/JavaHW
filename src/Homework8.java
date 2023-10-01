public class Homework8 {
    public static void main(String[] args) {
        VectorFirst vectorFirst2D = new VectorFirst(3.0, 5.0);
        VectorFirst vectorSecond2D = new VectorFirst(2.0, 1.0);

        System.out.println("First vector: ");
        vectorFirst2D.info();

        System.out.println("Second vector: ");
        vectorSecond2D.info();

        System.out.println("Dot product of 2D vectors is: " + vectorFirst2D.dotProd(vectorSecond2D));
        VectorFirst sum = vectorFirst2D.sumOfVectors(vectorSecond2D);
        VectorFirst substract = vectorFirst2D.substractVectors(vectorSecond2D);
        System.out.println("Sum of 2D vectors is: " + sum.length());
        System.out.println("Subs of 2D vectors is: " + substract.length());
        vectorFirst2D.compare(vectorSecond2D);

        VectorFirst[] rand2DVectors = VectorFirst.randVectors(2);
        for(VectorFirst vect : rand2DVectors){
            vect.info();
        }

        VectorSecond vectorFirst3D = new VectorSecond(3.0, 2.0, 4.0);
        VectorSecond vectorSecond3D = new VectorSecond(2.0, 2.0, 3.0);

        System.out.println("First 3D vector: ");
        vectorFirst3D.info();

        System.out.println("Second 3D vector: ");
        vectorSecond3D.info();

        System.out.println("Dot product of 3D vectors: " + vectorFirst3D.dotProd(vectorSecond3D));

        VectorSecond sumVectors = vectorFirst3D.sumOfVectors(vectorSecond3D);
        VectorSecond subVectors = vectorFirst3D.subtractOfVectors(vectorSecond3D);
        System.out.println("Sum of 3D vectors is: " + sumVectors.length());
        System.out.println("Sub of 3D vectors is: " + subVectors.length());

        vectorFirst3D.compare(vectorSecond3D);

        VectorSecond[] rand3DVectors = VectorSecond.randVector(2);
        for(VectorSecond v : rand3DVectors){
            v.info();
        }
    }
}