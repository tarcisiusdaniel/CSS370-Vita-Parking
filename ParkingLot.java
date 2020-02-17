APsspackage Customer;

import java.util.*;

public class ParkingLot
{
    private ArrayList<ParkingSpot> spots;
    private double openingTime;
    private double closingTime;
    
    public ParkingLot()
    {
        spots = new ArrayList<ParkingSpot>();
        this.openingTime = 7.0;
        this.closingTime = 24.0;
    }

    public ParkingLot(double open, double close)
    {
        spots = new ArrayList<ParkingSpot>();
        this.openingTime = open;
        this.closingTime = close;
    }

    public void inspectParkingLot()
    {
        int available = 0;
        int unavailable = 0;
        for(int j = 0; j < spots.size(); j++)
        {
            if (spots.get(j).getAvailability() == true)
            {
                available++;
            }
            else
            {
                unavailable++;
            }
        }
        System.out.println("There are " + available + "spots available");
        System.out.println("There are " + unavailable + "spots unavailable");
        System.out.println();
        System.out.println("Here is the detail for each parking spot");
        for(int i = 0; i < spots.size(); i++)
        {
            System.out.println("\t" + spots.get(i).toString());
        }
    }

    public void setSpotAvailibility(boolean status, int spotId, int floor)
    {
        boolean stop = false;
        for (int i = 0; i < spots.size() && !stop; i++)
        {
            if (spots.get(i).getSpotId() == spotId && spots.get(i).getFloor() == floor)
            {
                spots.get(i).setAvailability(status);
                stop = true;
            }
        }
    }

    public void addParkingSpot(int floor, int spotId)
    {
        ParkingSpot ps = new ParkingSpot(floor, spotId);
        spots.add(ps);
    }
}