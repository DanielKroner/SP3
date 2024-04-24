import java.util.Scanner;

public class StartMenu {

    private Scanner scanner;

    public StartMenu(){
        scanner = new Scanner(System.in);
    }

    public User displayStartMenu(){
        System.out.println("Welcome to CHILL streaming!");
        System.out.println("Choose one of the following options and press enter:");
        System.out.println("1. Create a new user");
        System.out.println("2. Login to existing user");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                return createNewUser();
            case 2:
                return login();
            default:
                System.out.println("Invalid choice, please choose one of the options listed!");
                return displayStartMenu();
        }
    }

    private User createNewUser(){

        // Ask user for input for creation of new user
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        User newUser = new User(username, password);

        // TODO Save the new user to a file
        System.out.println("User was successfully created");

        return newUser;
    }

    private User login(){
        System.out.println("Enter your username: ");
        String username = scanner.nextLine();
        System.out.println("Enter your password: ");
        String password = scanner.nextLine();

        //TODO Check for validity!
        // Assume the input is correct
        User user = new User(username, password);
        return user;
    }
}
