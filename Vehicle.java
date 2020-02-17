package Customer;

// public abstract class Vehicle {

//     protected String make;
//     protected String model;
//     protected double hourlyRate;

//     public double getHourlyRate() {
//         return hourlyRate;
//     }

//     public String toString() {
//         return make + " " + model;
//     }
// }

import java.util.*;

public interface Vehicle
{
    public String getVehiclePlate();
    public void setVehiclePlate(String newPlate); 
    public String toString();
}