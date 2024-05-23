import features.MusicPlayer;
import features.implementations.IPodMusicPlayer;

public class Main {
    public static void main(String[] args) {

        MusicPlayer musicPlayer = new IPodMusicPlayer();

        musicPlayer.play();

        musicPlayer.selectMusic("Song 1");
        musicPlayer.selectMusic("Song 2");

        musicPlayer.pause();
    }
}