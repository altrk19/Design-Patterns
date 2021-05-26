package bridge.after.sounddevice;

public class Speaker implements SoundDevice {
    @Override
    public void playSound(String ses) {
        System.out.println("Speaker plays sound : " + ses);
    }
}
