import javafx.application.Application;
import javafx.stage.Stage;

public class Driver extends Application {
	private LogicContainer model;
	private GuiDefiner view;
	private LinkCreator controller;

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		model = new LogicContainer();
		view = new GuiDefiner(primaryStage, model);
		controller = new LinkCreator(view, model);
		view.start();
	}

	@Override
	public void stop() {
		if (view != null) {
			view.stop();
		}
	}
}
