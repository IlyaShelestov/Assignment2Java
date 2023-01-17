package Project.Passengers;

abstract public class Passenger {
    private int age;
    private String firstName;
    private String secondName;
    private String ticketNumber;
    protected int discount = 0;

    public Passenger(int age, String firstName, String secondName, String ticketNumber) {
        this.age = age;
        this.firstName = firstName;
        this.secondName = secondName;
        this.ticketNumber = ticketNumber;
    }

    @Override
    public String toString() {
        return "Age: " + age + "; First Name: " + firstName + "; Second Name: " + secondName + "; Ticket Number: " + ticketNumber + "; Discount: " + discount + "%";
    }

    //Formula to get ticket price. (We need to input index of passenger in wagon).
    public double calculateTicketPrice(int price) {
        return (double) price - ((double) discount / 100 * price);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
}