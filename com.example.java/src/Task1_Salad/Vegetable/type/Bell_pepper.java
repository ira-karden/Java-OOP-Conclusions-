package Task1_Salad.Vegetable.type;

import Task1_Salad.Vegetable.Vegetable;
import Task1_Salad.Vegetable.VegetablesDirectory;

public class Bell_pepper extends Vegetable {
    public Bell_pepper(double weight) {
        super(VegetablesDirectory.BELL_PEPPER, VegetablesDirectory.BELL_PEPPER.getKcal_100gr(), weight);
        setTotalKcal(totalKcal(VegetablesDirectory.BELL_PEPPER.getKcal_100gr(), weight));
    }
}
