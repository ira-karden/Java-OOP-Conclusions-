package Task3_AirLine.PlaneRegulation;

import Task2_MusicDisk.Song.Song;
import Task3_AirLine.Plane.Plane;

import java.util.ArrayList;
import java.util.List;

public class PlaneFilter {
    public Plane[] getByFuel(Plane[] planes) {
        List<Plane> lowFuelConsumption = new ArrayList<>();

        for (Plane p : planes) {
            if (p.getFuelKgInHour() <= 5000.0) {
                lowFuelConsumption.add(p);
            }
        }
        return lowFuelConsumption.toArray(new Plane[0]);
    }
}