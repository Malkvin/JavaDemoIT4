package homework_6.hospital;

class Therapist extends Doctor {
    private Patient patient;

    // Метод назначения врача
    public void assignDoctor(int treatmentPlanCode) {
        if (treatmentPlanCode == 1) {
            this.patient.setDoctor(new Surgeon());
            System.out.println("Назначен Хирург");
        } else if (treatmentPlanCode == 2) {
            this.patient.setDoctor(new Dentist());
            System.out.println("Назначен Дантист");
        } else {
            this.patient.setDoctor(this);
            System.out.println("Назначен Терапевт");
        }

        // Выполняем лечение выбранного врача
        this.patient.getDoctor().heal();
    }

    public void setPatient(Patient p) {
        this.patient = p;
    }

    @Override
    public void heal() {
        System.out.println("Терапевт осматривает пациента и даёт рекомендации.");
    }
}
