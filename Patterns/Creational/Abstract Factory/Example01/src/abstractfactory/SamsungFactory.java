package abstractfactory;

public class SamsungFactory implements PhoneFactory {
    @Override
    public Phone getPhone(String name, String battery) {
        return new Samsung(name, battery);
    }
}
