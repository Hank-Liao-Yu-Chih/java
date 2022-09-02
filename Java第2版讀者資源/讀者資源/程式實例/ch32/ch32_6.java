import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
public class ch32_6 extends Application {
	@Override 									// Override Application���O��start()
	public void start(Stage primaryStage) {
		Pane pane = new Pane(); 				// �إ�pane����
		
		Circle circle = new Circle(); 			// �إ�Circle����
		circle.centerXProperty().bind(pane.widthProperty().divide(2));	// �ꤤ��x�y��
		circle.centerYProperty().bind(pane.heightProperty().divide(2));	// �ꤤ��y�y��
		circle.setRadius(50);					// ��b�|
		circle.setStroke(Color.BLUE);			// ��~���Ŧ�
		circle.setFill(Color.YELLOW);			// �ꤺ����W����
				
		pane.getChildren().add(circle);			// �bpane���󤺫إ�circle
		
		Scene scene = new Scene(pane, 300, 200); 		// �Npane�����Jscene
		primaryStage.setTitle("ch32_6"); 		// �]�wstage���D
		primaryStage.setScene(scene); 			// �Nscene��bstage
		primaryStage.show();  					// ���stage
	}
  
	public static void main(String[] args) { 
		launch(args);
	}
}

