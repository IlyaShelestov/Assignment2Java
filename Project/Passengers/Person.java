package Project.Passengers;

public class Person extends Passenger {
    public Person(int age, String firstName, String secondName, String ticketNumber) {
        super(age, firstName, secondName, ticketNumber);
        discount = 0;
    }
}
