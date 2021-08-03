package com.houarizegai.javafxdemo.chart;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.util.Duration;

public class PieChartDemo extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        
        ObservableList<PieChart.Data> ol = FXCollections.observableArrayList(
                new PieChart.Data("Java", 40),
                new PieChart.Data("C", 20),
                new PieChart.Data("Python",10),
                new PieChart.Data("Pascal", 5),
                new PieChart.Data("C++", 18),
                new PieChart.Data("Roby", 3),
                new PieChart.Data("PHP", 3),
                new PieChart.Data("Kotlin", 7),
                new PieChart.Data("Delphi", 5),
                new PieChart.Data("C#", 6),
                new PieChart.Data("Perl", 1)
        );
        
        PieChart pc = new PieChart();
        pc.setTitle("Programming Language");
        pc.setData(ol);
        pc.setLabelsVisible(true); // Visibility de Label a cauté de Coumenbaire
        pc.setLabelLineLength(20); // Espace entre Label et Coumenbaire
        pc.setLegendSide(Side.LEFT); // Position OF The Legend
        
        FadeTransition ft = new FadeTransition(Duration.seconds(3), pc);
        ft.setFromValue(0);
        ft.setToValue(1);
        ft.play();
        
        root.setCenter(pc);
        Scene scene = new Scene(root, 700, 500);
        primaryStage.setTitle("Pie Chart");
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
