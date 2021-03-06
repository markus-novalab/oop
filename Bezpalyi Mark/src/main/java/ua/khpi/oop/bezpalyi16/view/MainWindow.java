package ua.khpi.oop.bezpalyi16.view;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import ua.khpi.oop.bezpalyi16.model.ManipulatorModels;

/**
 * Class that realize main window.
 *
 * @author Bezpalyi M.
 * @version 1.0
 **/
public class MainWindow extends Application {

    /**
     * Model with various buttons.
     */
    private final ManipulatorModels manipulatorModels;

    public MainWindow() {
        manipulatorModels = new ManipulatorModels();
    }

    /**
     * Method to start app.
     * @param argv command line arguments.
     */
    public void go(String[] argv) {
        Application.launch(argv);
    }

    /**
     * Method - entry point for java FX.
     * @param stage root stage;
     */
    @Override
    public void start(final Stage stage) {

        stage.setTitle("Container Manipulator");
        AnchorPane pane = new AnchorPane();
        VBox vBox1 = new VBox();
        vBox1.getChildren().addAll(
                manipulatorModels.addNewAddressBookButton(stage),
                manipulatorModels.addSearchButton(stage),
                manipulatorModels.addShowAllButton(stage),
                manipulatorModels.addRemoveButton(stage),
                manipulatorModels.addRemoveAllButton(stage),
                manipulatorModels.addUpdateButton(stage),
                manipulatorModels.addSizeLabelRaw());
        pane.getChildren().add(vBox1);
        Scene sc = new Scene(pane, 700, 400);
        stage.setScene(sc);
        stage.show();
    }
}