Mgepackage Customer;

public class Motorcycle extends VehicleImpl {
    
    String vehiclePlate;
    
    Motorcycle() 
    {
        super();
    }
    
    Motorcycle(String vehiclePlate)
    {
        super(vehiclePlate);
    }
    
    public String getVehiclePlate()
    {
        return vehiclePlate;
    }
    
    public void setVehiclePlate(String newVehiclePlate)
    {
        super.setVehiclePlate(newVehiclePlate);
    }
    
    public String toString()
    {
        return "Motorcycle " + super.toString();
    }
}
