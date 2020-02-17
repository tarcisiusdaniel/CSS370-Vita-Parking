package Customer;

import java.util.*;

public class Customer {

    private int sId;
    private String firstName;
    private String lastName;
    private Vehicle vehicle;
    private PaymentInfo card;

    public Customer() {

    }

    public static class Builder {

        private int sId;
        private String firstName;
        private String lastName;
        private Vehicle vehicle;
        private PaymentInfo card;

        public Builder(int sId) {
            this.sId = sId;
        }

        public Builder createName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
            return this;
        }

        public Builder registerVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
            return this;
        }

        public Builder registerPayment(PaymentInfo card) {
            this.card = card;
            return this;
        }

        public Customer.Builder build() {
            Customer.Builder cust = new Customer.Builder(this.sId);
            cust.sId = this.sId;
            cust.firstName = this.firstName;
            cust.lastName = this.lastName;
            cust.vehicle = this.vehicle;
            return cust;
        }

        public String toString() {
            String ret = "";
            ret += "Student ID: " + this.sId + "\n";
            ret += "First Name: " + this.firstName + "\n";
            ret += "Last Name: " + this.lastName + "\n";
            ret += "Vehicle info: " + this.vehicle.toString() + "\n";
            return ret;
        }

        public Vehicle getVehicle() {
            return this.vehicle;
        }
    }

}
