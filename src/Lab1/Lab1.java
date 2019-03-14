package Lab1;

//Proverka gitignore
import javafx.application.Application;
import javafx.stage.Stage;

public class Lab1 extends Application {
	
	private MyGridPane grid;
	
    public static void main(String[] args) {
        launch(args);
    }
 
    public void start(Stage primaryStage) {
    	
    	grid=new MyGridPane();
    	
    	grid.positioning_elements();
    	grid.add_elements();
    	grid.button_work();
    	
    	primaryStage.setScene(grid.get_scene());
    	
        primaryStage.setTitle("Lab1");
         
        primaryStage.show();
    }
}