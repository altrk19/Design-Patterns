package bridge.after;


import bridge.after.device.HeadsetFizyPlayerSoundDevice;
import bridge.after.device.Phone;
import bridge.after.musicplayer.Fizy;
import bridge.after.musicplayer.Spotify;
import bridge.after.sounddevice.Headset;
import bridge.after.sounddevice.Speaker;

public class App {
    public static void main(String[] args) {
        Music music = new Music("Zeki Müren - Ah bu sarkilarin gozu kor olsun", "Oyle dudak bukup hor gozle bakma");
        HeadsetFizyPlayerSoundDevice computerHeadsetFizy = new HeadsetFizyPlayerSoundDevice();
        computerHeadsetFizy.musicPlay(music);

        System.out.println("-------------------");

        Phone phone1 = new Phone(new Headset(), new Fizy());
        phone1.musicPlay(music);
        System.out.println("/////");
        Phone phone2 = new Phone(new Speaker(), new Spotify());
        phone2.musicPlay(music);
        System.out.println("/////");
        Phone phone3 = new Phone(new Headset(), new Spotify());
        phone3.musicPlay(music);
        System.out.println("/////");
        Phone phone4 = new Phone(new Speaker(), new Fizy());
        phone4.musicPlay(music);

    }
}
