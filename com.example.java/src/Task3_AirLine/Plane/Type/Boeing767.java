package Task3_AirLine.Plane.Type;

import Task3_AirLine.Plane.Plane;
import Task3_AirLine.PlaneCatalog.PlaneCatalog;

public class Boeing767 extends Plane {
    public Boeing767() {
        super(PlaneCatalog.BOEING_767, PlaneCatalog.BOEING_767.getSeats(), PlaneCatalog.BOEING_767.getLoadCapacity(), PlaneCatalog.BOEING_767.getFlightRange(), PlaneCatalog.BOEING_767.getFuelKgInHour());
    }
}
