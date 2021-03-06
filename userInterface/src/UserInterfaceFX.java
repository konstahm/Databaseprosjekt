/**
 * Created by Halvor on 14.03.2017.
 */

import com.sun.xml.internal.ws.api.model.ExceptionType;
import javafx.application.Application;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

import java.time.LocalDate;


public class UserInterfaceFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private void addLabelAndTextToGrid(String tekst, GridPane grid, int kolonne, int rad, Control felt) {
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

        DatePicker dato = new DatePicker();
        addLabelAndTextToGrid("Dato", grid, 0, 2, dato);

        TextField temp = new TextField();
        addLabelAndTextToGrid("Temperatur", grid, 0, 4, temp);

        TextField form = new TextField();
        addLabelAndTextToGrid("Personlig form", grid, 0, 6, form);

        TextField prestasjon = new TextField();
        addLabelAndTextToGrid("Prestasjon", grid, 0, 8, prestasjon);

        TextField notat = new TextField();
        addLabelAndTextToGrid("Notat", grid, 0, 10, notat);

        saveBtn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String treningsID = treningsØktID.getCharacters().toString();
                try {
                    LocalDate sqlDato = dato.getValue();        //http://stackoverflow.com/questions/530012/how-to-convert-java-util-date-to-java-sql-date
                    int tempInt = Integer.parseInt(temp.getCharacters().toString());
                    int formInt = Integer.parseInt(form.getCharacters().toString());
                    int prestasjonsInt = Integer.parseInt(prestasjon.getCharacters().toString());
                }
                catch(Exception e){
                    System.out.print("ugreit");
                }

                String notatString = notat.getCharacters().toString();
                // kjør konstantin sin kode
            }
        });

        besteBtn.setOnAction(new EventHandler<ActionEvent>() {
             @Override
             public void handle(ActionEvent event) {
                 grid.add(new Label("Beste Treningsøkt, ID: "), 2, 0);
                 grid.add(new Label("Prestasjon: "), 2, 1);
                 grid.add(new Label("Dato: "), 2, 2);
                 grid.add(new Label("Tepmeratur: "), 2, 3);
                 grid.add(new Label("Form: "), 2, 4);
                 grid.add(new Label("Notat: "), 2, 5);
             }
        });


                primaryStage.setScene(new Scene(grid));
        primaryStage.show();
    }
}
