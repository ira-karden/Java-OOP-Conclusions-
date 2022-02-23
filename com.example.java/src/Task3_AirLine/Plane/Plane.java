package Task3_AirLine.Plane;

import Task3_AirLine.PlaneCatalog.PlaneCatalog;

import java.util.Objects;

public abstract class Plane {
    private PlaneCatalog name;
    private int seats;
    private double loadCapacity;
    private double flightRange;
    private double fuelKgInHour;

    public Plane (PlaneCatalog name, int seats, double loadCapacity, double flightRange, double fuelKgInHour){
        this.name = name;
        this.seats = seats;
        this.loadCapacity = loadCapacity;
        this.flightRange = flightRange;
        this.fuelKgInHour = fuelKgInHour;

    }

    public PlaneCatalog getName() {
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

    @Override
    public String toString() {
        return "Plane type: "+ name.getName() +"\n"+"Max number of seats : "+seats+"\n"+"Max load capacity : "+loadCapacity+"\n"+"Max flight range : "+flightRange+"\n"+"Avg fuel in kg on hour : "+fuelKgInHour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return seats == plane.seats && Double.compare(plane.loadCapacity, loadCapacity) == 0 && Double.compare(plane.flightRange, flightRange) == 0 && Double.compare(plane.fuelKgInHour, fuelKgInHour) == 0 && name == plane.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, seats, loadCapacity, flightRange, fuelKgInHour);
    }
}
