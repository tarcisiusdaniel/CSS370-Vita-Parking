package Customer;

import java.util.*;

public class ParkingSpot
{
    private boolean availability;
    private int spotId;
    private int floor;

    public ParkingSpot(int spotId, int floor)
    {
        this.availability = true;
        this.spotId = spotId;
        this.floor = floor;
    }

    public String toString()
    {
        String ret = "Spot " + this.spotId + "on " + this.floor + " floor";
        if (this.availability == true)
        {
            ret += " is available";
        }
        else
        {
            ret += " is not available";
        }
        return ret;
    }

    public void setAvailability(boolean status)
    {
        this.availability = status;
    }

    public boolean getAvailability()
    {
        return this.availability;
    }

    public int getSpotId()
    {
        return this.spotId;
    }

    public int getFloor()
    {
        return this.floor;
    }
}