package conf.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class RW2 extends Composite {

	public RW2() {
		
		HorizontalPanel simplePanel = new HorizontalPanel();
		initWidget(simplePanel);
		
	//	AbsolutePanel absolutePanel = new AbsolutePanel();
		//simplePanel.setWidget(absolutePanel);
	//	absolutePanel.setSize("567px", "100%");
		
		Button btnRecenzet = new Button("Recenzet");
		btnRecenzet.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				Recenzijas_forma f1 = new Recenzijas_forma();
				f1.setGlassEnabled(true);
				f1.center();
			}
		});
		simplePanel.add(btnRecenzet);
		btnRecenzet.setSize("100px", "28px");
		
		FlexTable flexTable = new FlexTable();
	//	absolutePanel.add(flexTable, 10, 10);
	///	flexTable.setSize("324px", "280px");
	//	flexTable.setWidget(0, 0, new Label("N"));
	/*	flexTable.setWidget(0, 1, new Label("Autors"));
		flexTable.setWidget(0, 2, new Label("Nosaukums"));
		flexTable.setWidget(0, 3, new Label("Raksts"));
		flexTable.setWidget(0, 4, new Label("Tezes"));
	*/
}}
