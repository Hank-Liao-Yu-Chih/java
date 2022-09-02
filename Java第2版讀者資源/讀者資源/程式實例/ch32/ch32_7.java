import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
public class ch32_7 extends Application {
	@Override 									// Override Application���O��start()
	public void start(Stage primaryStage) {
		StackPane pane = new StackPane(); 		// �إ�pane����
		Button btn = new Button("JavaFX"); 		// �إ߫��sJavaFX
		btn.setStyle("-fx-border-color: green;"); 	// �إ��ݩ�
		pane.getChildren().add(btn);			// �bpane���󤺫إ߫��s
	
		pane.setRotate(30); 					// ��������30��
		pane.setStyle("-fx-border-color: blue; -fx-background-color: yellow;");
	
		Scene scene = new Scene(pane, 300, 200); 		// �Npane�����Jscene
		primaryStage.setTitle("ch32_7"); 		// �]�wstage���D
		primaryStage.setScene(scene); 			// �Nscene��bstage
		primaryStage.show();  					// ���stage
	}
  
	public static void main(String[] args) { 
		launch(args);
	}
}

