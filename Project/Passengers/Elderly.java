package Project.Passengers;

public class Elderly extends Passenger {
    public Elderly(int age, String firstName, String secondName, String ticketNumber) {
        super(age, firstName, secondName, ticketNumber);
        discount = 35;
    }
}
