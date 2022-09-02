import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
public class ch32_5 extends Application {
	@Override 									// Override Application���O��start()
	public void start(Stage primaryStage) {
		Circle circle = new Circle(); 			// �إ�Circle����
		circle.setCenterX(150); 				// �]�w�ꤤ��x�y��
		circle.setCenterY(100); 				// �]�w�ꤤ��y�y��
		circle.setRadius(50);					// ��b�|
		circle.setStroke(Color.BLUE); 			// ��~���Ŧ�
		circle.setFill(Color.YELLOW); 			// �ꤺ����W����
		
		Pane pane = new Pane(); 				// �إ�pane����
		pane.getChildren().add(circle);			// �bpane���󤺫إ�circle
		Scene scene = new Scene(pane, 300, 200); 		// �Npane�����Jscene
		primaryStage.setTitle("ch32_5"); 		// �]�wstage���D
		primaryStage.setScene(scene); 			// �Nscene��bstage
		primaryStage.show();  					// ���stage
	}
  
	public static void main(String[] args) { 
		launch(args);
	}
}

