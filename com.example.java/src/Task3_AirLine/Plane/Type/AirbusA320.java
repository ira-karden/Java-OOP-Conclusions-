package Task3_AirLine.Plane.Type;

import Task3_AirLine.Plane.Plane;
import Task3_AirLine.PlaneCatalog.PlaneCatalog;

public class AirbusA320 extends Plane {
    public AirbusA320() {
        super(PlaneCatalog.AIRBUS_A320, PlaneCatalog.AIRBUS_A320.getSeats(), PlaneCatalog.AIRBUS_A320.getLoadCapacity(), PlaneCatalog.AIRBUS_A320.getFlightRange(), PlaneCatalog.AIRBUS_A320.getFuelKgInHour());
    }
}
