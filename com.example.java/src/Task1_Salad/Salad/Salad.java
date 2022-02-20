package Task1_Salad.Salad;

import Task1_Salad.Vegetable.Vegetable;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public abstract class Salad implements ISalad{
    private Vegetable[]vegetables;
    private String salad;
    double saladCalories;
    public Salad(Vegetable[] vegetables) {
        this.vegetables = vegetables;
        setSalad(saladIngrigiens(vegetables));
        setSaladCalories(kcalCounter(vegetables));

    }
    public Salad(){

    }

    public String getSalad() {
        return salad;
    }

    public void setSalad(String salad) {
        this.salad = salad;
    }

    public String saladIngrigiens(Vegetable[]vegetables){
        for (int i = 0; i < vegetables.length; i++){
            vegetables[i].getName().name();
            salad = salad + ", "+vegetables[i].getName();
        }
        return salad;
    }

    @Override
    public String toString() {
        return "Salad ingredients: "+ "\n"+salad.replace("null,", "").trim()+"\n"+"Total calories: "+ getSaladCalories();
    }

    public double kcalCounter(Vegetable[] vegetables){
        for (Vegetable v : vegetables ){
            saladCalories = saladCalories+ v.getTotalKcal();
        }
        return saladCalories;
    }

    public double getSaladCalories() {
        return (double) Math.round(saladCalories*100)/100;
    }

    public void setSaladCalories(double saladCalories) {
        this.saladCalories = saladCalories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salad salad1 = (Salad) o;
        return Double.compare(salad1.saladCalories, saladCalories) == 0 && Arrays.equals(vegetables, salad1.vegetables) && salad.equals(salad1.salad);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(salad, saladCalories);
        result = 31 * result + Arrays.hashCode(vegetables);
        return result;
    }
}
