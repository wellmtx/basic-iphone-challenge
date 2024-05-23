import features.MusicPlayer;
import features.Phone;
import features.implementations.Calls;
import features.implementations.IPodMusicPlayer;

public class Main {
    public static void main(String[] args) {

        MusicPlayer musicPlayer = new IPodMusicPlayer();
        musicPlayer.play();
        musicPlayer.selectMusic("Song 1");
        musicPlayer.selectMusic("Song 2");
        musicPlayer.pause();

        Phone phone = new Calls();
        phone.call("123456789");
        phone.answer();
        phone.startVoiceMail();
    }
}