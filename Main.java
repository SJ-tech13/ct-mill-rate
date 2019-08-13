import javafx.application.Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args) {

        List<List<String>> data = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("2019 - FORMATTED.csv"));
        ) {
            String line;
            while ((line = br.readLine()) != null) {

                String[] item = line.split(",");
                List row = Arrays.asList(item);
                data.add(row);
                // System.out.println(row);
            }
            System.out.println(data.get(8));
            System.out.println("Municipality: " + data.get(8).get(2)); // reads municipality #7, index [8] and the name at index[2]
            System.out.println("Mill rate: " + data.get(8).get(3));

        } catch (Exception exception) { }

        Application.launch(MillRateApplication.class, args);

    }
}

