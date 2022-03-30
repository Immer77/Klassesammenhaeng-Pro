package opgave2gift;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private ArrayList<Gift> gifts = new ArrayList<>();

    public Person(String name, int age){
        this.age = age;
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString(){
        return this.name + " " + this.age;
    }

    /**
     * Pre: Gaven skal ikke være modtaget af andre
     * // Enkeltrettet til mange associering Add, Remove og Get metoder
     * @param gift
     */
    public void addGifts(Gift gift){
        if(!gifts.contains(gift)){
            gifts.add(gift);

        }
    }

    public void removeGifts(Gift gift){
        if(gifts.contains(gift)){
            gifts.remove(gift);
        }
    }
    public ArrayList<Gift> getGifts(){
        return new ArrayList<>(gifts);
    }

    /**
     * Returner summen af prisen på gaverne
     * @return
     */
    public double getSumOfGiftsPrice(){
        double result = 0.0;
        for (Gift g : gifts){
            result += g.getPrice();
        }
        return result;
    }

    /**
     * Returnerer listen af folk der har givet en gave
     * @return
     */
    public ArrayList<Person> getPersonGifts(){
        ArrayList<Person> givers = new ArrayList<>();
        for (Gift g : gifts){
            givers.add(g.getGiver());
        }
        return givers;
    }
}
