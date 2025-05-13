package homework_6.hospital;

class Surgeon extends Doctor {
    @Override
    public void heal() {
        System.out.println("Хирург делает операцию");
    }
}
