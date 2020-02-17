package Customer;

import java.util.*;

public class VehicleFactory
{
    private VehicleFactory()
    {

    }

    public static Vehicle getVehicle(char ch, String plate)
    {
        if(ch == 'C')
        {
            return new Car(plate);
        } 
        else if(ch == 'M')
        {
            return new Motorcycle(plate);
        } 
        else 
        {
            return null;
        }
    }
}
