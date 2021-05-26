package bridge.after.musicplayer;

import bridge.after.Music;
import bridge.after.musicplayer.MusicPlayer;

public class Fizy implements MusicPlayer {
    @Override
    public String playMusic(Music music) {
        System.out.println("Fizy plays the " + music);
        return music.getSound();
    }
}
