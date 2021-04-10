package abstractfactory;

public class Samsung implements Phone {
    private String name;
    private String battery;

    public Samsung(String name, String battery) {
        this.name = name;
        this.battery = battery;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getBattery() {
        return battery;
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "name='" + name + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }
}
