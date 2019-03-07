package Lab1;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.control.Label;
import javafx.scene.layout.RowConstraints;
import javafx.scene.control.TextField;
//import root;

public class Lab1 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
 
  
    public void start(Stage primaryStage) {
    	
    	
    	Label sin = new Label("sin(x)dx");
        Label begin_interval = new Label("Начало интервала");
        Label end_interval = new Label("Конец интервала");
        Label inter = new Label();
         
        TextField tbegin_interval=new TextField();
        TextField tend_interval=new TextField();
        
        Button btn1 = new Button();
		btn1.setText("Интегрировать");
        
		
        GridPane root = new GridPane();  
      
        
        // определения столцов
        root.getColumnConstraints().add(new ColumnConstraints(20));
        root.getColumnConstraints().add(new ColumnConstraints(110));
        root.getColumnConstraints().add(new ColumnConstraints(250));
        
        // определения строк
        root.getRowConstraints().add(new RowConstraints(40));
        root.getRowConstraints().add(new RowConstraints(30));
        root.getRowConstraints().add(new RowConstraints(30));
        root.getRowConstraints().add(new RowConstraints(40));
        
        root.add(sin,1, 0);
        root.add(begin_interval, 1, 1);
        root.add(end_interval, 1, 2);
        root.add(inter, 1, 3);
         
        root.add(tbegin_interval, 2, 1);
        root.add(tend_interval, 2, 2);
        
        root.add(btn1, 2, 3);
        
        Scene scene = new Scene(root, 400, 150);
        
        btn1.setOnAction(new EventHandler<ActionEvent>() {
    		  
    	    public void handle(ActionEvent event) {
    	    Integer from=Integer.parseInt(tbegin_interval.getText());
    	    Integer to=Integer.parseInt(tend_interval.getText());
    	    inter.setText("Интервал " + (to-from)*(Math.sin(to)+Math.sin(from))/2);
    		}
    		
    	});
        
        
        primaryStage.setScene(scene);
         
        primaryStage.setTitle("Lab1");
         
        primaryStage.show();
    }
}