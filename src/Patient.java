public class Patient {
    public TreatmentPlan treatmentPlan;
    public Patient(TreatmentPlan treatmentPlan){
        this.treatmentPlan = treatmentPlan;
    }
    public TreatmentPlan getPlan(){
        return treatmentPlan;
    }
}