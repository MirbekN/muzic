public class MusicPlayer {
    private Music music;

    public MusicPlayer(Music music){
    this.music=music;
}


    @Override
    public String toString() {
        return "MusicPlayer{" +
                "music=" + music +
                '}';
    }
}
