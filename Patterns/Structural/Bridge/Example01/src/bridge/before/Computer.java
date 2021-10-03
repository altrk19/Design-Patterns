package bridge.before;

public class Computer {
    private Speaker speaker;
    private Spotify spotify;

    public Computer() {
        this.speaker = new Speaker();
        this.spotify = new Spotify();
    }

    public Speaker getSpeaker() {
        return speaker;
    }

    public void setSpeaker(Speaker speaker) {
        this.speaker = speaker;
    }

    public Spotify getSpotify() {
        return spotify;
    }

    public void setSpotify(Spotify spotify) {
        this.spotify = spotify;
    }

    public void playMusic(Music music){
        String sound = spotify.playMusic(music);
        speaker.playSound(sound);
    }
}
