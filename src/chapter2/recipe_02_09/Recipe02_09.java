package chapter2.recipe_02_09;

import javafx.application.Application;
import javafx.embed.swing.SwingNode;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.*;

/**
 * Project: Java8Recipes
 * FileName: Recipe02_09
 * Date: 2016-10-21
 * Time: 오전 9:06
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Recipe02_09 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        final SwingNode swingNode = new SwingNode();
        createSwingContent(swingNode);

        StackPane pane = new StackPane();
        pane.getChildren().add(swingNode);

        primaryStage.setScene(new Scene(pane, 100, 50));
        primaryStage.show();
    }

    private void createSwingContent(final SwingNode swingNode) {
        SwingUtilities.invokeLater(() -> {
            swingNode.setContent(new JLabel("Hello Swing"));
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}
