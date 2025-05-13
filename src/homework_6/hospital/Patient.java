package homework_6.hospital;

class Patient {
    private int treatmentPlanCode;
    private Doctor doctor;

    public Patient(int planCode) {
        this.treatmentPlanCode = planCode;
    }

    public int getTreatmentPlanCode() {
        return treatmentPlanCode;
    }

    public void setTreatmentPlanCode(int code) {
        this.treatmentPlanCode = code;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor d) {
        this.doctor = d;
    }
}
