package abstractfactory;

public interface PhoneFactory {
    Phone getPhone(String name, String battery);
}
