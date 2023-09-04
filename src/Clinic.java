public class Clinic {
    public Doctor surgeon;
    public Doctor therapist;
    public Doctor dentist;
    public Clinic(){
        surgeon = new Surgeon();
        therapist = new Therapist();
        dentist = new Dentist();
    }
    public void treatByCode(Patient patient){
        int treatCode = patient.getPlan().getCode();
        if(treatCode == 1){
            surgeon.treat();
        } else if(treatCode == 2){
            dentist.treat();
        } else {
            therapist.treat();
        }
    }
}