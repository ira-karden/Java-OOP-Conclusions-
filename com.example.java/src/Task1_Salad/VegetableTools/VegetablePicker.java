package Task1_Salad.VegetableTools;

import Task1_Salad.Vegetable.Vegetable;

import java.util.ArrayList;
import java.util.List;

public class VegetablePicker {
    Vegetable [] vegetablesForSorter;

    public Vegetable[] getVegetablesLowCalories(Vegetable[] vegetables){
        List <Vegetable> VegetablesLowCalories = new ArrayList<>();

        for (Vegetable v : vegetables){
            if(v.getKcal_100gr()<=20 && v.getKcal_100gr()>=0){
                VegetablesLowCalories.add(v);
            }
        }
        return VegetablesLowCalories.toArray(new Vegetable[0]);
    }
}
