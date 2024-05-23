import features.MusicPlayer;
import features.Navigator;
import features.Phone;
import features.implementations.Calls;
import features.implementations.Firefox;
import features.implementations.IPodMusicPlayer;
import features.implementations.Safari;

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

        Navigator safari = new Safari();
        Navigator firefox = new Firefox();

        safari.showPage("www.google.com");
        safari.openNewTab();
        safari.refreshPage();

        firefox.showPage("www.google.com");
        firefox.openNewTab();
        firefox.refreshPage();
    }
}