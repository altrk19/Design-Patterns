package abstractfactory;

public class _Main {
    public static void main(String[] args) {
        Phone samsung = new SamsungFactory().getPhone("samsung", "4000");
        Phone apple = new AppleFactory().getPhone("apple", "5000");

        System.out.println(samsung);
        System.out.println(apple);
    }
}
