vpackage Customer;

public class Car extends VehicleImpl {
    
    String vehicleNumber;
    
    Car() 
    {
        
    }
    
    Car(String vehicleNumber)
    {
        super(vehicleNumber);
    }
    
    @Override
    public String getVehiclePlate()
    {
        return vehicleNumber;
    }
    
    @Override
    public void setVehiclePlate(String newVehicleNumber)
    {
        super.setVehiclePlate(newVehicleNumber);
    }
    
    @Override
    public String toString()
    {
        return "Car " + super.toString();
    }
}
