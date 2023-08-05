package carDealership;

public class Dealership {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.setName("Mingi");
        cust1.setAddress("123 Some St.");
        cust1.setCashOnHand(12000);

        //now it's able to invoke the constructor
        Vehicle vehicle = new Vehicle("Honda", "Accord", 15000);
        //setting vehicle models and price

        Employee emp = new Employee();

        cust1.purchaseCar(vehicle, emp, false);

        Vehicle car = new Vehicle("BMW", "M3", 20000);

        boolean value = car.equals(vehicle);
        System.out.println(value);


    }
}
