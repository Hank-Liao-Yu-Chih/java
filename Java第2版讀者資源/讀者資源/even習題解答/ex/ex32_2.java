import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
public class ex32_2 extends Application {
	@Override 									// Override Application���O��start()
	public void start(Stage primaryStage) {
		Pane pane = new HBox(10);						// HBox����
		pane.setPadding(new Insets(5, 5, 5, 5));		// �W�U���k��ɶZ��
		Image image = new Image("hung.gif");			// ����
				
		ImageView iv2 = new ImageView(image);	// �إ�iv2
		iv2.setFitHeight(50); 					// �]�w��
		iv2.setFitWidth(50); 					// �]�w�e
		
		pane.getChildren().add(iv2); 			// �[�Jiv2
		pane.getChildren().add(new ImageView(image)); 	// �[�Jimage
		
		Scene scene = new Scene(pane); 			// �Npane�����Jscene
		primaryStage.setTitle("ex32_2"); 		// �]�wstage���D
		primaryStage.setScene(scene); 			// �Nscene��bstage
		primaryStage.show();  					// ���stage
	}
  
	public static void main(String[] args) { 
		launch(args);
	}
}

