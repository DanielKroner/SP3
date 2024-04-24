import java.util.Scanner;

public class mainMenu {
    private Scanner scanner;
    private StartMenu startMenu;
    private User currentUser;

    public mainMenu(Scanner scanner, StartMenu startmenu, User currentUser){
        this.scanner = scanner;
        this.startMenu = startmenu;
        this.currentUser = currentUser;
    }

    public void logout(){
        System.out.println("Logging out...");
        currentUser.getWatchedList().clear();
        currentUser.getWatchLaterList().clear();
        startMenu.displayStartMenu();
    }
}
