package Project.Passengers;

public class Disabled extends Passenger {
    public Disabled(int age, String firstName, String secondName, String ticketNumber) {
        super(age, firstName, secondName, ticketNumber);
        discount = 50;
    }
}
