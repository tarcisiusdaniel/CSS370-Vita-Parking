package Customer;

import java.util.*;
import java.io.*;

public interface VitaParking
{
    public void buildSystem(String fileName);
    public void buildAccounts(String fileName);
    public void buildParkingLot(String fileName);
    public void addCustomer(Account cust);
    public void printCustDetail(int accId);
    public void deleteCustomer(int accId);
    public void showParkingLot();
}