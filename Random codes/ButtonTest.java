
package buttontest;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ButtonTest extends Application {
   int one = 0, two = 0;

   @Override
   public void start(Stage stage) {

       // set scene and title
       Scene scene = new Scene(new Group(), 450, 100);
       stage.setTitle("Buttons");

       // instantiate two TextFields
       Text t1 = new Text();

       // instantiate addBtn buttons
       Button btnFirst = new Button("First");
       Button btnSecond = new Button("Second");

       // instantiate gridpane, setVgap,Hgap,padding and add children
       GridPane grid = new GridPane();
       grid.setVgap(5);
       grid.setHgap(10);
       grid.setPadding(new Insets(5, 5, 5, 5));
       grid.add(btnFirst, 1, 0);
       grid.add(btnSecond, 1, 1);
       grid.add(t1, 2, 1);

       // First button click event
       btnFirst.setOnMouseClicked((MouseEvent event) -> {
           one++; // increment one
           if ((one == two)) { // check for the equal times click
               t1.setText("You have clicked first and second button the same number of times.");
           } else {
               t1.setText("First button click " + String.valueOf(one) + " times."); 
           }

       });
       // Second button click event
       btnSecond.setOnMouseClicked((MouseEvent event) -> {
           two++; // increment one
           if ((two == one)) { 

               t1.setText("You have clicked Second and first button the same number of times."); 
           } else {
               t1.setText("Second button click " + String.valueOf(two) + " times."); 
           }

       });
       
       Group root = (Group) scene.getRoot();
       root.getChildren().add(grid);
       
       stage.setScene(scene);
       stage.show();
   }

   
   
   public static void main(String[] args) {
       Application.launch(args);
   }
}
