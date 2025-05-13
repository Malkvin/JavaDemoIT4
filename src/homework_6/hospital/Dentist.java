package homework_6.hospital;

class Dentist extends Doctor {
    @Override
    public void heal() {
        System.out.println("Дантист лечит зубы");
    }
}
