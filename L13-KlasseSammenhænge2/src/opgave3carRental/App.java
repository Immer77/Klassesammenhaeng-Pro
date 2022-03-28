package opgave3carRental;

public class App {
    public static void main(String[] args) {
        //Opretter 5 referencer til bil objekter
        Car c1 = new Car("C1 66 555", 2012);
        Car c2 = new Car("C2 66 555", 2013);
        Car c3 = new Car("C3 66 555", 2014);
        Car c4 = new Car("C4 66 555", 2015);
        Car c5 = new Car("C5 66 555", 2016);

        //Opretter 2 Referencer til Rental objekter
        Rental r1 = new Rental(21,"20-12-1997",5);
        Rental r2 = new Rental(22,"20-12-1997",7);

        //Sætter prisen per dag på de 2 første biler
        c1.setPricePerDay(200);
        c2.setPricePerDay(300);

        //Tilføjer bilerne til rental r1 reference til objektet
        r1.addCars(c1);
        r1.addCars(c2);
        //Printer prisen ud.
        System.out.println(r1.getPrice());
    }
}
