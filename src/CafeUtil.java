import java.util.ArrayList;
import java.util.Scanner;

public class CafeUtil {
    int getStreakGoal(int numWeeks){
        int sum = 0;
        for(int i = 1; i <= numWeeks; i++){
            sum += i;
        }
        return sum;
    }

    double getOrderTotal(double[] itemArray){
        double sum = 0;
        for(int i = 0; i < itemArray.length - 1; i++){
            sum += itemArray[i];
        }
        return sum;
    }

    void displayMenu(ArrayList<String> menuItems){
        for (int i = 0; i < menuItems.size() - 1; i++){
            System.out.format("%d - %s\n", i, menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your name:");
            String userName = scanner.nextLine();
            System.out.println(String.format("Hello, %s!", userName));
            System.out.format("There are %d customers in front of you.", customers.size());
            customers.add(userName);
        }
}
