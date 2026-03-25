import java.util.Map;
import java.util.HashMap;

/**
 * MAIN CLASS - UseCase6TrainConsistMgmnt
 *
 * Use Case 6: Map Bogie to Capacity (HashMap)
 *
 * Description:
 * This class associates each bogie with its seating or
 * load capacity using a key-value mapping structure.
 *
 * @author Developer
 * @version 6.0
 */

public class TrainConsistMgmnt {

    public static void main(String[] args) {

        // Header
        System.out.println("==============================================");
        System.out.println(" UC6 - Map Bogie to Capacity (HashMap) ");
        System.out.println("==============================================\n");

        // HashMap stores key -> value
        Map<String, Integer> capacityMap = new HashMap<>();

        // ---- INSERT bogie capacities ----
        capacityMap.put("Sleeper", 72);
        capacityMap.put("AC Chair", 56);
        capacityMap.put("First Class", 24);
        capacityMap.put("Cargo", 120);

        // ---- DISPLAY using entrySet() ----
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : capacityMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nUC6 bogie-capacity mapping completed ...");
    }
}
