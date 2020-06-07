package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	double height,weight,bmi;
	@FXML private TextField textFeild_height;
	@FXML private TextField textFeild_weight;
	@FXML private Label label_BMI;
	@FXML private Label label_message;
	@FXML private Button button_Enter;
	
	@FXML
	public void onClickedEnter(ActionEvent event) {
		height = Double.parseDouble(textFeild_height.getText());
		weight = Double.parseDouble(textFeild_weight.getText());
		label_BMI.setText(calculator_BMI(height,weight));
		label_message.setText(message(bmi));
	}
	
	public String calculator_BMI(double height,double weight) {
		bmi = weight / Math.pow(height / 100, 2);
		return new String(String.format("%.2f", bmi));
	}
	
	public String message(double bmi) {
		if(bmi >= 40) {
			return new String("肥満(4度)");
		}else if(bmi >= 35) {
			return new String("肥満(3度)");
		}if(bmi >= 30) {
			return new String("肥満(2度)");
		}if(bmi >= 25) {
			return new String("肥満(1度)");
		}if(bmi >= 18.5) {
			return new String("普通体重");
		}else {
			return new String("低体重(痩せ型)");
		}
	}
}
