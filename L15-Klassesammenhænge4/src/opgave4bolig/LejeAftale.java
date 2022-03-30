package opgave4bolig;

import java.time.LocalDate;
import java.util.Arrays;

public class LejeAftale {
    private LocalDate fraDato;
    private LocalDate tilDato;
    private Lejer[] lejers = new Lejer[2];

    LejeAftale(Bolig bolig, LocalDate fraDato){
        this.fraDato = fraDato;
        tilDato = null;
    }

    public void addLejer1(Lejer lejer){
        if(lejers[0] == lejer){

        }else {
            lejers[0] = lejer;
        }
    }

    public void addlejer2(Lejer lejer){
        if(lejers[1] == lejer){

        }else{
            lejers[1] = lejer;
        }
    }

    public void removeLejer1(Lejer lejer){
        if(lejers[0] != null){
            lejers[0] = null;
        }
    }
    public void removeLejer2(Lejer lejer){
        if(lejers[1] != null){
            lejers[1] = null;
        }
    }

    public Lejer[] getLejers() {
        return Arrays.copyOf(lejers,2);
    }

    @Override
    public String toString(){
        return "\nLejer 1: " + lejers[0].getNavn() + " Lejer 2: " + lejers[1].getNavn();
    }

    public void setTilDato(LocalDate dato){
        this.tilDato = dato;
    }

}
