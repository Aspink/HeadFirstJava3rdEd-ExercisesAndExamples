public class Episode {

    int seriesNumber;
    int episodeNumber;

    void play() {
        System.out.println("Playing serie " + seriesNumber);
    }
    void skipIntro() {

        System.out.println("Skipping intro...");
    }
    void skipToNext() {

        System.out.println("Loading next episode...");
    }
}
