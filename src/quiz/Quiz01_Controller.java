package quiz;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.Parent;

public class Quiz01_Controller implements Initializable {

	private Parent root;
	Quiz_lmp l = new Quiz_lmp();

	public void setRoot(Parent root) {
		this.root = root;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	}

	public void login() {
		l.login(root);
	}

	public void cancle() {
		l.cancle(root);
	}

	public void sign() {
		l.sign();
	}

}
