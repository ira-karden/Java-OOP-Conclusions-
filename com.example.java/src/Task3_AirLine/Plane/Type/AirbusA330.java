package Task3_AirLine.Plane.Type;

import Task3_AirLine.Plane.Plane;
import Task3_AirLine.PlaneCatalog.PlaneCatalog;

public class AirbusA330 extends Plane {
    public AirbusA330() {
        super(PlaneCatalog.AIRBUS_A330, PlaneCatalog.AIRBUS_A330.getSeats(), PlaneCatalog.AIRBUS_A330.getLoadCapacity(), PlaneCatalog.AIRBUS_A330.getFlightRange(), PlaneCatalog.AIRBUS_A330.getFuelKgInHour());
    }
}
