package Customer;
import java.util.*;

public class Account
{
    private ArrayList<Customer.Builder> accOwners;
    private int accId;
    private ArrayList<Vehicle> sharedVehicle;

    public Account(int accId)
    {
        this.accOwners = new ArrayList<Customer.Builder>();
        this.accId = accId;
        this.sharedVehicle = new ArrayList<Vehicle>();
    }

    public int getAccountId()
    {
        return this.accId;
    }

    public String toString()
    {
        String ret = "";
        ret += "Account Id: " + accId + "\n";
        ret += "There are " + accOwners.size() + "person(s) using this account:" + "\n";
        for (int i = 0; i < accOwners.size(); i++)
        {
            ret += accOwners.get(i).toString() + "\n";
        }
        return ret;
    }

    public void addCustomer(Customer.Builder cust)
    {
        for (int i = 0; i < accOwners.size(); i++)
        {
            if (accOwners.get(i).equals(cust))
            {
                System.out.println("Customer is already in the account.");
                return;
            }
        }
        accOwners.add(cust);
        identifyShared();
    }

    public void identifyShared()
    {
        if (accOwners.size() > 1)
        {
            for (int i = 0; i < accOwners.size(); i++)
            {
                for (int j = i + 1; j < accOwners.size(); j++)
                {
                    if (accOwners.get(i).getVehicle().equals(accOwners.get(j).getVehicle()))
                    {
                        for (int k = 0; k < sharedVehicle.size(); k++)
                        {
                            if (accOwners.get(i).getVehicle().equals(sharedVehicle.get(k)))
                            {
                                return;
                            }
                        }
                        sharedVehicle.add(accOwners.get(i).getVehicle());
                    }
                }
            }
        }
    }

}