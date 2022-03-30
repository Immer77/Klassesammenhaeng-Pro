package opgave4bolig;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        Kollegie kollegie = new Kollegie("Sønderhøj", "30");
        Kollegie kollegie2 = new Kollegie("Sønderhøj", "30");
        Bolig bolig = new Bolig(55,"Villeruo",5400,kollegie);
        LejeAftale lejeAftale = new LejeAftale(bolig, LocalDate.now());
        Lejer lejer1 = new Lejer("Peter", "Datamatiker");
        Lejer lejer2 = new Lejer("Anne", "Pædagog");

        lejeAftale.addLejer1(lejer1);
        lejeAftale.addlejer2(lejer2);
        kollegie.addBolig(bolig);


    }
}
