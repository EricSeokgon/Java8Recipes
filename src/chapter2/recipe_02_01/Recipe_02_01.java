package chapter2.recipe_02_01;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * Created by hadeslee on 2016-10-15.
 */
public class Recipe_02_01 extends Application {
    final Group root = new Group();

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello Lambda");
        Scene scene = new Scene(root, 300, 250);
        Button btn = new Button();
        Label message = new Label();
        btn.setLayoutX(60);
        btn.setLayoutY(80);
        btn.setText("Invoke Lambda Expression");

        btn.setOnAction((event -> {
            message.setText("Lambda expression invoked!");
        }));
        root.getChildren().add(btn);
        message.setLayoutX(300 / 2 - 90);
        message.setLayoutY(30);
        root.getChildren().add(message);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
