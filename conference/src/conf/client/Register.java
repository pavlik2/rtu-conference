package conf.client;

import conf.client.GreetingService;
import conf.client.GreetingServiceAsync;
import conf.shared.FieldVerifier;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FileUpload;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.user.client.ui.SimpleCheckBox;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.FlexTable;


public class Register extends DialogBox {
	
	private final GreetingServiceAsync greetingService = GWT
	.create(GreetingService.class);
	
	public Register() {
		super(true);
		setText("Register");
		setSize("640", "800");
		
		AbsolutePanel absolutePanel = new AbsolutePanel();
		setWidget(absolutePanel);
		absolutePanel.setSize("518px", "517px");
		
		final TextBox textBox = new TextBox();
		absolutePanel.add(textBox, 285, 65);
		
		Label lblWork = new Label("WORK");
		absolutePanel.add(lblWork, 154, 10);
		
		Label lblRakstaNosaukums = new Label("Raksta nosaukums");
		absolutePanel.add(lblRakstaNosaukums, 76, 73);
		
		final TextBox textBox_1 = new TextBox();
		absolutePanel.add(textBox_1, 285, 136);
		
		final TextBox textBox_2 = new TextBox();
		absolutePanel.add(textBox_2, 285, 210);
		
		Label lblAutori = new Label("Autori");
		absolutePanel.add(lblAutori, 76, 144);
		
		Label lblAutoruDati = new Label("Autoru dati");
		absolutePanel.add(lblAutoruDati, 76, 218);
		
		final TextArea textArea = new TextArea();
		textArea.setEnabled(false);
		absolutePanel.add(textArea, 249, 280);
		
		Label lblAnnot = new Label("Annotacija");
		absolutePanel.add(lblAnnot, 76, 304);
		
	final	Button button = new Button("New button");
		button.addClickHandler(new ClickHandler() {
			private void sendNameToServer() {
				// First, we validate the input.
			//	errorLabel.setText("");
			//	String textToServer = textBox.getText();
		//		if (!FieldVerifier.isValidName(textToServer)) {
		//			errorLabel.setText("Please enter at least four characters");
		//			return;
		//		}

				// Then, we send the input to the server.
				button.setEnabled(false);
			//	textToServerLabel.setText(textToServer);
			//	serverResponseLabel.setText("");
				greetingService.greetServer(textBox.getText(),
						textBox_1.getText(), textBox_2.getText(), textArea.getText(), new AsyncCallback<Boolean>() {
							public void onFailure(Throwable caught) {
								// Show the RPC error message to the user
								
						//		dialogBox
						//				.setText("Remote Procedure Call - Failure");
						//		serverResponseLabel
						//				.addStyleName("serverResponseLabelError");
						//		serverResponseLabel.setHTML(SERVER_ERROR);
							//	dialogBox.center();
							//	closeButton.setFocus(true);
							}
/*
							public void onSuccess(String result) {
								dialogBox.setText("Remote Procedure Call");
								serverResponseLabel
										.removeStyleName("serverResponseLabelError");
								serverResponseLabel.setHTML(result);
								dialogBox.center();
								closeButton.setFocus(true);
							} */

							@Override
							public void onSuccess(Boolean result) {
								// TODO Auto-generated method stub
								
							}
						});
			}
			
			public void onClick(ClickEvent event) {
				sendNameToServer();
				Register.this.hide();
			//	Register.hide();
			}
		});
		
		
		
		button.setText("Submit");
		absolutePanel.add(button, 389, 479);
		button.setSize("100px", "28px");
		
		FileUpload fileUpload = new FileUpload();
		absolutePanel.add(fileUpload, 248, 326);
		
		Button btnUpload = new Button("Upload");
		absolutePanel.add(btnUpload, 377, 354);
		btnUpload.setSize("100px", "28px");
		
		final SimpleCheckBox simpleCheckBox = new SimpleCheckBox();
		simpleCheckBox.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				//simpleCheckBox.
				if (simpleCheckBox.isChecked()) textArea.setEnabled(true);
				if (!simpleCheckBox.isChecked()) textArea.setEnabled(false);
			} 
		});
		
		absolutePanel.add(simpleCheckBox, 450, 280);
		
		DisclosurePanel disclosurePanel = new DisclosurePanel("New panel", false);
		absolutePanel.add(disclosurePanel, 10, 334);
		disclosurePanel.setSize("207px", "24px");
		
		FlowPanel flowPanel = new FlowPanel();
		disclosurePanel.setContent(flowPanel);
		flowPanel.setSize("5cm", "4cm");
		final FlexTable flexTable = new FlexTable();
		Button button_1 = new Button("New button");
		button_1.addClickHandler(new ClickHandler() {
			public void addRow1(FlexTable flexTable1) {
		    int numRows = flexTable1.getRowCount();
		    flexTable1.setWidget(numRows, 0, new TextArea());
		    flexTable1.setWidget(numRows, 1, new TextArea());
		    flexTable1.getFlexCellFormatter().setRowSpan(0, 1, numRows + 1);
		  }
			public void onClick(ClickEvent event) {
				addRow1(flexTable);
			}
		});
		flowPanel.add(button_1);
		button_1.setWidth("79px");
		
		
		flowPanel.add(flexTable);
		flexTable.setSize("185px", "123px");
		
		
	
	}
}
