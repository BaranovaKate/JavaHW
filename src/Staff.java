import java.util.Date;
public class Staff extends Information {
    Date endOfDocument;
    String staffName;
    public Staff (int numOfDocument, Date dateOfDocument,Date endOfDocument,String staffName) {
        super(numOfDocument, dateOfDocument);
        this.endOfDocument = endOfDocument;
        this.staffName = staffName;
    }
    public Staff() {
        numOfDocument = 6;
        dateOfDocument = new Date();
        endOfDocument = new Date();
        staffName = "Alexey Olegovich";
    }
    public void info(){
        super.info();
        System.out.println("Date is " + endOfDocument);
        System.out.println("Name is " + staffName);

    }
}