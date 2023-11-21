/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_smart_home1;

import javafx.application.Application;
import javafx.event.ActionEvent; //determines the event type
import javafx.geometry.*;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.text.*;
import javafx.scene.control.*;
import javafx.scene.image.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.stage.Stage;

/**
 *
 * @author HP
 */
public class Lab3_smart_home1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane pane = new BorderPane();
        
       //Top
        VBox top = new VBox();      
        top.setPadding(new Insets(15, 15, 15, 15));
        Label lb1 = new Label("Sound System controller");
        lb1.setFont(Font.font("Gill Sans", FontWeight.BOLD, 20));
        lb1.setTextFill(Color.WHITE);
               
        top.getChildren().add(lb1);
        top.setAlignment(Pos.CENTER);
        top.setStyle("-fx-border-color: grey");
        pane.setTop(top);
        
        
        /////////////////
        //Right side
        VBox right = new VBox(10);
        right.setPadding(new Insets(15, 15, 15, 15));
        Label soundLabel = new Label("Sound:");
        soundLabel.setFont(Font.font("Gill Sans", FontWeight.NORMAL, 20));
        soundLabel.setTextFill(Color.WHITE);
        soundLabel.setStyle("-fx-border-color: grey; -fx-border-width: 1");
        
        Slider slider = new Slider(0, 100, 50);
        slider.setOrientation(Orientation.VERTICAL);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(50);
        slider.setMinorTickCount(5);
        slider.setBlockIncrement(2);
                
//        ImageView mSpeaker = new ImageView("Speaker.png");
//        mSpeaker.setFitWidth(20);
//        mSpeaker.setFitHeight(20);
//        Button btMute = new Button("Mute", mSpeaker);
        
//        Event handling using lambda expression
//        btMute.setOnAction((ActionEvent e) ->{
//            slider.setValue(slider.getValue() - slider.getValue());
//        });
//        
        right.getChildren().addAll(soundLabel, slider);//, btMute
        right.setAlignment(Pos.CENTER);
        right.setStyle("-fx-border-color: grey");
    pane.setRight(right);

        
        /////////////////////////
        //Center
        HBox center = new HBox();
        center.setPadding(new Insets(15, 15, 15, 15));
        Label lbOnOff = new Label("OFF");
        lbOnOff.setFont(Font.font("Gill Sans", FontWeight.BOLD, 20));
        lbOnOff.setTextFill(Color.WHITE);
        center.setAlignment(Pos.CENTER);
        center.getChildren().addAll(lbOnOff);
        pane.setCenter(center);
        
        
        ////////////////////////
        //Bottom
        HBox bottom = new HBox(10);
        bottom.setPadding(new Insets(20));
        
        Button butStart = new Button("Start");
        bottom.setAlignment(Pos.CENTER);
        
        //Event handling using lambda expression
        butStart.setOnAction((ActionEvent e) ->{
            lbOnOff.setText("ON");
        });
        
        Button butStop = new Button("Stop");
        bottom.setAlignment(Pos.CENTER);
        
        //Event handling using lambda expression
        butStop.setOnAction((ActionEvent e) ->{
            lbOnOff.setText("OFF");
        });
        
        bottom.getChildren().addAll(butStart, butStop);
        bottom.setStyle("-fx-border-color: grey");
        pane.setBottom(bottom);
        
        
        /////////////////////////  
        //Left
        VBox left = new VBox(10);
        left.setPadding(new Insets(15, 15, 15, 15));
        Label lbLED = new Label("LED color:");
        lbLED.setFont(Font.font("Gill Sans", FontWeight.NORMAL, 20));
        lbLED.setTextFill(Color.WHITE);
        lbLED.setStyle("-fx-border-color: grey; -fx-border-width: 1");
        
        RadioButton rbRed = new RadioButton("Red");
        rbRed.setTextFill(Color.WHITE);
        RadioButton rbGreen = new RadioButton("Green");
        rbGreen.setTextFill(Color.WHITE);
        RadioButton rbBlue = new RadioButton("Blue");
        rbBlue.setTextFill(Color.WHITE);
        RadioButton rbPurple = new RadioButton("Purple");
        rbPurple.setTextFill(Color.WHITE);
        RadioButton rbWhite = new RadioButton("White");
        rbWhite.setTextFill(Color.WHITE);
        RadioButton rbGrey = new RadioButton("Grey");
        rbGrey.setTextFill(Color.WHITE);
        
        ToggleGroup group = new ToggleGroup();
        rbRed.setToggleGroup(group);
        rbGreen.setToggleGroup(group);
        rbBlue.setToggleGroup(group);
        rbPurple.setToggleGroup(group);
        rbWhite.setToggleGroup(group);
        rbGrey.setToggleGroup(group);  
//        
//        rbRed.setOnAction((ActionEvent e) ->{
//            top.setStyle("-fx-border-color: red");
//            right.setStyle("-fx-border-color: red");
//            left.setStyle("-fx-border-color: red");
//            bottom.setStyle("-fx-border-color: red");
//        });
//        
//        rbGreen.setOnAction((ActionEvent e) ->{
//            top.setStyle("-fx-border-color: green");
//            right.setStyle("-fx-border-color: green");
//            left.setStyle("-fx-border-color: green");
//            bottom.setStyle("-fx-border-color: green");
//        });
//        
//        rbBlue.setOnAction((ActionEvent e) ->{
//            top.setStyle("-fx-border-color: blue");
//            right.setStyle("-fx-border-color: blue");
//            left.setStyle("-fx-border-color: blue");
//            bottom.setStyle("-fx-border-color: blue");
//        });
//        
//        rbPurple.setOnAction((ActionEvent e) ->{
//            top.setStyle("-fx-border-color: purple");
//            right.setStyle("-fx-border-color: purple");
//            left.setStyle("-fx-border-color: purple");
//            bottom.setStyle("-fx-border-color: purple");
//        });
//
//        rbWhite.setOnAction((ActionEvent e) ->{
//            top.setStyle("-fx-border-color: white");
//            right.setStyle("-fx-border-color: white");
//            left.setStyle("-fx-border-color: white");
//            bottom.setStyle("-fx-border-color: white");
//        });
//        
//        rbGrey.setOnAction((ActionEvent e) ->{
//            top.setStyle("-fx-border-color: grey");
//            right.setStyle("-fx-border-color: grey");
//            left.setStyle("-fx-border-color: grey");
//            bottom.setStyle("-fx-border-color: grey");
//        });
//          
        left.getChildren().addAll(lbLED, rbRed, rbGreen, rbBlue, rbPurple, rbWhite, rbGrey);
        left.setAlignment(Pos.CENTER);
        left.setStyle("-fx-border-color: grey");
        pane.setLeft(left);
                

     ////////        
        Scene scene = new Scene(pane, 300, 500);
//        Image backImage = new Image("Wallpaper.jpg");
//        BackgroundImage bImg = new BackgroundImage(backImage,
//                                                   BackgroundRepeat.NO_REPEAT,
//                                                   BackgroundRepeat.NO_REPEAT,
//                                                   BackgroundPosition.DEFAULT,
//                                                   BackgroundSize.DEFAULT);
//        Background bGround = new Background(bImg);
//        pane.setBackground(bGround);
        primaryStage.setTitle("Lab3_Smart_Home1");
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
