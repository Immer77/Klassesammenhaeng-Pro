package opgave5klassesammenhænge;

import java.util.ArrayList;

public class Episode {
    private int number;
    private ArrayList<String> guestActors;
    private int lengthMinutes;

    public Episode(int number, ArrayList<String> guestActors, int lengthMinutes){
        this.number = number;
        this.guestActors = guestActors;
        this.lengthMinutes = lengthMinutes;

    }

    public int getNumber(){
        return this.number;
    }

    public int getLengthMinutes(){
        return this.lengthMinutes;
    }

    public ArrayList<String> getGuestActors(){
        return this.guestActors;
    }
}
