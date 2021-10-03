package bridge.after.musicplayer;

import bridge.after.Music;

public class Spotify implements MusicPlayer {
    @Override
    public String playMusic(Music music) {
        System.out.println("Spotify plays the " + music);
        return music.getSound();
    }
}
