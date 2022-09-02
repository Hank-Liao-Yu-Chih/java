import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.control.*;
public class ch32_8 extends Application {
	@Override 									// Override Application���O��start()
	public void start(Stage primaryStage) {
		StackPane pane = new StackPane();
		
		Circle circle = new Circle(); 			// �إ�Circle����
		circle.setCenterX(150); 				// �]�w�ꤤ��x�y��
		circle.setCenterY(100); 				// �]�w�ꤤ��y�y��
		circle.setRadius(50);					// ��b�|
		circle.setStroke(Color.BLUE); 			// ��~���Ŧ�
		circle.setFill(Color.YELLOW); 			// �ꤺ����W����
		
		pane.getChildren().add(circle);			// �bpane���󤺫إ�circle	
		
		Label label = new Label("Java"); 		// �إ߼���
		label.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 30));
		pane.getChildren().add(label); 			// �N���ҥ[�Jpane
				
		Scene scene = new Scene(pane, 300, 200); 	// �Npane�����Jscene
		primaryStage.setTitle("ch32_8"); 		// �]�wstage���D
		primaryStage.setScene(scene); 			// �Nscene��bstage
		primaryStage.show();  					// ���stage
	}
  
	public static void main(String[] args) { 
		launch(args);
	}
}

