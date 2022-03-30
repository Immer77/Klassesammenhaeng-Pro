package opgave4bolig;

import java.time.LocalDate;
import java.util.ArrayList;

public class Bolig {
    private int kvm;
    private String adresse;
    private int prisPrMaaned;
    private ArrayList<LejeAftale> lejeAftaler = new ArrayList<>();
    private Kollegie kollegie;

    public Bolig(int kvm, String adresse, int prisPrMaaned, Kollegie kollegie){
        this.kvm = kvm;
        this.adresse = adresse;
        this.prisPrMaaned = prisPrMaaned;
        this.kollegie = kollegie;
    }

    public ArrayList<LejeAftale> getLejeAftaler(){
        return new ArrayList<>(lejeAftaler);
    }

    public LejeAftale createLejeAftale(LocalDate date){
        LejeAftale lejeAftale = new LejeAftale(this, date);
        lejeAftaler.add(lejeAftale);
        return lejeAftale;
    }

    public void removeLejeAftale(LejeAftale lejeAftale){
        if(lejeAftaler.contains(lejeAftale)){
            lejeAftaler.remove(lejeAftale);
        }
    }

    public int getKvm() {
        return kvm;
    }

    public void setKvm(int kvm) {
        this.kvm = kvm;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getPrisPrMaaned() {
        return prisPrMaaned;
    }

    public void setPrisPrMaaned(int prisPrMaaned) {
        this.prisPrMaaned = prisPrMaaned;
    }
    public void setKollegie(Kollegie kollegie){
        if(this.kollegie != kollegie){
            Kollegie oldKollegie = this.kollegie;
            if(oldKollegie != null){
                oldKollegie.removeBolig(this);
            }
            this.kollegie = kollegie;
            if(kollegie != null){
                kollegie.addBolig(this);
            }
        }
    }
}
