import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class GuiDefiner {

	private LogicContainer model;
	private Stage stage;

	protected Label webAddress = new Label("Web Address");
	protected TextField enterWebAddress = new TextField();
	protected Label port = new Label("Port");
	protected TextField enterPort = new TextField();
	protected Button connect = new Button("Connect");

	public GuiDefiner(Stage stage, LogicContainer model) {
		this.stage = stage;
		this.model = model;
		stage.setTitle("StageTitle");

		HBox hBox = new HBox();
		hBox.getChildren().add(webAddress);
		hBox.getChildren().add(enterWebAddress);
		hBox.getChildren().add(port);
		hBox.getChildren().add(enterPort);
		hBox.getChildren().add(connect);

		Scene scene = new Scene(hBox);
		stage.setScene(scene);
	}

	public void start() {
		stage.show();
	}

	public void stop() {
		stage.hide();
	}

	public Stage getStage() {
		return stage;
	}
}
