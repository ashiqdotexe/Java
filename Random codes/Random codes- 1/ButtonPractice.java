
package buttonpractice;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Tooltip;
import javafx.scene.paint.*;
import javafx.scene.layout.*;


public class ButtonPractice extends Application {
    @Override
    public void start(Stage stage)throws Exception
    {
        Button b=new Button("_Click here to continue");
        b.setTextFill(Color.BLUE);
        b.setMnemonicParsing(true);
        b.setStyle("-fx-border-color:green;-fx-background-color:yellow;");
        Tooltip t=new Tooltip("If you want to continue this program then please click this button");
        b.setTooltip(t);
        Alert a=new Alert(AlertType.INFORMATION,"You have successfully continued");
        b.setOnAction(e->a.show());
        
        FlowPane f=new FlowPane(b);
        Scene sc=new Scene(f);
        stage.setScene(sc);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
