package bridge.after.device;

import bridge.after.Music;
import bridge.after.musicplayer.MusicPlayer;
import bridge.after.sounddevice.SoundDevice;

public class Phone extends MusicPlayerSoundDeviceBridge {
    public Phone() {
    }

    public Phone(SoundDevice soundDevice, MusicPlayer musicPlayer) {
        super(soundDevice, musicPlayer);
    }

    @Override
    public void musicPlay(Music music) {
        System.out.println("Phone plays music");
        super.musicPlay(music);
    }
}
