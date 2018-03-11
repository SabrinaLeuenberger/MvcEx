
public class LinkCreator {

	final private GuiDefiner view;
	final private LogicContainer model;

	public LinkCreator(GuiDefiner view, LogicContainer model) {
		this.model = model;
		this.view = view;

		view.enterWebAddress.textProperty().addListener((observable, oldValue, newValue) -> {
			model.validateWebAddress(newValue);
		});

		view.enterPort.textProperty().addListener((observable, oldValue, newValue) -> {
			model.validatePort(newValue);
		});

		view.connect.setOnAction((event) -> {
			model.btnAction();
		});
	}

}
