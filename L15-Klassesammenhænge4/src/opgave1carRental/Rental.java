package opgave1carRental;

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


    public void setDays(int days){
        this.days = days;
    }
    public int getDays(){
        return this.days;
    }

    public void addCars(Car car){ //Tilføjer en bil til rentals
        if(!cars.contains(car)){ // Hvis den ikke indeholder bilen
            cars.add(car); // Tilføjer bilen til cars
            car.addRental(this); // og i samme omgang
        }
    }
    public void removeRental(Car car){ // Fjerner en bil fra rentals
        if(cars.contains(car)){ // Tjekker om cars indeholder bilen
            cars.remove(car); //Fjerner car fra cars
            car.removeCar(this); // I samme omgang fjerne man også
        }
    }

    public double getPrice(){
        double result = 0;
        for (Car c : cars){
            result += c.getPricePerDay();
        }
        return result * getDays();
    }
}
