package conf.client;

import java.text.ParseException;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ChangeEvent;

public class RW1 extends Composite {
	public static ListBox comboBox_1 = new ListBox();
	public RW1() {
		
		HorizontalPanel horizontalPanel = new HorizontalPanel();
		horizontalPanel.setHeight("199px");
		initWidget(horizontalPanel);
		
		FlexTable flexTable = new FlexTable();
		horizontalPanel.add(flexTable);
		flexTable.setSize("286px", "165px");
		
		Label label = new Label("Vards");
		flexTable.setWidget(0, 0, label);
		
		TextBox textBox = new TextBox();
		textBox.setEnabled(false);
		flexTable.setWidget(0, 1, textBox);
		
		Label textBox_1 = new Label();
		flexTable.setWidget(1, 0, new Label("Uzvards"));
		
		TextBox textBox_2 = new TextBox();
		textBox_2.setEnabled(false);
		flexTable.setWidget(1, 1, textBox_2);
		
		//Label textBox_11 = new Label();
		flexTable.setWidget(2, 0, new Label("E-mail"));
		
		TextBox textBox_12 = new TextBox();
		textBox_12.setEnabled(false);
		flexTable.setWidget(2, 1, textBox_12);
		
		flexTable.setWidget(3, 0, new Label("Tel. Nr."));
		
		TextBox textBox_3 = new TextBox();
		flexTable.setWidget(3, 1, textBox_3);
		
		Label lblGrads = new Label("Grads");
		flexTable.setWidget(4, 0, lblGrads);
		
		ListBox comboBox = new ListBox();
		comboBox.addChangeHandler(new ChangeHandler() {
			public void onChange(ChangeEvent event) {
			}
		});
		comboBox.addItem("B. sc. ing.");
		comboBox.addItem("M. cs. ing.");
		comboBox.addItem("Doktorants");
		flexTable.setWidget(4, 1, comboBox);
		
		Label lblDarbaVieta = new Label("Darba vieta");
		flexTable.setWidget(5, 0, lblDarbaVieta);
		
		ListBox comboBox_2 = new ListBox();
		flexTable.setWidget(5, 1, comboBox_2);
		
		Label lblAmats = new Label("Amats");
		flexTable.setWidget(6, 0, lblAmats);
		
		
		comboBox_1.addChangeHandler(new ChangeHandler() {
			public void onChange(ChangeEvent event) {
				if (comboBox_1.isItemSelected(7)) {final RW1Pop1 pop = new RW1Pop1();
				//pop.show();
				pop.center(); 
				
				//String aa; 
			//	aa = pop.textBox.getText();
			//	aa =	pop.textBox.getValueOrThrow(); 
				//if(aa!=null) comboBox_1.setItemText(7, aa);
				
							
			} }
		});
		
		comboBox_1.addItem("Asistents");
		comboBox_1.addItem("Profesors/e");
		comboBox_1.addItem("Asoc. Profesors/e");
		comboBox_1.addItem("Docents");
		comboBox_1.addItem("Lektors");
		comboBox_1.addItem("Doktorants");
		comboBox_1.addItem("Asist. zin. Darba");
		comboBox_1.addItem("cits...");
		flexTable.setWidget(6, 1, comboBox_1);
		//flexTable.getWidget(1, 1).setEnabled();
		
		AbsolutePanel absolutePanel = new AbsolutePanel();
		horizontalPanel.add(absolutePanel);
		absolutePanel.setSize("150px", "164px");
		
		Button btnOk = new Button("OK");
		absolutePanel.add(btnOk, 10, 10);
		btnOk.setSize("100px", "34px");
		
		Button btnCancel = new Button("Cancel");
		absolutePanel.add(btnCancel, 10, 56);
		btnCancel.setSize("100px", "34px");
		
		Button btnKorigetDatus = new Button("Koriget datus");
		absolutePanel.add(btnKorigetDatus, 10, 99);
		btnKorigetDatus.setSize("100px", "34px");
		//flowPanel.setWidget(0,1,new Label(""));
	}
}
