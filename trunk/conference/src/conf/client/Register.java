package conf.client;

import conf.client.GreetingService;
import conf.client.GreetingServiceAsync;
import conf.shared.FieldVerifier;
import conf.shared.Proxy2;
import conf.shared.RakstsRequest;
import conf.shared.RakstsRequestf;
import com.google.gwt.requestfactory.shared.Request;
import com.google.gwt.requestfactory.shared.Receiver;
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
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;
import com.google.gwt.user.client.ui.SimpleCheckBox;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.DecoratedTabPanel;


public class Register extends DialogBox {
	
	private final GreetingServiceAsync greetingService = GWT
	.create(GreetingService.class);
	
	//requestFactory.initialize(eventBus);
	public Register() {
	//	super(true);
		setText("Pieteikties konferencei");
		setSize("640", "800");
		
		AbsolutePanel absolutePanel = new AbsolutePanel();
		setWidget(absolutePanel);
		absolutePanel.setSize("619px", "756px");
		
		Label lblWork = new Label("Pieteik\u0161an\u0101s konferencei");
		absolutePanel.add(lblWork, 154, 10);
		
		AbsolutePanel absolutePanel_2 = new AbsolutePanel();
		absolutePanel.add(absolutePanel_2, 45, 333);
		absolutePanel_2.setSize("489px", "209px");
		
		Label lblDarbaVaditajs = new Label("Darba vaditajs");
		absolutePanel_2.add(lblDarbaVaditajs, 10, 10);
		
		Label label = new Label("V\u0101rds");
		absolutePanel_2.add(label, 10, 42);
		label.setSize("34px", "16px");
		
		Label label_1 = new Label("Uzvards");
		absolutePanel_2.add(label_1, 10, 72);
		label_1.setSize("46px", "16px");
		
		Label label_2 = new Label("E-pasts");
		absolutePanel_2.add(label_2, 10, 100);
		label_2.setSize("45px", "16px");
		
		Label label_3 = new Label("Adrese");
		absolutePanel_2.add(label_3, 10, 133);
		label_3.setSize("41px", "16px");
		
		Label label_4 = new Label("Talru\u0146a Nr. ");
		absolutePanel_2.add(label_4, 10, 155);
		label_4.setSize("63px", "16px");
		
		TextBox textBox_5 = new TextBox();
		absolutePanel_2.add(textBox_5, 69, 34);
		
		TextBox textBox_6 = new TextBox();
		absolutePanel_2.add(textBox_6, 69, 72);
		
		TextBox textBox_7 = new TextBox();
		absolutePanel_2.add(textBox_7, 69, 100);
		
		TextBox textBox_8 = new TextBox();
		absolutePanel_2.add(textBox_8, 69, 125);
		
		TextBox textBox_9 = new TextBox();
		absolutePanel_2.add(textBox_9, 79, 147);
		
		ListBox listBox = new ListBox();
		absolutePanel_2.add(listBox, 373, 72);
		listBox.setSize("90px", "22px");
		
		Label lblGrds = new Label("Gr\u0101ds");
		absolutePanel_2.add(lblGrds, 299, 72);
		
		Label lblAmats = new Label("Amats");
		absolutePanel_2.add(lblAmats, 278, 108);
		
		Label lblDarbaVieta = new Label("Darba vieta");
		absolutePanel_2.add(lblDarbaVieta, 278, 147);
		
		ListBox comboBox_1 = new ListBox();
		absolutePanel_2.add(comboBox_1, 346, 102);
		
		ListBox comboBox_2 = new ListBox();
		absolutePanel_2.add(comboBox_2, 348, 149);
		
		AbsolutePanel absolutePanel_3 = new AbsolutePanel();
		absolutePanel.add(absolutePanel_3, 45, 561);
		absolutePanel_3.setSize("489px", "151px");
		
		Label lblInformcijaParRakstu = new Label("Inform\u0101cija par rakstu");
		absolutePanel_3.add(lblInformcijaParRakstu, 10, 10);
		
		Label lblRakstaNosaukums = new Label("Raksta nosaukums");
		absolutePanel_3.add(lblRakstaNosaukums, 154, 33);
		
		TextArea textArea = new TextArea();
		absolutePanel_3.add(textArea, 10, 67);
		textArea.setSize("461px", "66px");
		
		TextBox textBox_10 = new TextBox();
		absolutePanel_3.add(textBox_10, 272, 22);
		textBox_10.setSize("199px", "16px");
		
		Label lblAnnotcija = new Label("Annot\u0101cija");
		absolutePanel_3.add(lblAnnotcija, 10, 52);
		
		final Button btnPieteikties = new Button("Pieteikties");
		btnPieteikties.addClickHandler(new ClickHandler() {
			private void sendNameToServer() {
                // First, we validate the input.
        

                // Then, we send the input to the server.
				btnPieteikties.setEnabled(false);
        
              
                
                greetingService.greetServer("",
                                "", "", "", new AsyncCallback<Boolean>() {
                                        public void onFailure(Throwable caught) {
                                                // Show the RPC error message to the user
                                                
                                                
                                        }


                                        @Override
                                        public void onSuccess(Boolean result) {
                                                // TODO Auto-generated method stub
                                                
                                        }
                                });
        }
			public void onClick(ClickEvent event) {
				sendNameToServer();
                Register.this.hide();
			
			}
		});
		absolutePanel.add(btnPieteikties, 418, 718);
		btnPieteikties.setSize("100px", "28px");
		
		DecoratedTabPanel decoratedTabPanel = new DecoratedTabPanel();
		absolutePanel.add(decoratedTabPanel, 45, 32);
		decoratedTabPanel.setSize("489px", "283px");
		
		AbsolutePanel absolutePanel_1 = new AbsolutePanel();
		decoratedTabPanel.add(absolutePanel_1, "Autors", false);
		absolutePanel_1.setSize("418px", "258px");
		
		Label lblInformcijaParAutoru = new Label("Inform\u0101cija par autoru");
		absolutePanel_1.add(lblInformcijaParAutoru, 10, 10);
		
		TextBox textBox = new TextBox();
		absolutePanel_1.add(textBox, 142, 32);
		
		TextBox textBox_1 = new TextBox();
		absolutePanel_1.add(textBox_1, 142, 72);
		
		Label lblVrds = new Label("V\u0101rds");
		absolutePanel_1.add(lblVrds, 10, 32);
		
		Label lblUzvards = new Label("Uzvards");
		absolutePanel_1.add(lblUzvards, 10, 72);
		
		ListBox comboBox = new ListBox();
		absolutePanel_1.add(comboBox, 142, 102);
		
		Label lblEpasts = new Label("E-pasts");
		absolutePanel_1.add(lblEpasts, 10, 140);
		
		TextBox textBox_2 = new TextBox();
		absolutePanel_1.add(textBox_2, 95, 140);
		
		Label lblTalruaNr = new Label("Talru\u0146a Nr. ");
		absolutePanel_1.add(lblTalruaNr, 10, 175);
		
		TextBox textBox_3 = new TextBox();
		absolutePanel_1.add(textBox_3, 95, 167);
		
		TextBox textBox_4 = new TextBox();
		absolutePanel_1.add(textBox_4, 95, 197);
		
		Label lblAdrese = new Label("Adrese");
		absolutePanel_1.add(lblAdrese, 15, 197);
		
		Label lblStudijuProgLm = new Label("Studiju prog. l\u012Bm.");
		absolutePanel_1.add(lblStudijuProgLm, 10, 108);
		
		Button btnPievienotPapildusAutoru = new Button("Pievienot papildus autoru");
		absolutePanel_1.add(btnPievienotPapildusAutoru, 228, 220);
		btnPievienotPapildusAutoru.setSize("180px", "28px");
		
		
	
	}
}
