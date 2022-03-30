package opgave4bolig;

import java.time.LocalDate;
import java.util.ArrayList;

public class Kollegie {

    private String navn;
    private String adresse;
    private ArrayList<Bolig> boliger = new ArrayList<>();



    public Kollegie(String navn, String adresse){
        this.navn = navn;
        this.adresse = adresse;
    }
    public ArrayList<Bolig> getBoliger(){
        return new ArrayList<>(boliger);
    }

    public void addBolig(Bolig bolig){
        if(!boliger.contains(bolig)){
            boliger.add(bolig);
            bolig.setKollegie(this);
        }

    }

    public void removeBolig(Bolig bolig){
        if(boliger.contains(bolig)){
            boliger.remove(bolig);
            bolig.setKollegie(null);
        }
    }
    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getAntalLejeAftaler(){
        int antalLejeaftaler = 0;
        for(Bolig b : boliger){
            antalLejeaftaler += b.getLejeAftaler().size();
        }
        return antalLejeaftaler;
    }
    public LocalDate gennemsnitligAntalDage(){
        int days = 0;

    }
}
