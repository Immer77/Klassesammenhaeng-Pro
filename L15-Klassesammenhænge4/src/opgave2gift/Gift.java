package opgave2gift;

public class Gift {
    private String description;
    private double price;
    private Person giver;

    // Tilføjet en Enkeltrettet tvungen associering for at få en giver på gaven
    public Gift(String description, Person giver){
        this.giver = giver;
        this.description = description;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public Person getGiver(){
        return giver;
    }
    public double getPrice(){
        return this.price;
    }



}
