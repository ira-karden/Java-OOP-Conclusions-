package Task1_Salad.run;

import Task1_Salad.Salad.DietSalad;
import Task1_Salad.Salad.Salad;
import Task1_Salad.Salad.SpringSalad;
import Task1_Salad.Vegetable.type.*;
import Task1_Salad.Vegetable.Vegetable;
import Task1_Salad.VegetableTools.VegetableCaloriesSorter;
import Task1_Salad.VegetableTools.VegetablePicker;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        VegetableCaloriesSorter sorter1 = new VegetableCaloriesSorter();
        VegetablePicker picker = new VegetablePicker();
        Vegetable[] salad1 = new Vegetable[]{new Tomato(350),new Cucumber(220),new Redis(270),new Bell_pepper(180),new Spinach(10)};


        System.out.println("---------------------- SALAD Spring Salad LITE--------------------------------------------");

        Salad saladLite = new SpringSalad(new Vegetable[]{new Tomato(350),new Cucumber(220)});
        System.out.println(saladLite);

        System.out.println("-----------------------SPRING SALAD-----------------------------------------");
        SpringSalad springSalad1 = new SpringSalad();
        springSalad1.createSalad();

        System.out.println("-----------------------Preparing DIET SALAD--------------------------------");
        Arrays.sort(salad1, sorter1);
        System.out.println("SORTED VEGETABLES FOR CALORIES:");
        System.out.println(" ");
        for (Vegetable v : salad1){
            System.out.println(v.getName()+" "+v.getKcal_100gr());
        }
        System.out.println(" ");
        System.out.println("PICKER LOW CALORIES VEGETABLES FOR DIET SALAD:");
        Vegetable[] VegetablesLowCalories = picker.getVegetablesLowCalories(salad1);
        for (Vegetable v: VegetablesLowCalories){
            System.out.println(v.getName()+", "+v.getKcal_100gr());
        }
        System.out.println(" ");
        System.out.println("-----------------------DIET SALAD-----------------------------------------");
        Salad dietSalad1 = new DietSalad(VegetablesLowCalories);
        System.out.println(dietSalad1);

    }
}
