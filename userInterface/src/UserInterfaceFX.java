/**
 * Created by Halvor on 14.03.2017.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;




public class UserInterfaceFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private void addLabelAndTextToGrid(String tekst, GridPane grid, int kolonne, int rad, TextField felt) {
        Label label = new Label(tekst);
        grid.add(label, kolonne, rad);
        grid.add(felt, kolonne, rad + 1);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Treningsøkt");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Button saveBtn = new Button("Lagre treningsøkt");
        HBox sBtn = new HBox(10);
        //sBtn.setAlignment(Pos.BOTTOM_RIGHT);
        sBtn.getChildren().add(saveBtn);

        Button besteBtn = new Button("Hent beste");
        HBox bBtn = new HBox(10);
        //sBtn.setAlignment(Pos.BOTTOM_RIGHT);
        sBtn.getChildren().add(besteBtn);

        grid.add(sBtn, 0, 12);
        grid.add(bBtn, 2, 12);

        TextField treningsØktID = new TextField();
        addLabelAndTextToGrid("ID", grid, 0, 0, treningsØktID);

        TextField dato = new TextField();
        addLabelAndTextToGrid("Dato og tidspunkt", grid, 0, 2, dato);

        TextField temp = new TextField();
        addLabelAndTextToGrid("Temperatur", grid, 0, 4, temp);

        TextField form = new TextField();
        addLabelAndTextToGrid("Personlig form", grid, 0, 6, form);

        TextField prestasjon = new TextField();
        addLabelAndTextToGrid("Prestasjon", grid, 0, 8, prestasjon);

        TextField notat = new TextField();
        addLabelAndTextToGrid("Notat", grid, 0, 10, notat);

        primaryStage.setScene(new Scene(grid));
        primaryStage.show();
    }
}
