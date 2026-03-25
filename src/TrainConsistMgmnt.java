import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * MAIN CLASS - UseCase7TrainConsistMgmnt
 *
 * Use Case 7: Sort Bogies by Capacity (Comparator)
 *
 * @author Developer
 * @version 7.0
 */

public class TrainConsistMgmnt {

    // Inner Bogie class
    static class Bogie {
        String name;
        int capacity;

        // Constructor
        Bogie(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }
    }

    public static void main(String[] args) {

        // Header
        System.out.println("==============================================");
        System.out.println(" UC7 - Sort Bogies by Capacity (Comparator) ");
        System.out.println("==============================================\n");

        // Create list
        List<Bogie> bogies = new ArrayList<>();

        // ---- ADD bogies ----
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        // ---- BEFORE SORT ----
        System.out.println("Before Sorting:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        // ---- SORT using Comparator ----
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        // ---- AFTER SORT ----
        System.out.println("\nAfter Sorting by Capacity:");
        for (Bogie b : bogies) {
            System.out.println(b.name + " -> " + b.capacity);
        }

        System.out.println("\nUC7 sorting completed ...");
    }
}