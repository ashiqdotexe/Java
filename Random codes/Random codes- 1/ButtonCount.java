
package buttoncount;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;



public class ButtonCount extends Application  {
    int count=0;
    int cnt=0;
    Button b;
    Button c;

 
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        b=new Button("Clik");
        b.setOnAction(e->{count++;b.setText(""+count);});
        b.setPrefSize(100, 30);
        b.setText("Click me");
        FlowPane f=new FlowPane(b);
        c=new Button("Share");
        c.setPrefSize(500, 30);
        
        FlowPane fp=new FlowPane(c);
        b.setOnAction(e->{count++;c.setText(" "+count);});
        Scene s=new Scene(fp);
        Scene sc=new Scene(f);
        stage.setScene(s);
        stage.setScene(sc);
        stage.show();
        stage.show();
    }

  
    
}
