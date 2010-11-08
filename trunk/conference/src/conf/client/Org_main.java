package conf.client;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.HorizontalSplitPanel;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.DisclosurePanel;
import com.google.gwt.user.client.ui.DockPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.DeckPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.DecoratedStackPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.PushButton;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.ToggleButton;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.event.shared.SimpleEventBus;

import conf.server.Raksts;

public class Org_main extends Composite {
	
	private final GreetingServiceAsync greetingService = GWT
	.create(GreetingService.class);
//	private String[] b; 
	
	
	
	public Org_main() {
	//	b = new String[4];
		HorizontalPanel horizontalPanel = new HorizontalPanel();
		initWidget(horizontalPanel);
		horizontalPanel.setSize("1087px", "328px");
		
		HorizontalPanel horizontalPanel_1 = new HorizontalPanel();
		horizontalPanel.add(horizontalPanel_1);
		horizontalPanel_1.setSize("140px", "329px");
		
		DecoratedStackPanel decoratedStackPanel = new DecoratedStackPanel();
		horizontalPanel_1.add(decoratedStackPanel);
		decoratedStackPanel.setSize("137px", "157px");
		
		AbsolutePanel absolutePanel = new AbsolutePanel();
		decoratedStackPanel.add(absolutePanel, "Rakstu info", false);
		absolutePanel.setSize("100%", "100%");
		
		Label lblRaksti = new Label("Raksti");
		absolutePanel.add(lblRaksti, 10, 10);
		
		Label lblRecenzenti = new Label("Recenzenti");
		
		decoratedStackPanel.add(lblRecenzenti, "Recenzentu info", false);
		lblRecenzenti.setSize("100%", "34px");
		
		Label lblTermini = new Label("Termini");
		
		decoratedStackPanel.add(lblTermini, "Conferences info", false);
		lblTermini.setSize("100%", "34px");
		
		final VerticalPanel horizontalPanel_2 = new VerticalPanel();
		horizontalPanel_2.setSize("977px", "332px");
		horizontalPanel.add(horizontalPanel_2);
		
		lblRecenzenti.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				horizontalPanel_2.clear();
				Org_rec or = new Org_rec();
				horizontalPanel_2.add(or);
				
			}
		});
		
		lblTermini.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				horizontalPanel_2.clear();
				Organizator oo = new Organizator();
				horizontalPanel_2.add(oo);
			}
		});
		
		final FlexTable flexTable = new FlexTable();
		horizontalPanel_2.add(flexTable);
		flexTable.setWidth("910px");
		
		Label lblRakstaNosaukums = new Label("Raksta nosaukums");
		flexTable.setWidget(0, 0, lblRakstaNosaukums);
		
		Label lblAutors = new Label("Autors");
		flexTable.setWidget(0, 1, lblAutors);
		
		Label lblAtstts = new Label("Ats\u016Bt\u012Bts");
		lblAtstts.setStyleName("h1");
		flexTable.setWidget(0, 2, lblAtstts);
		
		Label lblrec = new Label("1.rec.");
		flexTable.setWidget(0, 3, lblrec);
		
		Label lblrec_1 = new Label("2.rec");
		flexTable.setWidget(0, 4, lblrec_1);
		
		Label lblAtzmes = new Label("Atz\u012Bmes");
		flexTable.setWidget(0, 5, lblAtzmes);
		
		Label lblLmums = new Label("L\u0113mums");
		flexTable.setWidget(0, 6, lblLmums);
		
		Label lblStudijuNoslgumaDarba = new Label("Studiju nosl\u0113guma darba zin. vad\u012Bt\u0101js");
		lblStudijuNoslgumaDarba.setWordWrap(false);
		flexTable.setWidget(0, 7, lblStudijuNoslgumaDarba);
		flexTable.getCellFormatter().setWordWrap(0, 7, true);
		
		Label lblAutoraInformcija = new Label("Autora inform\u0101cija");
		final Inf2 inf = new Inf2();
		lblAutoraInformcija.addMouseOverHandler(new MouseOverHandler() {
			public void onMouseOver(MouseOverEvent event) {
				
				inf.setPopupPosition(500,200);
				inf.show();
				
			}
		});
	
		lblAutoraInformcija.addMouseOutHandler(new MouseOutHandler() {
			public void onMouseOut(MouseOutEvent event) {
				inf.hide();
		}
		});
		
		flexTable.setWidget(0, 8, lblAutoraInformcija);
		
		Label lblRakstaAnnotcija = new Label("Raksta annot\u0101cija");
		flexTable.setWidget(0, 9, lblRakstaAnnotcija);
		
		
	//	final String[] a = new String[4] ;
	
		 greetingService.ret(new AsyncCallback<ArrayList<String>>() {
			
			public void onFailure(Throwable caught) {
				
			}

			//public static String[] b = new String[4];
@Override
public void onSuccess(ArrayList<String> result) {
	int numRows = flexTable.getRowCount();
	// TODO Auto-generated method stub
	int m = result.size();

	//String aa = result.get(1);
//	 if (result.iterator().hasNext()) {
//         for (String e : result) {
        	// String[] b = new String[] {"a","b","c","d"};
	
     		Label label = new Label("Raksta nosaukums");
     		flexTable.setWidget(numRows, 0, new Label(Integer.toString(m)));
     		
     		Label label_1 = new Label("");
     		flexTable.setWidget(numRows, 1, label_1);
     		
     		Label lblIr = new Label("IR");
     		lblIr.setStyleName("serverResponseLabelError");
     		flexTable.setWidget(numRows, 2, lblIr);
     		
     		Label label_2 = new Label("1.rec.");
     		flexTable.setWidget(numRows, 3, label_2);
     		
     		Label label_3 = new Label("2.rec");
     		flexTable.setWidget(numRows, 4, label_3);
     		
     		PushButton pushButton = new PushButton("New button");
     		flexTable.setWidget(numRows, 5, pushButton);
     		
     		ToggleButton toggleButton = new ToggleButton("Up text");
     		flexTable.setWidget(numRows, 6, toggleButton);
     		
     		Label label_4 = new Label("");
     		flexTable.setWidget(numRows, 7, label_4);
     		
     		Label label_5 = new Label("");
     		flexTable.setWidget(numRows, 8, label_5);
     		flexTable.getCellFormatter().setHorizontalAlignment(0, 7, HasHorizontalAlignment.ALIGN_LEFT);
     		
     		Button btnSkatit = new Button("Skatit");
     		flexTable.setWidget(numRows, 9, btnSkatit);
     		flexTable.setStylePrimaryName("new");
//  }    }	            
        
   //  else {         // ... no results ...      }
	
}

		}
		);
		
	
		
	
}
}
