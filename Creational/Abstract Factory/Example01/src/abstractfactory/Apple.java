package abstractfactory;

public class Apple implements Phone {
    private String name;
    private String battery;

    public Apple(String name, String battery) {
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
        return "Apple{" +
                "name='" + name + '\'' +
                ", battery='" + battery + '\'' +
                '}';
    }
}
