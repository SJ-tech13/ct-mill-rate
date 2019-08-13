import javafx.application.Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class Main {

    public Map<String, String> getMillRate () {

// START OF CSV READER

        List<List<String>> data = new ArrayList<>();

        Map<String, String> map = new HashMap<>(); // map that returns string, string (for municipality, mill rate  later) key, value


        try (BufferedReader b = new BufferedReader(new FileReader("2019 - FORMATTED.csv")) // Reads CSV file
        ) {
            String line;
            while ((line = b.readLine()) != null) { // BufferedReader reads line in CSV and boolean returns true if line is not empty
                String[] item = line.split(","); // Splits elements that are separated by commas and put them into a String array
                List row = Arrays.asList(item); // Cast item array into a list interface called row ["a","b","c",]
                data.add(row); // Adds new row list to data Arraylist at each loop [['a', 'b', 'c', 'd'],....['a3', 'b3', 'c3', 'd3']]
                map.put(String.valueOf(row.get(2)), String.valueOf(row.get(3))); // Puts the key string (municipality) and value (mill rate) string
            }
        } catch (Exception exception) {}
        return map;

    }
// END CSV READER

    public static void main(String[] args) {

        Main inquire = new Main();

        System.out.println(inquire.getMillRate().get("Glastonbury"));

//        WINDOW LAUNCHER, DO NOT DELETE
        Application.launch(MillRateApplication.class, args);



    }
}
