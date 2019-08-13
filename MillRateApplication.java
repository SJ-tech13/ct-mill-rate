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

    @Override

    public void init() throws Exception {
        System.out.println("Window launched.");
    }

    @Override
    public void start(Stage stage) throws Exception {
        Text centerContent = new Text("Center Pane");
        Text bottomContent = new Text("Bottom Pane");
//      Text topContent = new Text("Top Pane");
        Text leftContent = new Text("Left Pane");
        Text rightContent = new Text("Right Pane");


        HBox mainFieldContainer = new HBox();
        mainFieldContainer.setPadding(new Insets(5));

        Button button1 = new Button("Enter");
        button1.setPrefSize(70, 20);

        TextField inputTextField = new TextField();
        inputTextField.setPrefSize(50, 20);

        HBox.setHgrow(inputTextField, Priority.ALWAYS);
        HBox.setHgrow(button1, Priority.ALWAYS);
        mainFieldContainer.getChildren().addAll(new Label("Municipality: "), inputTextField, button1);
        mainFieldContainer.setAlignment(Pos.CENTER_LEFT);

        BorderPane.setAlignment(centerContent, Pos.CENTER);
        BorderPane.setAlignment(mainFieldContainer, Pos.TOP_CENTER);
        BorderPane.setAlignment(bottomContent, Pos.BOTTOM_CENTER);
        BorderPane.setAlignment(leftContent, Pos.CENTER_LEFT);
        BorderPane.setAlignment(rightContent, Pos.CENTER_RIGHT);

        BorderPane home = new BorderPane(centerContent, mainFieldContainer, rightContent, bottomContent, leftContent); // center, top, right, bottom, left
        home.setPrefSize(300, 300);

        Scene scene = new Scene(home);
        stage.setScene(scene);
        stage.setTitle("Mill Rate 2019 Query");
        stage.show();
    }

    @Override
    public void stop() throws Exception {
        System.out.println("Window closed.");
    }
}
