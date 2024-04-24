import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserFileHandler {
    private static final String FILENAME = "users.txt";

    public static List<User> readUsersFromFile(){
        List<User> users = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))){
            String line;
            while((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String username = parts[0];
                String password = parts[1];
                User user = new User(username, password);
                users.add(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return users;
    }

    public static void writeUsersToFile(List<User> users) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))){
            for (User user : users){
                writer.write(user.getUsername() + "," + user.getPassword());
                writer.newLine();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
