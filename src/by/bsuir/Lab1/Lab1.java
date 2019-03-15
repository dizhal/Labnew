package by.bsuir.Lab1;

//Hello
import javafx.application.Application;
import javafx.stage.Stage;

public class Lab1 extends Application {
	
	private MyGridPane grid;
	private static final String NAME_TITLE="Lab1";
	
    public static void main(String[] args) {
        launch(args);
    }
 
    public void start(Stage primaryStage) {
    	
    	grid=new MyGridPane();
    	
    	grid.positioningElements();
    	grid.addElements();
    	grid.buttonWork();
    	
    	primaryStage.setScene(grid.getScene());	
        primaryStage.setTitle(NAME_TITLE);        
        primaryStage.show();
    }
}