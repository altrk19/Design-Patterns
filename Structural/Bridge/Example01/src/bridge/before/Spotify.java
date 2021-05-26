package bridge.before;

public class Spotify {

    public String  playMusic(Music music){
        System.out.println("Spotify plays " + music.getName());
        return music.getSound(); //it sends sound to speaker
    }
}
