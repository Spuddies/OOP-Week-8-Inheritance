package ie.atu.oop.week1;

public class VIPTicket extends Ticket {

    public VIPTicket() {
    }

    public VIPTicket(String eventName, String holderName, double basePrice) {
        super(eventName, holderName, basePrice);
    }
    @Override
    public double calculatePrice(){
        return getBasePrice()+25;
    }

    @Override
    public String toString() {
        return "VIPTicket{}" + super.toString()+"Benefits: Priority entry and reserved seating";
    }
}
