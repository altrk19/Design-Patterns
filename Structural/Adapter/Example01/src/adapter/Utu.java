package adapter;

public class Utu implements ElektrikliEvAletleri {
    private int volt;

    public Utu() {
        this.volt = 220;
    }

    @Override
    public int prizeTakVeCalistir() {
        System.out.println("Utu calisiyor");
        return volt;
    }
}
