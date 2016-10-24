package chapter2.recipe_02_11;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.print.Printer;
import javafx.print.PrinterJob;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 * Project: Java8Recipes
 * FileName: Recipe02_11
 * Date: 2016-10-24
 * Time: 오전 9:14
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Recipe02_11 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        TextArea ta = new TextArea();
        ta.setWrapText(true);

        final Printer selectedPrinter = Printer.getDefaultPrinter();
        Button printButton = new Button("Print");
        printButton.setOnAction((ActionEvent event) -> {
            print(ta, selectedPrinter);
        });

        FlowPane pane = new FlowPane();
        pane.getChildren().add(ta);
        pane.getChildren().add(printButton);

        primaryStage.setScene(new Scene(pane, 500, 300));
        primaryStage.show();
    }

    public void print(final Node node, Printer printer) {
        PrinterJob job = PrinterJob.createPrinterJob();
        job.setPrinter(printer);

        if (job != null) {
            boolean success = job.printPage(node);
            if (success) {
                job.endJob();
            }

        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
