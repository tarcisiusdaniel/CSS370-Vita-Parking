package Customer;

public class Driver {
    public static void main(String[] args) {
        //Test for creating a customer account
        Customer.Builder c1 = new Customer.Builder(1234);
        c1.createName("Kellan", "Blake");
        Car v1 = new Car("ABC123");
        c1.registerVehicle(v1);
        Credit cc1 = new Credit(1234567);
        c1.registerPayment(cc1);
        System.out.println(c1.toString());
        ParkingSystem ps = new ParkingSystem();
        ps.buildParkingLot("E:\\VitaParking\\src\\Customer\\ParkingLot.txt");
        ps.buildAccounts("E:\\VitaParking\\src\\Customer\\Account.txt");
        ps.showParkingLot();
        ps.printAccountDetail(14532);
        ps.printAccountDetail(13524);
        ps.printAccountDetail(12345);
        ps.printAccountDetail(45312);
        ps.printAccountDetail(23145);
    }
}