public class Register {
    Documents[] documents = new Documents[10];
    int count = 0;
    public void saveInfo(Documents d){
        if(count < 10){
            documents[count] = d;
            count++;
        }
    }
    public void getInfo(int index) {
        if(index < 10){
            documents[index].info();
        } else {
            System.out.println("error");
        }
    }
}