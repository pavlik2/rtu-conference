package conf.client;

import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class RW1Pop1 extends PopupPanel {
TextBox textBox = new TextBox();
	public RW1Pop1() {
		super(true);
		
		AbsolutePanel absolutePanel = new AbsolutePanel();
		setWidget(absolutePanel);
		absolutePanel.setSize("272px", "92px");
		
		 
		absolutePanel.add(textBox, 29, 21);
		
		Button btnOk = new Button("Cancel");
		btnOk.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				RW1Pop1.this.hide();
			}
		});
		
		absolutePanel.add(btnOk,138 , 64);
		btnOk.setSize("100px", "28px");
		
		Button btnCancel = new Button("OK");
		btnCancel.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) { 
				RW1.comboBox_1.setItemText(7, textBox.getValue());	
			RW1Pop1.this.hide();
			}
		});
		absolutePanel.add(btnCancel, 29, 64);
		btnCancel.setSize("100px", "28px");
		
		Label lblIevadietSavuAmatu = new Label("Ievadiet savu amatu");
		absolutePanel.add(lblIevadietSavuAmatu, 46, -1);
		
	}
}
