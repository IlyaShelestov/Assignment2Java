package Project.Passengers;

public class Child extends Passenger {
    public Child(int age, String firstName, String secondName, String ticketNumber) {
        super(age, firstName, secondName, ticketNumber);
        discount = 50;
    }
}
