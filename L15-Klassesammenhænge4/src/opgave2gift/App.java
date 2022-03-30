package opgave2gift;

public class App {
    public static void main(String[] args) {
        // Opretter Personsobjekter
        Person person1 = new Person("Peter", 24);
        Person person2 = new Person("Rikke", 23);
        // Opretter Gaver
        Gift gift1 = new Gift("En traktor", person1);
        Gift gift2 = new Gift("En Computer", person2);
        Gift gift3 = new Gift("En Prut", person1);
        // Sætter prisen på gaver
        gift1.setPrice(500);
        gift2.setPrice(300);

        // Tilføjer gaver til personer
        person1.addGifts(gift1);
        person2.addGifts(gift2);
        System.out.println(person1.getSumOfGiftsPrice());
        System.out.println(person2.getSumOfGiftsPrice());

        System.out.println(person1.getPersonGifts());

    }
}
