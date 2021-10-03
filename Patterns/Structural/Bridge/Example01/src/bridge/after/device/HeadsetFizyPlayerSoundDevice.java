package bridge.after.device;

import bridge.after.Music;
import bridge.after.musicplayer.Fizy;
import bridge.after.sounddevice.Headset;

public class HeadsetFizyPlayerSoundDevice extends MusicPlayerSoundDeviceBridge {
    public HeadsetFizyPlayerSoundDevice() {
        soundDevice = new Headset();
        musicPlayer = new Fizy();
    }

    @Override
    public void musicPlay(Music music) {
        System.out.println("Computer is working");
        super.musicPlay(music);
    }
}
