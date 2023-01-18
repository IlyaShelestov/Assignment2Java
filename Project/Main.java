package Project;

import Project.Passengers.*;
import Project.Wagons.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //Add passengers, wagons, etc.
    static void addPassengersAndWagons(ArrayList<Wagon> train) {
        train.add(new Lux());
        train.add(new Kupe());
        train.add(new SittingWagon());
        train.add(new Plackart());
        train.add(new DisabledWagon());
        train.get(0).getPassengers().add(new Child(15, "John", "Smith", "23451"));
        train.get(0).getPassengers().add(new Elderly(78, "Sophia", "Silva", "82341"));
        train.get(0).getPassengers().add(new Person(45, "Anoushka", "Farrell", "98234"));
        train.get(0).getPassengers().add(new Elderly(67, "Ismael", "Dominguez", "98023"));
        train.get(0).getPassengers().add(new Elderly(68, "Arron", "Thomson", "23481"));
        train.get(0).getPassengers().add(new Person(33, "Kevin", "Sanford", "75801"));
        train.get(1).getPassengers().add(new Child(12, "Awais", "Lin", "18372"));
        train.get(1).getPassengers().add(new Child(13, "Rhonda", "Mccarty", "92831"));
        train.get(1).getPassengers().add(new Person(51, "Maliha", "Horton", "93844"));
        train.get(1).getPassengers().add(new Student(18, "Melvin", "Perkins", "99821"));
        train.get(1).getPassengers().add(new Person(26, "Jon", "Shields", "93931"));
        train.get(1).getPassengers().add(new Elderly(71, "Rupert", "Mccarthy", "12123"));
        train.get(1).getPassengers().add(new Elderly(73, "Anastasia", "Wong", "32343"));
        train.get(1).getPassengers().add(new Student(19, "Darcie", "Bridges", "45454"));
        train.get(2).getPassengers().add(new Student(19, "Thomas", "Maddox", "65656"));
        train.get(2).getPassengers().add(new Student(21, "Haseeb", "Bradford", "67676"));
        train.get(2).getPassengers().add(new Person(42, "Karim", "Mahoney", "78787"));
        train.get(2).getPassengers().add(new Person(23, "Kamran", "Robles", "89898"));
        train.get(2).getPassengers().add(new Student(18, "Ellie-Mae", "Boyle", "88998"));
        train.get(3).getPassengers().add(new Person(27, "Keane", "O'Reilly", "12312"));
        train.get(3).getPassengers().add(new Child(7, "Davina", "Mathis", "23324"));
        train.get(3).getPassengers().add(new Student(19, "Tasneem", "Bush", "56432"));
        train.get(3).getPassengers().add(new Elderly(89, "Chad", "Bolton", "76755"));
        train.get(3).getPassengers().add(new Student(22, "Rowan", "Haines", "65475"));
        train.get(3).getPassengers().add(new Person(45, "Jamal", "Banks", "56475"));
        train.get(3).getPassengers().add(new Person(54, "Ashleigh", "Blackwell", "57567"));
        train.get(4).getPassengers().add(new Disabled(45, "Christopher", "Cole", "98765"));
        train.get(4).getPassengers().add(new Disabled(63, "Haydn", "Walton", "56789"));
        train.get(4).getPassengers().add(new Disabled(23, "Syeda", "Carroll", "97696"));
        train.get(4).getPassengers().add(new Disabled(51, "Nieve", "Potter", "10000"));
    }

    //Commands for administrator.
    static void commandsAdministrator() {
        System.out.println("-------------------------------------------");
        System.out.println("Enter the command number.");
        System.out.println("1 - Give information about wagons.");
        System.out.println("2 - Give list of passengers in wagon.");
        System.out.println("3 - Add new wagon.");
        System.out.println("4 - Remove wagon.");
        System.out.println("5 - Edit information about wagon.");
        System.out.println("0 - Go back.");
        System.out.println("-------------------------------------------");
    }

    //Commands for editing wagon.
    static void commandsEditWagon() {
        System.out.println("-------------------------------------------");
        System.out.println("1 - Add new passenger.");
        System.out.println("2 - Remove passenger.");
        System.out.println("3 - Edit information about passenger.");
        System.out.println("0 - Go back.");
        System.out.println("-------------------------------------------");
    }

    //Commands for editing passenger.
    static void commandsEditPassenger() {
        System.out.println("-------------------------------------------");
        System.out.println("1 - Edit name.");
        System.out.println("2 - Edit surname.");
        System.out.println("3 - Edit age.");
        System.out.println("4 - Edit ticket number.");
        System.out.println("0 - Go back.");
        System.out.println("-------------------------------------------");
    }

    //Main commands.
    static void commandsMain() {
        System.out.println("-------------------------------------------");
        System.out.println("Enter the command number.");
        System.out.println("1 - Administrator.");
        System.out.println("0 - Exit.");
        System.out.println("-------------------------------------------");
    }

    //Function to add new wagon.
    static void addWagon(ArrayList<Wagon> train, Scanner scan) {
        int wagonType;
        do {
            System.out.println("Enter wagon type: 1 - Lux, 2 - Plackart, 3 - Sitting Wagon, 4 - Kupe, 5 - Disabled Wagon");
            wagonType = scan.nextInt();
            if (wagonType < 1 || wagonType > 5) {
                System.out.println("Try again.");
            }
        } while (wagonType < 1 || wagonType > 5);
        switch (wagonType) {
            case 1 -> train.add(new Lux());
            case 2 -> train.add(new Plackart());
            case 3 -> train.add(new SittingWagon());
            case 4 -> train.add(new Kupe());
            case 5 -> train.add(new DisabledWagon());
        }
    }

    //Function to add new passenger.
    static void addPassenger(ArrayList<Passenger> passengers, Scanner scan) {
        int status;
        do {
            System.out.println("Enter social status: 1 - Child, 2 - Disabled, 3 - Elderly, 4 - Student, 0 - No status");
            status = scan.nextInt();
            if (status < 0 || status > 4) {
                System.out.println("Try again.");
            }
        } while (status < 0 || status > 4);
        int age;
        do {
            System.out.println("Enter age: ");
            age = scan.nextInt();
            if (age <= 0) {
                System.out.println("Invalid value for age!");
            }
        } while (age <= 0);
        System.out.println("Enter name:");
        String name = scan.next();
        System.out.println("Enter surname:");
        String surname = scan.next();
        System.out.println("Enter the ticket number:");
        String ticket = scan.next();
        switch (status) {
            case 0 -> passengers.add(new Person(age, name, surname, ticket));
            case 1 -> passengers.add(new Child(age, name, surname, ticket));
            case 2 -> passengers.add(new Disabled(age, name, surname, ticket));
            case 3 -> passengers.add(new Elderly(age, name, surname, ticket));
            case 4 -> passengers.add(new Student(age, name, surname, ticket));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Wagon> train = new ArrayList<>();
        addPassengersAndWagons(train);
        while (true) {
            commandsMain();
            int command = scan.nextInt();
            if (command == 1) {
                while (true) {
                    commandsAdministrator();
                    command = scan.nextInt();
                    if (command == 1) {
                        System.out.println("Amount of wagons: " + train.size() + ".");
                        for (int i = 0; i < train.size(); i++) {
                            System.out.println("-------------------------------------------");
                            System.out.println(i + ". " + train.get(i).toString());
                            System.out.println("-------------------------------------------");
                        }
                    } else if (command == 2) {
                        System.out.println("Enter index of wagon: ");
                        int indexOfWagon = scan.nextInt();
                        if (indexOfWagon >= train.size() || indexOfWagon < 0) {
                            System.out.println("Wagon does not exist!");
                        } else {
                            System.out.println("-------------------------------------------");
                            for (int i = 0; i < train.get(indexOfWagon).getAmountOfPassengers(); i++) {
                                System.out.println(train.get(indexOfWagon).getPassengers().get(i).toString() + "; Ticket Price: " + train.get(indexOfWagon).getPassengers().get(i).calculateTicketPrice(train.get(indexOfWagon).getPrice()));
                            }
                            System.out.println("-------------------------------------------");
                        }
                    } else if (command == 3) {
                        addWagon(train, scan);
                        System.out.println("Wagon added!");
                    } else if (command == 4) {
                        System.out.println("Enter index of wagon: ");
                        int indexOfWagon = scan.nextInt();
                        if (indexOfWagon >= train.size() || indexOfWagon < 0) {
                            System.out.println("Wagon does not exist!");
                        } else {
                            train.remove(indexOfWagon);
                            System.out.println("Wagon removed!");
                        }
                    } else if (command == 5) {
                        while (true) {
                            System.out.println("Enter index of wagon: ");
                            int indexOfWagon = scan.nextInt();
                            if (indexOfWagon >= train.size() || indexOfWagon < 0) {
                                System.out.println("Wagon does not exist!");
                                break;
                            }
                            commandsEditWagon();
                            command = scan.nextInt();
                            if (command == 1) {
                                if (train.get(indexOfWagon).getAmountOfPassengers() == train.get(indexOfWagon).getMaxPassengers()) {
                                    System.out.println("This wagon is full!");
                                    break;
                                }
                                addPassenger(train.get(indexOfWagon).getPassengers(), scan);
                                System.out.println("Passenger added!");
                                break;
                            } else if (command == 2) {
                                System.out.println("Enter index of passenger: ");
                                int indexOfPassenger = scan.nextInt();
                                if (indexOfPassenger >= train.get(indexOfWagon).getAmountOfPassengers() || indexOfPassenger < 0) {
                                    System.out.println("Passenger does not exist!");
                                    break;
                                }
                                train.get(indexOfWagon).getPassengers().remove(indexOfPassenger);
                                System.out.println("Passenger removed!");
                                break;
                            } else if (command == 3) {
                                System.out.println("Enter index of passenger: ");
                                int indexOfPassenger = scan.nextInt();
                                if (indexOfPassenger >= train.get(indexOfWagon).getAmountOfPassengers() || indexOfPassenger < 0) {
                                    System.out.println("Passenger does not exist!");
                                    break;
                                }
                                while (true) {
                                    commandsEditPassenger();
                                    command = scan.nextInt();
                                    if (command == 1) {
                                        System.out.println("Enter new name: ");
                                        String name = scan.next();
                                        train.get(indexOfWagon).getPassengers().get(indexOfPassenger).setFirstName(name);
                                        break;
                                    } else if (command == 2) {
                                        System.out.println("Enter new surname: ");
                                        String surname = scan.next();
                                        train.get(indexOfWagon).getPassengers().get(indexOfPassenger).setSecondName(surname);
                                        break;
                                    } else if (command == 3) {
                                        int age;
                                        do {
                                            System.out.println("Enter new age: ");
                                            age = scan.nextInt();
                                            if (age <= 0) {
                                                System.out.println("Invalid value for age!");
                                            }
                                        }
                                        while (age <= 0);
                                        train.get(indexOfWagon).getPassengers().get(indexOfPassenger).setAge(age);
                                        break;
                                    } else if (command == 4) {
                                        System.out.println("Enter new ticket number: ");
                                        String ticketNumber = scan.next();
                                        train.get(indexOfWagon).getPassengers().get(indexOfPassenger).setTicketNumber(ticketNumber);
                                        break;
                                    } else if (command == 0) {
                                        break;
                                    } else {
                                        System.out.println("Unknown command. Try again.");
                                    }
                                }
                                break;
                            } else if (command == 0) {
                                break;
                            } else {
                                System.out.println("Unknown command. Try again.");
                            }
                        }
                    } else if (command == 0) {
                        break;
                    } else {
                        System.out.println("Unknown command. Try again.");
                    }
                }
            } else if (command == 0) {
                System.out.println("Goodbye.");
                break;
            } else {
                System.out.println("Unknown command. Try again.");
            }
        }
    }
}
