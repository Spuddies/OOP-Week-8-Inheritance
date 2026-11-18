package ie.atu.oop.week1;

public class CustomerTest {
    public static void main(String[] args) {
        Ticket ticket = new Ticket("Summer Concert","Alice",50);
        Ticket ticket2 = new StudentTicket("Summer Concert","Bob",50,"g00484675");
        Ticket ticket3 = new VIPTicket("Summer Concert","Alice",50);
        System.out.println(ticket);
        System.out.println(ticket2);
        System.out.println(ticket3);

    }
}
