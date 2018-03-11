
public class LinkCreator {

	// final private GuiDefiner view;
	// final private LogicContainer model;

	public LinkCreator(GuiDefiner view, LogicContainer model) {
		// this.model = model;
		// this.view = view;

		view.enterWebAddress.textProperty().addListener((observable, oldValue, newValue) -> {
			model.setWebAddress(newValue);
			view.connect.setDisable(!model.isConnectionValid());
		});

		view.enterPort.textProperty().addListener((observable, oldValue, newValue) -> {
			model.setPort(newValue);
			view.connect.setDisable(!model.isConnectionValid());
		});

		view.connect.setOnAction((event) -> {
			model.connect();
		});
	}

}
