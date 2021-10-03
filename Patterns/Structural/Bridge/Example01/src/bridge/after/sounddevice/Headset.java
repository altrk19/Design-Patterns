package bridge.after.sounddevice;

import bridge.after.sounddevice.SoundDevice;

public class Headset implements SoundDevice {
    @Override
    public void playSound(String ses) {
        System.out.println("Headset plays sound : " + ses);
    }
}
