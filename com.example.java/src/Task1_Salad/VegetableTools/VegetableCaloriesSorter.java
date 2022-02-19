package Task1_Salad.VegetableTools;

import Task1_Salad.Vegetable.Vegetable;

import java.util.Comparator;

public class VegetableCaloriesSorter implements Comparator<Vegetable> {

    @Override
    public int compare(Vegetable o1, Vegetable o2) {
        return Double.compare(o1.getKcal_100gr(), o2.getKcal_100gr());
    }
}
