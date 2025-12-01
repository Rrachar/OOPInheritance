package atu.ie;

public class PrefferedCustomer extends Customer {

    private int loyaltyPoints;
    private double discountLevel; // 0.05 = 5%


    // No-argument constructor
    public PrefferedCustomer() {
        super();        // calls Customer() which calls Person()
        this.loyaltyPoints = 0;
        this.discountLevel = 0.0;
    }


    // Parameterised constructor

    public PrefferedCustomer(
            String name,
            String address,
            String phoneNumber,
            int customerNumber,
            boolean mailingList,
            int loyaltyPoints
    ) {
        super(name, address, phoneNumber, customerNumber, mailingList);

        this.loyaltyPoints = loyaltyPoints;

        updateDiscountLevel();   // set discount based on points
    }


    // Private helper: updates discount

    private void updateDiscountLevel() {
        if (loyaltyPoints < 500) {
            discountLevel = 0.00;
        } else if (loyaltyPoints < 1000) {
            discountLevel = 0.05;
        } else if (loyaltyPoints < 1500) {
            discountLevel = 0.06;
        } else if (loyaltyPoints < 2000) {
            discountLevel = 0.07;
        } else {
            discountLevel = 0.10;
        }
    }

    // Public method to add points
    public void addLoyaltyPoints(int points) {
        this.loyaltyPoints += points;
        updateDiscountLevel();
    }

    // Getters and Setters
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    public void setLoyaltyPoints(int loyaltyPoints) {
        this.loyaltyPoints = loyaltyPoints;
        updateDiscountLevel();   // keep discount in sync
    }

    public double getDiscountLevel() {
        return discountLevel;
    }

    public void setDiscountLevel(double discountLevel) {
        this.discountLevel = discountLevel;
        // (optional: you could restrict this to update only via updateDiscountLevel())
    }


    // toString()
    @Override
    public String toString() {
        return "PreferredCustomer{" +
                "customer=" + super.toString() +
                ", loyaltyPoints=" + loyaltyPoints +
                ", discountLevel=" + discountLevel +
                '}';
    }
}












