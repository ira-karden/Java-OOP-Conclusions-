package Task1_Salad.Vegetable.type;

import Task1_Salad.Vegetable.Vegetable;
import Task1_Salad.Vegetable.VegetablesDirectory;

public class Cucumber extends Vegetable {

    public Cucumber(double weight) {
        super(VegetablesDirectory.CUCUMBER, VegetablesDirectory.CUCUMBER.getKcal_100gr(), weight);
        setTotalKcal(totalKcal(VegetablesDirectory.CUCUMBER.getKcal_100gr(), weight));
    }
}
