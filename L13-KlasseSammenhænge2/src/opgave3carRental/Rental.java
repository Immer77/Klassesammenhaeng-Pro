package opgave3carRental;

import java.util.ArrayList;

public class Rental {
    private int number;
    private int days;
    private String date;
    private ArrayList<Car> cars = new ArrayList<>(); //Tilføjer en arraylist af Cars eftersom den enkeltrettet UML Diagram pegede hen på biler

    //Opgave a. At multipliciteten er 0..* i begge retninger betyder at flere biler kan have flere rentals og den her er enkeltrettet mod biler

    //Constructor til at oprette en Rental objekt
    public Rental(int number, String date, int days){
        this.number = number;
        this.date = date;
        this.days = days;
    }

    //Sætter antal dage udlejningen skal være
    public void setDays(int days){
        this.days = days;
    }
    public int getDays(){
        return this.days;
    }
    // Da det er Enkeltrettet til mange associering er det en Add og ikke en set (Det gælder også for 0..* -> 0..*
    public void addCars(Car car){
        if(!cars.contains(car)){
            cars.add(car);
        }
    }
    //Tager og looper igennem alle de biler der er i Rental objektet og tager deres pris og ganger det med de dage der er blevet udlejet
    public double getPrice(){
        double result = 0;
        for (Car c : cars){
            result += c.getPricePerDay();
        }
        return result * getDays();
    }
}
