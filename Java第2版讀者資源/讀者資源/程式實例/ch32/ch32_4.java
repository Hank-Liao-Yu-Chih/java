import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
public class ch32_4 extends Application {
	@Override 									// Override Application���O��start()
	public void start(Stage primaryStage) {
		StackPane pane = new StackPane(); 		// �إ�pane����
		pane.getChildren().add(new Button("JavaFX"));	// �bpane���󤺫إ߫��s
		Scene scene = new Scene(pane, 300, 200); 		// �Npane�����Jscene
		primaryStage.setTitle("ch32_4"); 		// �]�wstage���D
		primaryStage.setScene(scene); 			// �Nscene��bstage
		primaryStage.show();  					// ���stage
	}
  
	public static void main(String[] args) { 
		launch(args);
	}
}

