package Task3_AirLine.Plane.Type;

import Task3_AirLine.Plane.Plane;
import Task3_AirLine.PlaneCatalog.PlaneCatalog;

public class Boeing777 extends Plane {
    public Boeing777() {
        super(PlaneCatalog.BOEING_777, PlaneCatalog.BOEING_777.getSeats(), PlaneCatalog.BOEING_777.getLoadCapacity(), PlaneCatalog.BOEING_777.getFlightRange(), PlaneCatalog.BOEING_777.getFuelKgInHour());
    }
}
