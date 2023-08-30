import java.util.Date;
public class Finance extends Information {
    double finalSum;
    int codeOgDepartment;
    public Finance(int numOfDocument, Date dateOfDocument, double finalSum, int codeOgDepartment) {
        super(numOfDocument, dateOfDocument);
        this.finalSum = finalSum;
        this.codeOgDepartment = codeOgDepartment;
    }
    public Finance() {
        numOfDocument = 5;
        dateOfDocument = new Date();
        finalSum = 200.45;
        codeOgDepartment = 153801;
    }
    public void info(){
        super.info();
        System.out.println("Sum is " + finalSum);
        System.out.println("Code is " + codeOgDepartment);

    }
}