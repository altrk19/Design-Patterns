package abstractfactory;

public class AppleFactory implements PhoneFactory {
    @Override
    public Phone getPhone(String name, String battery) {
        return new Apple(name, battery);
    }
}
