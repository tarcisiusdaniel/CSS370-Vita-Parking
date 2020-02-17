sPPaadpackage Customer;

import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ParkingSystem {

    private static ParkingSystem system = new ParkingSystem();
    private ArrayList<Account> accountList;
    private ParkingLot pLot;

    public ParkingSystem() {
        this.accountList = new ArrayList<Account>();
        this.pLot = new ParkingLot();
    }

    public static ParkingSystem getInstance() {
        system.accountList = new ArrayList<Account>();
        system.pLot = new ParkingLot();
        return system;
    }

    public void buildAccounts(String fileName) {
        Scanner in;
        try {
            in = new Scanner(new FileInputStream(fileName));
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] listofData = line.split(" ");
                int accId = Integer.parseInt(listofData[0]);
                int sId = Integer.parseInt(listofData[1]);
                String fName = listofData[2];
                String lName = listofData[3];

                char vtype = listofData[4].charAt(0);
                String plate = listofData[5];

                Vehicle v = VehicleFactory.getVehicle(vtype, plate);
                
                Account acc = new Account(accId);
                Customer.Builder cust = new Customer.Builder(sId)
                                        .createName(fName, lName)
                                        .registerVehicle(v)
                                        .build();
                acc.addCustomer(cust);
                accountList.add(acc);
            }
            in.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not Found.");
        }
    }

    public void buildSystem(String fileName) {
        Scanner in;
        try {
            in = new Scanner(new FileInputStream(fileName));
            while (in.hasNextLine()) {
                String name = in.next();
                int sID = in.nextInt();
                char type = in.next().charAt(0);
                String vehicle = in.next();
            }
            in.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        }

    }

    public void buildParkingLot(String fileName) {
        Scanner in;
        try {
            in = new Scanner(new FileInputStream(fileName));
            int[] fsid = new int[2];
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] intInString = line.split(" ");
                for (int i = 0; i < intInString.length; i++) {
                    fsid[i] = Integer.parseInt(intInString[i]);
                }
                int floor = fsid[0];
                int spotId = fsid[1];
                this.pLot.addParkingSpot(floor, spotId);
            }
            in.close();
        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        }

    }

    public void addAccount(Account acc) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).equals(acc)) {
                System.out.println("Account with this Id already exist.");
                return;
            }
        }
        accountList.add(acc);
    }

    public void printAccountDetail(int accId) {
        boolean stop = false;
        for (int i = 0; i < accountList.size() && stop == false; i++) {
            if (accountList.get(i).getAccountId() == accId) {
                System.out.println(accountList.get(i).toString());
                stop = true;
            }
        }
    }

    public void deleteAccount(int accId) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getAccountId() == accId) {
                accountList.remove(accountList.get(i));
                System.out.println("Account " + accId + " deleted.");
                return;
            }
        }
        System.out.println("No account deleted.");
    }

    public void showParkingLot() {
        pLot.inspectParkingLot();
        return;
    }
}
