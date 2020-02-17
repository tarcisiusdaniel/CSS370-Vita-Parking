VSsepackage Customer;

import java.util.*;

public abstract class VehicleImpl implements Vehicle 
{
    private String vehiclePlate;

    VehicleImpl()
    {
        vehiclePlate = "";
    }
    
    VehicleImpl(String vehiclePlate)
    {
        this.vehiclePlate = vehiclePlate;
    }

    @Override
    public String getVehiclePlate()
    {
        return vehiclePlate;
    }

    @Override
    public void setVehiclePlate(String newPlate)
    {
        this.vehiclePlate = newPlate;
    }

    @Override
    public String toString()
    {
        return "License Plate: " + vehiclePlate;
    }
}