package atu.ie;

public class CustomerTest {

    public static void main(String[] args) {

        // Customer created using parameterised constructor
        Customer part1Customer = new Customer(
                "Alice Smith",
                "1 High Street",
                "0851234567",
                1001,
                true
        );

        // Customer created using no-argument constructor + setters
        Customer part2Customer = new Customer();
        part2Customer.setName("Bob Jones");
        part2Customer.setAddress("2 Low Street");
        part2Customer.setPhoneNumber("0867654321");
        part2Customer.setCustomerNumber(1002);
        part2Customer.setMailingList(false);

        // Print both customers
        System.out.println(part1Customer);
        System.out.println(part2Customer);
    }
}
