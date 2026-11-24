package ie.atu.oop.week1;

public class StudentTicket extends Ticket{
    private String studentId;

    public StudentTicket(String eventName, String holderName, double basePrice, String studentId) {
        super(eventName, holderName, basePrice);
        this.studentId = studentId;
    }

    public StudentTicket(String studentId) {
        this.studentId = studentId;
    }

    public StudentTicket(String eventName, String holderName, double basePrice) {
        super(eventName, holderName, basePrice);
    }

    public StudentTicket() {
        this.studentId = "";
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    @Override
    public double calculatePrice(){
        return getBasePrice()*0.8;
    }

    @Override
    public String toString() {
        return "StudentTicket{" + super.toString() +
                "studentId='" + studentId + '\'' +
                '}';
    }
}
