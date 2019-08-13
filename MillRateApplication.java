import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class MillRateApplication extends Application {

// PLOT DATA MEMBERS TEST - WORK IN PROGRESS
    /*
    final CategoryAxis xAxis = new CategoryAxis();
    final NumberAxis yAxis = new NumberAxis(1990, 1995, 1);
     */
// END PLOT DATA MEMBERS

    @Override
    public void init() throws Exception {
        System.out.println("Window launched.");
    }

    @Override
    public void start(Stage stage) throws Exception {

// PLOT OBJECTS TEST - WORK IN PROGRESS
        /*
        LineChart<Number, Number> testChart = new LineChart(xAxis, yAxis);
        testChart.setTitle("Test Line Chart");

        xAxis.setLabel("Year");
        yAxis.setLabel("Mill Rate");

        XYChart.Series s1 = new XYChart.Series();
        XYChart.Series s2 = new XYChart.Series();

        s1.setName("City A");
        s2.setName("City B"); 

        s1.getData().add(new XYChart.Data<>('year', '' ));
        s2.getData().add(new XYChart.Data<>());
        */


// STAGE OBJECTS

        Text centerContent = new Text("Center Pane");
        Text bottomContent = new Text("Bottom Pane");
        // Text topContent = new Text("Top Pane");
        Text leftContent = new Text("Left Pane");
        Text rightContent = new Text("Right Pane");


        HBox topFieldContainer = new HBox();
        topFieldContainer.setPadding(new Insets(5));

        Button button1 = new Button("Enter");
        button1.setPrefSize(70, 20);

        TextField inputTextField = new TextField();
        inputTextField.setPrefSize(50, 20);

        HBox.setHgrow(inputTextField, Priority.ALWAYS);
        HBox.setHgrow(button1, Priority.ALWAYS);
        topFieldContainer.getChildren().addAll(new Label("Municipality: "), inputTextField, button1);
        topFieldContainer.setAlignment(Pos.CENTER_LEFT);

        BorderPane.setAlignment(centerContent, Pos.CENTER);
        BorderPane.setAlignment(topFieldContainer, Pos.TOP_CENTER);
        BorderPane.setAlignment(bottomContent, Pos.BOTTOM_CENTER);
        BorderPane.setAlignment(leftContent, Pos.CENTER_LEFT);
        BorderPane.setAlignment(rightContent, Pos.CENTER_RIGHT);

        BorderPane home = new BorderPane(centerContent, topFieldContainer, rightContent, bottomContent, leftContent); // center, top, right, bottom, left
        home.setPrefSize(300, 300);

        Scene scene = new Scene(home);
        stage.setScene(scene);
        stage.setTitle("Mill Rate 2019 Query");
        stage.show();

// END STAGE OBJECTS


    }

    @Override
    public void stop() throws Exception {
        System.out.println("Window closed.");
    }
}
