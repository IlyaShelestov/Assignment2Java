package Project.Wagons;

import Project.Passengers.Passenger;

import java.util.ArrayList;

abstract public class Wagon {
    protected int price;
    protected int maxPassengers;
    protected String name;
    protected ArrayList<Passenger> passengers = new ArrayList<>();

    //Get amount of passengers in wagon.
    public int getAmountOfPassengers() {
        return passengers.size();
    }

    public int getPrice() {
        return price;
    }

    //Get ArrayList to work with it.
    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    //Output information about wagon.
    public String toString() {
        return "Type of the Wagon: " + name + "\n\tTicket Price: " + price + "\n\tMax Number of Passengers: " + maxPassengers + "\n\tAmount of Passengers: " + passengers.size();
    }
}
