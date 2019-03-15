package by.bsuir.Lab1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.control.Label;
import javafx.scene.layout.RowConstraints;
import javafx.scene.control.TextField;
import javafx.geometry.Insets;
import javafx.scene.Scene;

public class MyGridPane {
	private Scene scene;
	private GridPane root;
	
	private Label sin;
	private Label begin_interval;
	private Label end_interval;
	private Label inter;
	private TextField tbegin_interval;
	private TextField tend_interval;
	private Button btn1;
	
	private static final String SIN="sin(x)dx";
	private static final String BEGIN="Начало интервала";
	private static final String END="Конец интервала";
	private static final String INTEGRAL="Интеграл ";
	private static final String NAME_BUTTON="Интегрировать";
	
	public MyGridPane() {

    	root = new GridPane();    
    	
    	sin = new Label(SIN);
        begin_interval = new Label(BEGIN);     
        end_interval = new Label(END);        
        inter = new Label(INTEGRAL);
        
        tbegin_interval=new TextField();
        tend_interval=new TextField();
        
        btn1 = new Button();
		btn1.setText(NAME_BUTTON);
		
		scene = new Scene(root, 400, 150);
	}
	
	public void positioningElements() {
    	GridPane.setMargin(sin, new Insets(20));
        GridPane.setMargin(begin_interval, new Insets(20));
        GridPane.setMargin(end_interval, new Insets(20));
        GridPane.setMargin(inter, new Insets(20));
  
        root.getColumnConstraints().add(new ColumnConstraints(145));
		root.getColumnConstraints().add(new ColumnConstraints(235));
		 
		root.getRowConstraints().add(new RowConstraints(40));
        root.getRowConstraints().add(new RowConstraints(30));
	    root.getRowConstraints().add(new RowConstraints(30));
		root.getRowConstraints().add(new RowConstraints(40));
	}
	
	public void addElements() {
		root.add(sin,0, 0);
		root.add(begin_interval, 0, 1);
		root.add(end_interval, 0,2);
		root.add(inter, 0, 3);
	    root.add(tbegin_interval, 1, 1);
	    root.add(tend_interval, 1, 2);
        root.add(btn1, 1, 3);
	}
	
	public void buttonWork() {
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			
    	    public void handle(ActionEvent event) {
    	    Integer from=Integer.parseInt(tbegin_interval.getText());
    	    Integer to=Integer.parseInt(tend_interval.getText());
    	    inter.setText("Интеграл  " + (to-from)*(Math.sin(to)+Math.sin(from))/2);
    	    
    		}		
    	});
	}
	
	public Scene getScene() {
		return scene;
	}
 
}
