package features.implementations;

import features.MusicPlayer;

public class IPodMusicPlayer implements MusicPlayer {
    @Override
    public void play() {
        System.out.println("Playing music from iPod");
    }

    @Override
    public void pause() {
        System.out.println("Pausing music from iPod");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("Selecting music from iPod: " + music);
    }
}
