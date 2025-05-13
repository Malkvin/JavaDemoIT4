package homework_6.hospital;

public class TreatmentSimulation {
    public static void main(String[] args) {
        // Создаем объекты пациентов
        Patient patient1 = new Patient(1); // Код плана 1 (хирург)
        Patient patient2 = new Patient(2); // Код плана 2 (дантист)
        Patient patient3 = new Patient(3); // Любой другой код (терапевт)

        // Создаем терапевта
        Therapist therapist = new Therapist();

        // Присваиваем каждому пациенту своего терапевта
        therapist.setPatient(patient1);
        therapist.assignDoctor(patient1.getTreatmentPlanCode()); // Назначение врача и лечение
        System.out.println(); // Пустая строка для разделения вывода

        therapist.setPatient(patient2);
        therapist.assignDoctor(patient2.getTreatmentPlanCode()); // Назначение врача и лечение
        System.out.println(); // Пустая строка для разделения вывода

        therapist.setPatient(patient3);
        therapist.assignDoctor(patient3.getTreatmentPlanCode()); // Назначение врача и лечение
    }
}
