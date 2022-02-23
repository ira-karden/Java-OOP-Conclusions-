package Task3_AirLine.PlaneRegulation;

import Task3_AirLine.Plane.Plane;

import java.util.Comparator;

public class PlaneSorter implements Comparator<Plane> {

    @Override
    public int compare(Plane o1, Plane o2) {
        return Double.compare(o1.getFlightRange(),o2.getFlightRange());
    }
}
