import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
public class ch32_2 extends Application {
	@Override 									// Override Application���O��start()
	public void start(Stage primaryStage) {
		Button btn = new Button("JavaFX");
		Scene scene = new Scene(btn, 300, 200);
		primaryStage.setTitle("ch32_2"); 		// �]�wstage���D
		primaryStage.setScene(scene); 			// �Nscene��bstage
		primaryStage.show();  					// ���stage
	}
  
	public static void main(String[] args) { 
		launch(args);
	}
}

