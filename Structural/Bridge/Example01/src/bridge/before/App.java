package bridge.before;

public class App {
    public static void main(String[] args) {
        Music music = new Music("Zeki Müren - Ah bu sarkilarin gozu kor olsun", "Oyle dudak bukup hor gozle bakma");
        Computer computer = new Computer();
        computer.playMusic(music);
    }
}
