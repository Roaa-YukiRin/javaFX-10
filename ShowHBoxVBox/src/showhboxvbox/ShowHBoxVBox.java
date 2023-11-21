/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showhboxvbox;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ShowHBoxVBox extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        HBox hBox = new HBox(15);
        hBox.setPadding(new Insets(15, 15, 15, 15));
        hBox.setStyle("-fx-background-color: gray");
        hBox.getChildren().add(new Text("Kingdom of"));
        hBox.getChildren().add(new Text("Saudi Arabia"));
        
        ImageView imageView = new ImageView
        (new Image
        ("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRCameSEnxfML-TWgfu-gp2kP9fQUucqzVRnDqrv6BaFHEa1tnr"));
        imageView.setFitHeight(100);
        imageView.setFitWidth(200);
        
        hBox.getChildren().add(imageView);
       
        VBox vBox = new VBox(15);
        vBox.setStyle("-fx-background-color: green");
        vBox.getChildren().add(new Text("Kingdom Cities"));
        vBox.setPadding(new Insets(15, 5, 5, 5));
        
        Text[] cities = {new Text("Riyadh 1301"), new Text("Makkah 1302"), new Text("Jeddah 2410"), 
        new Text("Unizah 3720")};
        
        for (Text city:cities){
        vBox.setMargin(city, new Insets(0, 0, 0, 15));
        vBox.getChildren().add(city);
        }
       
        BorderPane pane = new BorderPane();
        // Place nodes in the pane
        pane.setTop(hBox);
        pane.setLeft(vBox);
       
        Scene scene = new Scene(pane);
        primaryStage.setTitle("ShowBox");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
