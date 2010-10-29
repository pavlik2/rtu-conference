package conf.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.TabPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.SimpleCheckBox;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.SimpleRadioButton;
import com.google.gwt.user.client.ui.Button;

public class Org_rec extends Composite {

	public Org_rec() {
		
		AbsolutePanel absolutePanel = new AbsolutePanel();
		initWidget(absolutePanel);
		absolutePanel.setSize("833px", "567px");
		
		ListBox comboBox = new ListBox();
		comboBox.addItem("REC1");
		comboBox.addItem("REC2");
		comboBox.addItem("REC3");
		absolutePanel.add(comboBox, 22, 100);
		
		Label lblRaksts = new Label("Raksts");
		absolutePanel.add(lblRaksts, 183, 10);
		
		Label lblAnnotacija = new Label("Annotacija");
		absolutePanel.add(lblAnnotacija, 639, 10);
		
		ListBox listBox = new ListBox();
		listBox.addItem("REC4");
		listBox.addItem("REC5");
		absolutePanel.add(listBox, 22, 319);
		listBox.setSize("61px", "22px");
		
		ScrollPanel scrollPanel = new ScrollPanel();
		scrollPanel.setAlwaysShowScrollBars(true);
		absolutePanel.add(scrollPanel, 558, 32);
		scrollPanel.setSize("247px", "159px");
		
		ScrollPanel scrollPanel_1 = new ScrollPanel();
		scrollPanel_1.setAlwaysShowScrollBars(true);
		absolutePanel.add(scrollPanel_1, 341, 208);
		scrollPanel_1.setSize("202px", "100px");
		
		ScrollPanel scrollPanel_2 = new ScrollPanel();
		scrollPanel_2.setAlwaysShowScrollBars(true);
		absolutePanel.add(scrollPanel_2, 341, 358);
		scrollPanel_2.setSize("202px", "100px");
		
		Label lblAtzimes = new Label("Atzimes");
		absolutePanel.add(lblAtzimes, 211, 249);
		
		Label lblRecenzentuKomentari = new Label("Recenzentu komentari");
		absolutePanel.add(lblRecenzentuKomentari, 364, 155);
		
		TabPanel tabPanel = new TabPanel();
		absolutePanel.add(tabPanel, 10, 139);
		tabPanel.setSize("202px", "144px");
		
		Label label = new Label("New label");
		tabPanel.add(label, "1 kategorija", false);
		label.setSize("5cm", "3cm");
		
		Grid grid = new Grid(3, 2);
		tabPanel.add(grid, "2 Kategorija", false);
		grid.setSize("5cm", "3cm");
		
		TextBox textBox = new TextBox();
		grid.setWidget(0, 0, textBox);
		
		TextBox textBox_1 = new TextBox();
		grid.setWidget(0, 1, textBox_1);
		
		SimpleCheckBox simpleCheckBox = new SimpleCheckBox();
		grid.setWidget(1, 0, simpleCheckBox);
		
		CheckBox checkBox = new CheckBox("New check box");
		grid.setWidget(1, 1, checkBox);
		
		SimpleCheckBox simpleCheckBox_1 = new SimpleCheckBox();
		grid.setWidget(2, 0, simpleCheckBox_1);
		
		SimpleRadioButton simpleRadioButton = new SimpleRadioButton("new name");
		grid.setWidget(2, 1, simpleRadioButton);
		
		Label lblStatuss = new Label("Statuss");
		absolutePanel.add(lblStatuss, 655, 231);
		
		TabPanel tabPanel_1 = new TabPanel();
		absolutePanel.add(tabPanel_1, 10, 358);
		tabPanel_1.setSize("202px", "144px");
		
		Label label_1 = new Label("New label");
		tabPanel_1.add(label_1, "1 kategorija", false);
		label_1.setSize("5cm", "3cm");
		
		Grid grid_1 = new Grid(3, 2);
		tabPanel_1.add(grid_1, "2 Kategorija", false);
		grid_1.setSize("5cm", "3cm");
		
		TextBox textBox_2 = new TextBox();
		grid_1.setWidget(0, 0, textBox_2);
		
		TextBox textBox_3 = new TextBox();
		grid_1.setWidget(0, 1, textBox_3);
		
		SimpleCheckBox simpleCheckBox_2 = new SimpleCheckBox();
		grid_1.setWidget(1, 0, simpleCheckBox_2);
		
		CheckBox checkBox_1 = new CheckBox("New check box");
		grid_1.setWidget(1, 1, checkBox_1);
		
		SimpleCheckBox simpleCheckBox_3 = new SimpleCheckBox();
		grid_1.setWidget(2, 0, simpleCheckBox_3);
		
		SimpleRadioButton simpleRadioButton_1 = new SimpleRadioButton("new name");
		grid_1.setWidget(2, 1, simpleRadioButton_1);
		
		Button btnNosttEpastu = new Button("Nos\u016Bt\u012Bt e-pastu autoram");
		absolutePanel.add(btnNosttEpastu, 636, 414);
		btnNosttEpastu.setSize("169px", "62px");
		
		
		
	}
}
