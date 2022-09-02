import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class ch32_9 extends Application {
	@Override 									// Override Application���O��start()
	public void start(Stage primaryStage) {
		Pane pane = new HBox(10);						// HBox����
		pane.setPadding(new Insets(5, 5, 5, 5));		// �W�U���k��ɶZ��
		Image image = new Image("hung.gif");			// ����
		pane.getChildren().add(new ImageView(image)); 	// �[�Jimage
		
		ImageView iv2 = new ImageView(image);	// �إ�iv2
		iv2.setFitHeight(50); 					// �]�w��
		iv2.setFitWidth(50); 					// �]�w�e
		pane.getChildren().add(iv2); 			// �[�Jiv2
				
		Scene scene = new Scene(pane); 			// �Npane�����Jscene
		primaryStage.setTitle("ch32_9"); 		// �]�wstage���D
		primaryStage.setScene(scene); 			// �Nscene��bstage
		primaryStage.show();  					// ���stage
	}
  
	public static void main(String[] args) { 
		launch(args);
	}
}

