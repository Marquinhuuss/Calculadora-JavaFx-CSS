package application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class Main extends Application {
	double raiz ;
	double valor1 = 0;
	double valor2 = 0;
	double x = 0;
	double resultado = 0;
	String operacao = "";
	@Override
	public void start(Stage primaryStage) {
		AnchorPane root = new AnchorPane();
		root.setId("root");

		try {

			// aonde irá aparecer os numeros inseridos
			TextField txtEntrada = new TextField();
			txtEntrada.setLayoutX(0);
			txtEntrada.setMinWidth(350);
			txtEntrada.setMinHeight(100);
			
			txtEntrada.setId("txt");

			// botão 0
			Button btn0 = new Button();
			btn0.setText("0");
			btn0.setLayoutX(5);
			btn0.setLayoutY(365);
			btn0.setMinSize(125, 60);
			btn0.setId("botao0");

			btn0.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {

					txtEntrada.setText(txtEntrada.getText() + "0");
				}
			});

			// botão 1
			Button btn1 = new Button();
			btn1.setText("1");
			btn1.setLayoutX(5);
			btn1.setLayoutY(300);
			btn1.setMinSize(60, 60);
			btn1.setId("botao1");

			btn1.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {

					txtEntrada.setText(txtEntrada.getText() + "1");
				}
			});

			// botão 2
			Button btn2 = new Button();
			btn2.setText("2");
			btn2.setLayoutX(70);
			btn2.setLayoutY(300);
			btn2.setMinSize(60, 60);
			btn2.setId("botao2");

			btn2.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {

					txtEntrada.setText(txtEntrada.getText() + "2");
				}
			});

			// botão 3
			Button btn3 = new Button();
			btn3.setText("3");
			btn3.setLayoutX(135);
			btn3.setLayoutY(300);
			btn3.setMinSize(60, 60);
			btn3.setId("botao3");

			btn3.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {

					txtEntrada.setText(txtEntrada.getText() + "3");
				}
			});
			// botão 4
			Button btn4 = new Button();
			btn4.setText("4");
			btn4.setLayoutX(5);
			btn4.setLayoutY(235);
			btn4.setMinSize(60, 60);
			btn4.setId("botao4");

			btn4.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtEntrada.setText(txtEntrada.getText() + "4");

				}
			});
			// botão 5
			Button btn5 = new Button();
			btn5.setText("5");
			btn5.setLayoutX(70);
			btn5.setLayoutY(235);
			btn5.setMinSize(60, 60);
			btn5.setId("botao5");

			btn5.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtEntrada.setText(txtEntrada.getText() + "5");

				}
			});

			// botão 6
			Button btn6 = new Button();
			btn6.setText("6");
			btn6.setLayoutX(135);
			btn6.setLayoutY(235);
			btn6.setMinSize(60, 60);
			btn6.setId("botao6");

			btn6.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtEntrada.setText(txtEntrada.getText() + "6");

				}
			});

			// botão 7
			Button btn7 = new Button();
			btn7.setText("7");
			btn7.setLayoutX(5);
			btn7.setLayoutY(170);
			btn7.setMinSize(60, 60);
			btn7.setId("botao7");

			btn7.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtEntrada.setText(txtEntrada.getText() + "7");

				}
			});
			// botão 8
			Button btn8 = new Button();
			btn8.setText("8");
			btn8.setLayoutX(70);
			btn8.setLayoutY(170);
			btn8.setMinSize(60, 60);
			btn8.setId("botao8");

			btn8.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtEntrada.setText(txtEntrada.getText() + "8");

				}
			});

			// botão 9
			Button btn9 = new Button();
			btn9.setText("9");
			btn9.setLayoutX(135);
			btn9.setLayoutY(170);
			btn9.setMinSize(60, 60);
			btn9.setId("botao9");

			btn9.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtEntrada.setText(txtEntrada.getText() + "9");

				}
			});
			// botão de limpar (C)
			Button btnC = new Button();
			btnC.setText("C");
			btnC.setLayoutX(5);
			btnC.setLayoutY(105);
			btnC.setMinSize(60, 60);
			btnC.setId("botaoC");

			btnC.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {

					valor1 = 0;
					valor2 = 0;
					txtEntrada.setText("");
					operacao = "";

				}
			});

			// botão de somar (+)
			Button btnMais = new Button();
			btnMais.setText("+");
			btnMais.setLayoutX(200);
			btnMais.setLayoutY(300);
			btnMais.setMinSize(60, 60);
			btnMais.setId("botaosomar");

			btnMais.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {

					valor1 = Double.parseDouble(txtEntrada.getText());
					txtEntrada.setText("");
					operacao = "+";

				}
			});

			// botão de subtrair (-)
			Button btnMenos = new Button();
			btnMenos.setText("-");
			btnMenos.setLayoutX(200);
			btnMenos.setLayoutY(235);
			btnMenos.setMinSize(60, 60);
			btnMenos.setId("botaomenos");

			btnMenos.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {

					valor1 = Double.parseDouble(txtEntrada.getText());
					txtEntrada.setText("");
					operacao = "-";

				}
			});

			// botão de raiz (√)
			Button btnRaiz = new Button();
			btnRaiz.setText("√");
			btnRaiz.setLayoutX(70);
			btnRaiz.setLayoutY(105);
			btnRaiz.setMinSize(60, 60);
			btnRaiz.setId("botaoRaiz");

			btnRaiz.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					valor1 = Double.parseDouble(txtEntrada.getText());
					txtEntrada.setText("");
					operacao = "√";

					resultado = Math.sqrt(valor1);

					txtEntrada.setText(String.valueOf(resultado));

				}
			});
			
			//botão porcentagem (%)
			Button btnpor = new Button();
			btnpor.setText("%");
			btnpor.setLayoutX(135);
			btnpor.setLayoutY(105);
			btnpor.setMinSize(60, 60);
			btnpor.setId("botaopor");
			

			// botão de multiplicar (*)
			Button btnMult = new Button();
			btnMult.setText("x");
			btnMult.setLayoutX(200);
			btnMult.setLayoutY(170);
			btnMult.setMinSize(60, 60);
			btnMult.setId("botaomult");

			btnMult.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {

					valor1 = Double.parseDouble(txtEntrada.getText());
					txtEntrada.setText("");
					operacao = "*";

				}
			});
			// botão de dividir (/)
			Button btnDividir = new Button();
			btnDividir.setText("÷");
			btnDividir.setLayoutX(200);
			btnDividir.setLayoutY(105);
			btnDividir.setMinSize(60, 60);
			btnDividir.setId("botaodividir");

			btnDividir.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {

					valor1 = Double.parseDouble(txtEntrada.getText());
					txtEntrada.setText("");
					operacao = "/";

				}
			});
			
			
			
			
			// botão de virgula (.)
			Button btnVirgula = new Button();
			btnVirgula.setText(".");
			btnVirgula.setLayoutX(135);
			btnVirgula.setLayoutY(365);
			btnVirgula.setMinSize(60 , 60);
			
			btnVirgula.setId("botaovirgula");

			btnVirgula.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					txtEntrada.setText(txtEntrada.getText() + ".");

				}
			});

			// botão de igual (=)
			Button btnIgual = new Button();
			btnIgual.setText("=");
			btnIgual.setLayoutX(200);
			btnIgual.setLayoutY(365);
			btnIgual.setMinSize(60, 60);
			
			btnIgual.setId("botaoigual");

			btnIgual.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					valor2 = Double.parseDouble(txtEntrada.getText());

					switch (operacao) {
					case "+":
						resultado = valor1 + valor2;
						txtEntrada.setText(String.valueOf(resultado));

						break;

					case "-":
						resultado = valor1 - valor2;
						txtEntrada.setText(String.valueOf(resultado));

						break;

					case "*":
						resultado = valor1 * valor2;
						txtEntrada.setText(String.valueOf(resultado));

						break;

					case "/":
						resultado = valor1 / valor2;
						txtEntrada.setText(String.valueOf(resultado));

						break;

					}

				}
			});

			root.getChildren().add(txtEntrada);
			root.getChildren().add(btn0);
			root.getChildren().add(btn1);
			root.getChildren().add(btn2);
			root.getChildren().add(btn3);
			root.getChildren().add(btn4);
			root.getChildren().add(btn5);
			root.getChildren().add(btn6);
			root.getChildren().add(btn7);
			root.getChildren().add(btn8);
			root.getChildren().add(btn9);
			root.getChildren().add(btnC);
			root.getChildren().add(btnMais);
			root.getChildren().add(btnMenos);
			root.getChildren().add(btnRaiz);
			root.getChildren().add(btnMult);
			root.getChildren().add(btnDividir);
			root.getChildren().add(btnVirgula);
			root.getChildren().add(btnIgual);
			root.getChildren().add(btnpor);
			Scene scene = new Scene(root, 265, 430);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}
