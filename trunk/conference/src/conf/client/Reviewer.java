package conf.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.cell.client.TextCell;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class Reviewer extends Composite {
final boolean change = false;
	public Reviewer() {
		final AbsolutePanel absolutePanel_1 = new AbsolutePanel();
		AbsolutePanel absolutePanel = new AbsolutePanel();
		initWidget(absolutePanel);
		absolutePanel.setSize("689px", "477px");
		
		VerticalPanel horizontalPanel = new VerticalPanel();
		absolutePanel.add(horizontalPanel, 10, 10);
		horizontalPanel.setSize("139px", "124px");
		
		Button btnPersonigaInformcija = new Button("Personiga info");
		btnPersonigaInformcija.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				RW1 r1 = new RW1();
				absolutePanel_1.clear();
				absolutePanel_1.add(r1);
			}
		});
		horizontalPanel.add(btnPersonigaInformcija);
		btnPersonigaInformcija.setWidth("142px");
		
		Button btnRecenzet = new Button("Recenzet");
		btnRecenzet.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				RW2 r2 = new RW2(); 
				absolutePanel_1.clear();
				absolutePanel_1.add(r2);
			}
		});
		horizontalPanel.add(btnRecenzet);
		btnRecenzet.setWidth("142px");
		
		Button btnIziet = new Button("Iziet");
		btnIziet.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
			final RootPanel	rp;// = new RootPanel();
			rp = RootPanel.get(); //Conference c = new Conference();
			rp.clear(); 
			//rp.add(c);
			}
		});
		
		horizontalPanel.add(btnIziet);
		btnIziet.setWidth("141px");
		
		//AbsolutePanel absolutePanel_1 = new AbsolutePanel();
		absolutePanel.add(absolutePanel_1, 167, 10);
		absolutePanel_1.setSize("512px", "457px");
	}
}
