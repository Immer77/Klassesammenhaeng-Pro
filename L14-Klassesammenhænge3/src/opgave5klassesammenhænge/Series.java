package opgave5klassesammenhænge;

import java.util.ArrayList;

public class Series {
    private String title;
    private ArrayList<String> cast;
    private final ArrayList<Episode> episodes = new ArrayList<>();

    public ArrayList<Episode> getEpisodes() {
        return new ArrayList<>(episodes);
    }

    public Series(String title, ArrayList<String> cast) {
        this.title = title;
        this.cast = cast;

    }

    public Episode createEpisode(int number, ArrayList<String> guestActors, int lengthMinutes) {
        Episode episode = new Episode(number, guestActors, lengthMinutes);
        episodes.add(episode);
        return episode;
    }

    public void removeEpisode(Episode episode) {
        episodes.remove(episode);
    }

    // Opgave 5.3
    public int totalLength() {
        int sumOfMinutes = 0;
        for (Episode e : episodes) {
            sumOfMinutes += e.getLengthMinutes();
        }
        return sumOfMinutes;
    }

    public ArrayList<String> getGuestActors() {
        ArrayList<String> actors = new ArrayList<>();
        for (Episode e : episodes) {
            actors.addAll(e.getGuestActors());
        }
        return actors;
    }

    public String getTitle() {
        return this.title;
    }

    public ArrayList<String> getCast() {
        return this.cast;
    }
}
