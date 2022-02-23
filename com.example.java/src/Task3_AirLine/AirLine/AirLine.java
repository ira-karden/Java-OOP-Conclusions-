package Task3_AirLine.AirLine;

import Task3_AirLine.Plane.Plane;

import java.util.Arrays;
import java.util.Objects;

public class AirLine implements IAirLines{
    private Plane[] plans;
    private int seatsAmount;
    double loadCapacityAmount;
    private String plansInAirLine= "";

    public AirLine(Plane[] plans) {
        this.plans = plans;
        setSeatsAmount(seatsAmount(plans));
        setLoadCapacityAmount(loadCapacityAmount(plans));
        setPlansInAirLine(getPlanes(plans));
    }

    public int getSeatsAmount() {
        return seatsAmount;
    }

    public void setSeatsAmount(int seatsAmount) {
        this.seatsAmount = seatsAmount;
    }

    public double getLoadCapacityAmount() {
        return loadCapacityAmount;
    }

    public void setLoadCapacityAmount(double loadCapacityAmount) {
        this.loadCapacityAmount = loadCapacityAmount;
    }

    public String getPlansInAirLine() {
        return plansInAirLine.trim();
    }

    public void setPlansInAirLine(String plansInAirLine) {
        this.plansInAirLine = plansInAirLine;
    }

    public int seatsAmount(Plane[] plans){
        for (Plane p: plans){
            seatsAmount = seatsAmount+p.getSeats();
        }
        return seatsAmount;
    }

    public double loadCapacityAmount(Plane[] plans){
        for (Plane p: plans){
            loadCapacityAmount = loadCapacityAmount+p.getLoadCapacity();
        }
        return loadCapacityAmount;
    }


    public String getPlanes(Plane[] plans){
        for (Plane p : plans){
            plansInAirLine = plansInAirLine+"\n"+ p.getName().getName()+": "+"\n"+"Max number of seats : "+p.getSeats()+"\n"+"Max load capacity : "+p.getLoadCapacity()+"\n"+"Max flight range : "+p.getFlightRange()+"\n"+"Avg fuel in kg on hour : "+p.getFuelKgInHour();
        }
        return plansInAirLine;
    }

    @Override
    public String toString() {
        return "Air transport represented by the airline: "+"\n"+ getPlansInAirLine()+"\n"+"-------------Additional info---------------" +"\n"+"Amount of the seats: "+ getSeatsAmount()+"\n"+ "Amount of the load capacity: "+getLoadCapacityAmount();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirLine airLine = (AirLine) o;
        return seatsAmount == airLine.seatsAmount && Double.compare(airLine.loadCapacityAmount, loadCapacityAmount) == 0 && Arrays.equals(plans, airLine.plans) && plansInAirLine.equals(airLine.plansInAirLine);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(seatsAmount, loadCapacityAmount, plansInAirLine);
        result = 31 * result + Arrays.hashCode(plans);
        return result;
    }
}
