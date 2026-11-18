package ie.atu.oop.week1;

public class CustomerTest {
    public static void main(String[] args) {
        Customer first = new Customer("paul","Gort","2323232323",123,true);
        System.out.println(first);

        Customer second = new Customer();
        second.setName("pat");
        second.setAddress("Mervue");
        second.setPhoneNumber("444444444444");
        second.setCustomerNumber(23);
        second.setMailingList(false);
        System.out.println(second);
    }
}
