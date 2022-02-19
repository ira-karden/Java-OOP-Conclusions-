package Task1_Salad.Vegetable.type;

import Task1_Salad.Vegetable.Vegetable;
import Task1_Salad.Vegetable.VegetablesDirectory;

public class Tomato extends Vegetable {
    public Tomato(int weight) {
        super(VegetablesDirectory.TOMATO, VegetablesDirectory.TOMATO.getKcal_100gr(), weight);
        setTotalKcal(totalKcal(VegetablesDirectory.TOMATO.getKcal_100gr(), weight));
    }


}
