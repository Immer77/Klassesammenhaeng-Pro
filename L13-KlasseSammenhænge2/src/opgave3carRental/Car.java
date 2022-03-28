package opgave3carRental;

public class Car {
    private String license;
    private double pricePerDay;
    private int purchaseYear;

    //Car constructor
    public Car(String license, int purchaseYear){
        this.license = license;
        this.purchaseYear = purchaseYear;
    }

    // Sætter price per dag
    public void setPricePerDay(double price){
        this.pricePerDay = price;
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
