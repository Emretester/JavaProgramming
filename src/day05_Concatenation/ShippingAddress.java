package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        String name = "Ali Veli",
                buildingNumber = "12345K",
                streetName = "Jones Branch Dr",
                city = "McLean",
                state = "VA",
                zipCode = "123445N";

        System.out.println(name + "\n" + buildingNumber + " " +
                streetName + "\n" + city + " " + state + " " + zipCode);
    }
}
