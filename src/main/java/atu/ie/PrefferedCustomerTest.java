package atu.ie;

public class PrefferedCustomerTest {

    public static void main(String[] args) {

        // 1. Create PreferredCustomer using no-arg constructor
        PrefferedCustomer pc = new PrefferedCustomer();
        pc.setName("Robert Rachar");
        pc.setAddress("Ballyban");
        pc.setPhoneNumber("0871112222");
        pc.setCustomerNumber(2001);
        pc.setMailingList(true);

        // 2. Print before loyalty points
        System.out.println("Before adding loyalty points:");
        System.out.println(pc);

        // 3. Add 700 points
        pc.addLoyaltyPoints(700);
        System.out.println("\nAfter adding 700 points:");
        System.out.println(pc);

        // 4. Add another 800 points
        pc.addLoyaltyPoints(800);
        System.out.println("\nAfter adding another 800 points:");
        System.out.println(pc);
    }
}
