import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
public class ch32_3 extends Application {
	@Override 									// Override Application���O��start()
	public void start(Stage primaryStage) {
		Scene scene = new Scene(new Button("JavaFX"), 300, 200);
		primaryStage.setTitle("ch32_3"); 		// �]�wstage���D
		primaryStage.setScene(scene); 			// �Nscene��bstage
		primaryStage.show();  					// ���stage

// �إ߲�2��stage		
		Stage stage = new Stage(); 				// �إ߷s��stage
		stage.setTitle("stage 2"); 				// �]�wstage���Dstage 2
		stage.setScene(new Scene(new Button("OK"), 200, 50));
		stage.show();
	}
  
	public static void main(String[] args) { 
		launch(args);
	}
}

