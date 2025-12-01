package atu.ie;

public class PrefferedCustomer extends Customer {
    private int loyaltyPoints;
    private double discountLevel; // 0.05 for 5%, etc.

    //no org constructor
    public prefferedCustomer(){
        super();
        this.loyaltyPoints = 0;
        this.discountLevel = 0;
    }
    public prefferedCustomer(String name,
                             String address,
                             String phoneNumber,
                             int customerNumber,
                             boolean mailingList,
                             int loyaltyPoints){
        super(name,address,phoneNumber,customerNumber,mailingList);
        this.loyaltyPoints = loyaltyPoints;
        this.discountLevel = 0;
    }

    private void updateDiscountLevel() {
        // set discountLevel based on loyaltyPoints
        if(this.loyaltyPoints < 500){
            this.discountLevel = 0.0;
        }
        if(this.loyaltyPoints > 500 && this.loyaltyPoints < 1000){
            this.discountLevel = 0.05;
        }
        if(this.loyaltyPoints > 1000 && this.loyaltyPoints < 1500){
            this.discountLevel = 0.06;
        }
        if(this.loyaltyPoints > 1500 && this.loyaltyPoints < 2000){
            this.discountLevel = 0.07;
        }
        if(this.loyaltyPoints >= 2000){
            this.discountLevel = 0.10;
        }
    }

}











//behaviour
public void addLoyaktyPoints(int points)