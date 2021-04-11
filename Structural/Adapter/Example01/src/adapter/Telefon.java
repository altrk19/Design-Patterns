package adapter;

public class Telefon {
    private int volt;

    public Telefon() {
        this.volt = 5;
    }

    public int sarjEt() {
        System.out.println("Telefon calisiyor");
        return volt;
    }
}
