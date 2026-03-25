import java.util.List;
import java.util.ArrayList;

public class TrainConsistMgmnt {

    public  static void main(String[] args) {

        // Display welcome banner
        System.out.println("====================================");
        System.out.println(" Train Consist Management App ");
        System.out.println("====================================\n");

        // Create a dynamic list to store train bogies
        List<String> trainConsist = new ArrayList<>();

        // Display initial consist information
        System.out.println("Train initialized successfully ...");

        // Display initial bogie count
        System.out.println("Initial Bogie Count : " + trainConsist.size());

        // Display current state of train
        System.out.println("Current Train Consist : " + trainConsist);

    }
}
