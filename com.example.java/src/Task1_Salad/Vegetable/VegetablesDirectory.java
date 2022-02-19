package Task1_Salad.Vegetable;

public enum VegetablesDirectory {
    TOMATO("Tomato", 18.0),
    CUCUMBER("Cucumber", 15.0),
    BELL_PEPPER("Bell_pepper", 27.0),
    REDIS("Redis", 20.0),
    SPINACH("Spinach", 23.0);
    String name;
    double kcal_100gr;
    VegetablesDirectory(String name, double kcal_100gr){
        this.name = name;
        this.kcal_100gr = kcal_100gr;
    }

    public double getKcal_100gr() {
        return kcal_100gr;
    }
    @Override
    public String toString() {
        return name;
    }
}
