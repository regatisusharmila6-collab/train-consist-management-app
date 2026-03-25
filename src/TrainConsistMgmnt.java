import java.util.Set;
import java.util.LinkedHashSet;

/**
 * MAIN CLASS - UseCase5TrainConsistMgmnt
 *
 * Use Case 5: Preserve Insertion Order of Bogies
 *
 * Description:
 * This class maintains the exact attachment order of bogies
 * while also preventing duplicate entries using LinkedHashSet.
 *
 * @author Developer
 * @version 5.0
 */

public class TrainConsistMgmnt {

    public static void main(String[] args) {

        // Header
        System.out.println("========================================");
        System.out.println(" UC5 - Preserve Insertion Order of Bogies ");
        System.out.println("========================================\n");

        // LinkedHashSet preserves order + uniqueness
        Set<String> formation = new LinkedHashSet<>();

        // ---- ADD bogies ----
        formation.add("Engine");
        formation.add("Sleeper");
        formation.add("Cargo");
        formation.add("Guard");

        // Duplicate (will be ignored)
        formation.add("Sleeper");

        // Display final formation
        System.out.println("Final Train Formation:");
        System.out.println(formation);

        System.out.println("\nNote:");
        System.out.println("LinkedHashSet preserves insertion order and removes duplicates automatically.");

        System.out.println("\nUC5 formation setup completed ...");
    }
}