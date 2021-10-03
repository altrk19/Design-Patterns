package bridge.after.device;

import bridge.after.Music;
import bridge.after.musicplayer.MusicPlayer;
import bridge.after.sounddevice.SoundDevice;

public abstract class MusicPlayerSoundDeviceBridge {
    protected SoundDevice soundDevice;
    protected MusicPlayer musicPlayer;

    public MusicPlayerSoundDeviceBridge() {
    }

    public MusicPlayerSoundDeviceBridge(SoundDevice soundDevice, MusicPlayer musicPlayer) {
        this.soundDevice = soundDevice;
        this.musicPlayer = musicPlayer;
    }

    void musicPlay(Music music){
        String sound = musicPlayer.playMusic(music);
        soundDevice.playSound(sound);
    }
}
