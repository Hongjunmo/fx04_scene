package quiz;

import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class Quiz_lmp implements IQuiz {

	@Override
	public void login(Parent root) {
		TextField id = (TextField) root.lookup("#id");
		PasswordField pw = (PasswordField) root.lookup("#pw");
		System.out.println("아이디 : " + id.getText());
		System.out.println("비밀번호 : " + pw.getText());
	}

	@Override
	public void cancle(Parent root) {
		TextField id = (TextField) root.lookup("#id");
		PasswordField pw = (PasswordField) root.lookup("#pw");
		id.clear();
		pw.clear();
		

	}

	@Override
	public void sign() {
		Alert alert= new Alert(AlertType.INFORMATION);
		alert.setTitle("회원가입 창");
		alert.setHeaderText("회원가입");
		alert.setContentText("회원가입 완료");
		alert.show();
	}

}
