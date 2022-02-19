package Task1_Salad.Vegetable;

import java.util.Objects;

public abstract class Vegetable {
    private VegetablesDirectory name;
    private double kcal_100gr;
    private double weight;
    private double totalKcal;

    public Vegetable(VegetablesDirectory name, double kcal_100gr, double weight) {
        this.name = name;
        this.kcal_100gr = kcal_100gr;
        this.weight = weight;
    }

    public VegetablesDirectory getName() {
        return name;
    }

    public void setName(VegetablesDirectory name) {
        this.name = name;
    }

    public double getKcal_100gr() {
        return kcal_100gr;
    }

    public void setKcal_100gr(double kcal_100gr) {
        this.kcal_100gr = kcal_100gr;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double totalKcal (double kcal_100gr, double weight){
        totalKcal = (weight * kcal_100gr)/100;
        return totalKcal;

    }

    public void setTotalKcal(double totalKcal) {
        this.totalKcal = totalKcal;
    }

    public double getTotalKcal() {
        return totalKcal;
    }

    @Override
    public String toString() {
        return getName() +", "+getKcal_100gr()+", "+weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vegetable vegetable = (Vegetable) o;
        return Double.compare(vegetable.kcal_100gr, kcal_100gr) == 0 && Double.compare(vegetable.weight, weight) == 0 && name == vegetable.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, kcal_100gr, weight);
    }
}
