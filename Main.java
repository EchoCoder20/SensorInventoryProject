import java.util.Scanner;

public class Main {
    static Integer userChoice = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Inventory Home Page");
        while (userChoice != 5) {
            mainMenuList();
            System.out.println("Enter a number from (1) to (5):");
            userChoice = scanner.nextInt();
            if (userChoice == 1) {
                SensorService.addingNewItem();
            } else if (userChoice == 2) {
                SensorService.editItem();
            } else if (userChoice == 3) {
                SensorService.removeItem();
            } else if (userChoice == 4) {
                SensorService.displayAllItem();
            } else if (userChoice == 5) {
                System.out.println("Exits from the system");
            } else {
                System.out.println("Invalid number");
            }
        }
    }
    public static void mainMenuList() {
        System.out.println("""
                1.Add a New Item
                2.Edit an Existing Item
                3.Remove an Item
                4.Display All Items
                5.Exit
                """);
    }
}