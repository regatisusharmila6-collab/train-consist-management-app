import java.util.List;
import java.util.ArrayList;

/**
 * MAIN CLASS - UseCase2TrainConsistMgmnt
 *
 * Use Case 2: Add Passenger Bogies to Train
 *
 * Description:
 * This class demonstrates how passenger bogies can be
 * managed dynamically using ArrayList operations.
 *
 * - Adds new bogies
 * - Removes bogies
 * - Checks existence
 * - Displays final consist
 *
 * @author Developer
 * @version 2.0
 */

public class TrainConsistMgmnt {

    public static void main(String[] args) {

        // Display header
        System.out.println("====================================");
        System.out.println(" UC2 - Add Passenger Bogies to Train ");
        System.out.println("====================================\n");

        // Create an ArrayList to hold passenger bogies
        List<String> passengerBogies = new ArrayList<>();

        // ---- CREATE (Add bogies)
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        // Display after adding
        System.out.println("After Adding Bogies:");
        System.out.println(passengerBogies);

        // ---- DELETE (Remove bogie)
        passengerBogies.remove("AC Chair");

        System.out.println("\nAfter Removing 'AC Chair':");
        System.out.println(passengerBogies);

        // ---- READ (Check existence)
        boolean exists = passengerBogies.contains("Sleeper");

        System.out.println("\nIs 'Sleeper' present? " + exists);

        // ---- Final State
        System.out.println("\nFinal Train Consist:");
        System.out.println(passengerBogies);
    }
}
