package Homework7.Clinic;

public class Patient {
    public TreatmentPlan treatmentPlan;
    public Patient(TreatmentPlan treatmentPlan){
        this.treatmentPlan = treatmentPlan;
    }
    public TreatmentPlan getPlan(){
        return treatmentPlan;
    }
}