package Task3_AirLine.PlaneCatalog;

public enum PlaneCatalog {
    AIRBUS_A320("Airbus A320", 149, 73500,  3717, 2100),
    AIRBUS_A330("Airbus A330", 440, 120300,  11900, 5900),
    BOEING_767("Boeing 767", 252, 40310,  4000, 4550),
    BOEING_737("Boeing 737", 140, 52800,  2518, 2180),
    BOEING_777("Boeing 777", 235, 242600,  7406, 6100);

   private String name;
   private int seats;
   private double loadCapacity;
   private double flightRange;
   private double fuelKgInHour;

    PlaneCatalog(String name, int seats, double loadCapacity, double flightRange, double fuelKgInHour){
        this.name = name;
        this.seats = seats;
        this.loadCapacity = loadCapacity;
        this.flightRange = flightRange;
        this.fuelKgInHour = fuelKgInHour;

    }

    public String getName() {
        return name;
    }

    public int getSeats() {
        return seats;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public double getFlightRange() {
        return flightRange;
    }

    public double getFuelKgInHour() {
        return fuelKgInHour;
    }
}
