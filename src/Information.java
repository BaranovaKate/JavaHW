import java.util.Date;
public abstract class Information implements Documents{
    int numOfDocument;
    Date dateOfDocument;
    public Information(int numOfDocument, Date dateOfDocument){
        this.numOfDocument = numOfDocument;
        this.dateOfDocument = dateOfDocument;
    }
    public Information(){
    }
    public void info(){
        System.out.println("Number of rhe document is" + numOfDocument);
        System.out.println("Date of rhe document is" + dateOfDocument);
    }
}