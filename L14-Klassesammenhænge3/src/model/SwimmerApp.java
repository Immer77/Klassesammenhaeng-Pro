package model;

import java.util.ArrayList;

public class SwimmerApp {
    
    public static void main(String[] args) {

        TrainingPlan trainingPlan = new TrainingPlan('B', 16,10);

        ArrayList<Double> lapTimes = new ArrayList<>();
        lapTimes.add(1.02);
        lapTimes.add(1.01);
        lapTimes.add(0.99);
        lapTimes.add(0.98);
        lapTimes.add(1.02);
        lapTimes.add(1.04);
        lapTimes.add(0.99);
        Swimmer s1 = new Swimmer("Jan", 1994, lapTimes, "AGF");



        lapTimes = new ArrayList<>();
        lapTimes.add(1.05);
        lapTimes.add(1.01);
        lapTimes.add(1.04);
        lapTimes.add(1.06);
        lapTimes.add(1.08);
        lapTimes.add(1.04);
        lapTimes.add(1.02);
        Swimmer s2 = new Swimmer("Bo", 1995, lapTimes, "Lyseng");



        // Opgave 4
        Swimmer sv2 = trainingPlan.createSwimmers("Peter",1997,lapTimes,"Bedsted");
        Swimmer sv1 = trainingPlan.createSwimmers("Alex",1997,lapTimes,"Aarhus");


        for(Swimmer s : trainingPlan.getSwimmers()){
            System.out.println(s);
        }

        trainingPlan.removeSwimmers(sv1);
        for(Swimmer s : trainingPlan.getSwimmers()){
            System.out.println(s);
        }
    }
}
