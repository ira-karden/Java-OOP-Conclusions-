package Task3_AirLine.run;

import Task2_MusicDisk.Song.Song;
import Task3_AirLine.AirLine.AirLine;
import Task3_AirLine.Plane.Plane;
import Task3_AirLine.Plane.Type.*;
import Task3_AirLine.PlaneRegulation.PlaneFilter;
import Task3_AirLine.PlaneRegulation.PlaneSorter;

import java.util.Arrays;

public class run {
    public static void main(String[] args) {
        PlaneSorter sorter1 = new PlaneSorter();
        PlaneFilter filter1 = new PlaneFilter();
        System.out.println("________________________________INFO ABOUT AIRLINE_____________________________________________________");
        AirLine SkyUp = new AirLine (new Plane[] {new AirbusA320(), new AirbusA330(), new Boeing767(), new Boeing737(), new Boeing777()});
        System.out.println(SkyUp);
        System.out.println("________________________________Planes sorted by flight range___________________________________________");
        Plane [] plans = new Plane []{new AirbusA320(), new AirbusA330(), new Boeing767(), new Boeing737(), new Boeing777()};
        Arrays.sort(plans, sorter1);
        for (Plane p : plans){
            System.out.println(p.getName().getName()+ ": Max flight range - " + p.getFlightRange()+" km");
        }
        System.out.println("________________________________Planes with low Fuel Consumption_________________________________________");
        Plane []  lowFuelConsumption = filter1.getByFuel(plans);
        for (Plane p: lowFuelConsumption){
            System.out.println(p.getName().getName()+": Fuel Consumption - "+p.getFuelKgInHour());
        }



    }
}
