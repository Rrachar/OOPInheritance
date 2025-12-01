package atu.ie;

public class Customer extends Person {

    private int customerNumber;
    private boolean mailingList;

    // No-argument constructor
    public Customer() {
        super(); // calls Person no-arg constructor
        this.customerNumber = 0;
        this.mailingList = false;
    }

    // Parameterised constructor
    public Customer(String name, String address, String phoneNumber,
                    int customerNumber, boolean mailingList) {

        super(name, address, phoneNumber); // call Person constructor
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
    }

    // Getters and Setters
    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public boolean isMailingList() {
        return mailingList;
    }

    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    // toString
    @Override
    public String toString() {
        return "Customer{" +
                "person=" + super.toString() +
                ", customerNumber=" + customerNumber +
                ", mailingList=" + mailingList +
                '}';
    }
}
