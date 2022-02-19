package Task1_Salad.Vegetable.type;

import Task1_Salad.Vegetable.Vegetable;
import Task1_Salad.Vegetable.VegetablesDirectory;

public class Redis extends Vegetable {
    public Redis(double weight) {
        super(VegetablesDirectory.REDIS, VegetablesDirectory.REDIS.getKcal_100gr(), weight);
        setTotalKcal(totalKcal(VegetablesDirectory.REDIS.getKcal_100gr(), weight));
    }
}
