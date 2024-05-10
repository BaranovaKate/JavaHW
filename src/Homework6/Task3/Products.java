package Homework6.Task3;
import java.util.Date;
public class Products extends Information {
    String typeOfProduct;
    int countOfProduct;
    public Products(int numOfDocument, Date dateOfDocument, String typeOfProduct, int countOfProduct) {
        super(numOfDocument, dateOfDocument);
        this.typeOfProduct = typeOfProduct;
        this.countOfProduct = countOfProduct;
    }
    public Products() {
        numOfDocument = 4;
        dateOfDocument = new Date();
        typeOfProduct = "Newspaper";
        countOfProduct = 100;
    }
    public void info(){
        super.info();
        System.out.println("Type of the product is " + typeOfProduct);
        System.out.println("Count of the product is " + countOfProduct);

    }
}