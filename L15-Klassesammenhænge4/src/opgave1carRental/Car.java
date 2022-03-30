package opgave1carRental;

import java.util.ArrayList;

public class Car {
    private String license;
    private double pricePerDay;
    private int purchaseYear;
    private ArrayList<Rental> rentals = new ArrayList<>();

    //Car constructor
    public Car(String license, int purchaseYear){
        this.license = license;
        this.purchaseYear = purchaseYear;
    }

    // Sætter price per dag
    public void setPricePerDay(double price){
        this.pricePerDay = price;
    }

    public void addRental(Rental rental){ //Add rental hvis man vil koble et rental objekt på en bil
        if(!rentals.contains(rental)){ // hvis det rental objekt ikke er i rentals
            rentals.add(rental); //Tilføjer rental til rentals
            rental.addCars(this); // I samme omgang når det er dobbeltrettet skal vi også tilføje det til cars
        }
    }

    public void removeCar(Rental rental){ //Fjerner en bil fra rental
        if(rentals.contains(rental)){ //Hvis den indeholder rental
            rentals.remove(rental); // Fjerner vi det fra bil objektet
            rental.removeRental(this); // Fjerner det nuværende objekt af car fra rental eks. Car1.removeRental <-
        }

    }

    public int returnLongestRentalPeriod(){
        int result = 0;
        for (Rental r : rentals){
            if(result < r.getDays()){
                result = r.getDays();
            }
        }
        return result;
    }

    public double getPricePerDay(){
        return this.pricePerDay;
    }
    public String getLicense(){
        return this.license;
    }
    public int getPurchaseYear(){
        return this.purchaseYear;
    }
}
