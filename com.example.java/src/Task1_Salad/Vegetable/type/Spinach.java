package Task1_Salad.Vegetable.type;

import Task1_Salad.Vegetable.Vegetable;
import Task1_Salad.Vegetable.VegetablesDirectory;

public class Spinach extends Vegetable {
    public Spinach(double weight) {
        super(VegetablesDirectory.SPINACH, VegetablesDirectory.SPINACH.getKcal_100gr(), weight);
        setTotalKcal(totalKcal(VegetablesDirectory.SPINACH.getKcal_100gr(), weight));
    }
}
