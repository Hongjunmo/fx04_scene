package quiz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Quiz01_Main extends Application {

	@Override
	public void start(Stage arg0) throws Exception {

		FXMLLoader loader = new FXMLLoader(getClass().getResource("QuizEven.fxml"));
		Parent root = loader.load();
		Scene scene = new Scene(root);
		Quiz01_Controller qzctl = loader.getController();
		qzctl.setRoot(root);

		arg0.setScene(scene);
		arg0.show();
	}

	public static void main(String[] args) {

		launch(args);
	}
}
