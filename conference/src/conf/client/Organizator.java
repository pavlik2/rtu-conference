package conf.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.MenuBar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;


public class Organizator extends Composite {

	public Organizator() {
		
		final AbsolutePanel absolutePanel = new AbsolutePanel();
		initWidget(absolutePanel);
		absolutePanel.setSize("812px", "615px");
		
		Label lblOrganizator = new Label("Organizator");
		lblOrganizator.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_CENTER);
		lblOrganizator.setDirectionEstimator(true);
		absolutePanel.add(lblOrganizator, 361, 26);
		lblOrganizator.setSize("156px", "31px");
		
		DecoratorPanel decoratorPanel = new DecoratorPanel();
		absolutePanel.add(decoratorPanel, 39, 134);
		decoratorPanel.setSize("763px", "249px");
		
		ScrollPanel scrollPanel = new ScrollPanel();
		scrollPanel.setHeight("196px");
		decoratorPanel.setWidget(scrollPanel);
		
		final FlexTable flexTable = new FlexTable();
		scrollPanel.setWidget(flexTable);
		flexTable.setSize("100%", "100%");
		
		
		
		Label lblKonference = new Label("Konference");
		lblKonference.setDirectionEstimator(false);
		flexTable.setWidget(1, 1, lblKonference);
		
		Label lblKonferencesPieemanasDatums = new Label("datums no       ");
		flexTable.setWidget(1, 2, lblKonferencesPieemanasDatums);
		
		Label lblDatumsLdz = new Label("Datums lidz");
		flexTable.setWidget(1, 3, lblDatumsLdz);
		
		Label lblKonferencesDatums = new Label("Konferences datums");
		flexTable.setWidget(1, 4, lblKonferencesDatums);
		
		Label lblSkatit = new Label("Skatit");
		flexTable.setWidget(1, 5, lblSkatit);
		
		final MenuBar menuBar = new MenuBar(false);
		absolutePanel.add(menuBar, 39, 74);
		final MenuBar menuBar_1 = new MenuBar(true);
		
		MenuItem mntmConference = new MenuItem("Conference", false, menuBar_1);
		
		MenuItem mntmCheck = new MenuItem("ADD", false, new Command() {
			public void execute() {
				int numRows = flexTable.getRowCount();
				Label lblNosaukums = new Label("Nosaukums");
				flexTable.setWidget(numRows, 1, lblNosaukums);
				
				DateBox dateBox = new DateBox();
				flexTable.setWidget(numRows, 2, dateBox);
				
				DateBox dateBox_1 = new DateBox();
				flexTable.setWidget(numRows, 3, dateBox_1);
				
				DateBox dateBox_2 = new DateBox();
				flexTable.setWidget(numRows, 4, dateBox_2);
				
				Button button = new Button("Show");
				flexTable.setWidget(numRows, 5, button);
				
				//mntmDelete.setVisible(false);
			}
		});
		
		
		
		
		menuBar_1.addItem(mntmCheck);
		
		final MenuItem mntmDelete = new MenuItem("DELETE", false, new Command() {
			public void execute() {
			
				
			if (flexTable.getRowCount()!=1) flexTable.removeRow((flexTable.getRowCount()-1));  
		
			}
			
		});
		
		
		menuBar_1.addItem(mntmDelete);
		menuBar.addItem(mntmConference);
		///////////////////////////////////////////////////
		Button button = new Button("New button");
		button.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				absolutePanel.clear();
				Org_main om = new Org_main();
				absolutePanel.setSize("1111px", "615px");
				absolutePanel.add(om);
				
			//	absolutePanel.add(funct());
			}
		});
		absolutePanel.add(button, 186, 68);
		button.setSize("100px", "28px");
	
	}
	
	 public Grid funct() {
		 Grid grid = new Grid(4, 4);

		    // Add images to the grid
		    int numRows = grid.getRowCount();
		    int numColumns = grid.getColumnCount();
		    for (int row = 0; row < numRows; row++) {
		      for (int col = 0; col < numColumns; col++) {
		        grid.setWidget(row, col, new Label("5"));
		      }
		    }
		    return grid;
	 };
}
