
package demobutton;

//import javafx.Button;
import javafx.application.Application;
import javafx.application.*;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.paint.*;
import javafx.scene.layout.*;


public class DemoButton extends Application {

    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
       Button b=new Button("_Click me");
       b.setTextFill(Color.BLUE);
       b.setMnemonicParsing(true);
       Tooltip t=new Tooltip("Click the button to save data");
       b.setTooltip(t);
       b.setStyle("-fx-border-color:green;-fx-background-color:orange");
       Alert a=new Alert(AlertType.INFORMATION,"You have save the data");
       b.setOnAction(e->a.show());
       
       
       
       FlowPane f=new FlowPane(b);
       Scene sc=new Scene(f);
       stage.setScene(sc);
       stage.show();
    }
    
}
