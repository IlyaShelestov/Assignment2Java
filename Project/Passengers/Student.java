package Project.Passengers;

public class Student extends Passenger {
    public Student(int age, String firstName, String secondName, String ticketNumber) {
        super(age, firstName, secondName, ticketNumber);
        discount = 20;
    }
}
