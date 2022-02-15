
package demo1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;


public class Demo1 extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button b=new Button("Click me");//Children
        FlowPane f=new FlowPane ();//Parents; P
        f.getChildren().add(b);//Putting children in parents
        Scene sc=new Scene(f);//It will show in the window
        
        stage.setScene(sc);
        stage.show();
        
    }

    
    public static void main(String[] args) {
        launch(args);
    }

    
    
}
