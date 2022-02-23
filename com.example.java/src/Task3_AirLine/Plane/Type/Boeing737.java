package Task3_AirLine.Plane.Type;

import Task3_AirLine.Plane.Plane;
import Task3_AirLine.PlaneCatalog.PlaneCatalog;

public class Boeing737 extends Plane {
    public Boeing737() {
        super(PlaneCatalog.BOEING_737, PlaneCatalog.BOEING_737.getSeats(), PlaneCatalog.BOEING_737.getLoadCapacity(), PlaneCatalog.BOEING_737.getFlightRange(), PlaneCatalog.BOEING_737.getFuelKgInHour());
    }
}
