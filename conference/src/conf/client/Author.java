package conf.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;

public class Author extends Composite {

	public Author() {
		
		AbsolutePanel absolutePanel = new AbsolutePanel();
		initWidget(absolutePanel);
		absolutePanel.setSize("735px", "514px");
		
		FlexTable flexTable = new FlexTable();
		absolutePanel.add(flexTable, 10, 43);
		flexTable.setSize("120px", "180px");
		
		Button btnRedigtPieteikumu = new Button("Redig\u0113t pieteikumu");
		flexTable.setWidget(0, 0, btnRedigtPieteikumu);
		
		Button btnRedigetProfilu = new Button("Rediget profilu");
		flexTable.setWidget(1, 0, btnRedigetProfilu);
		
		Button btnPievienotRakstutezes = new Button("Apskat\u012Bties recenzijas");
		flexTable.setWidget(2, 0, btnPievienotRakstutezes);
		
		Button btnAnultPieteikumu = new Button("Anul\u0113t pieteikumu");
		flexTable.setWidget(3, 0, btnAnultPieteikumu);
		
		Button btnIziet = new Button("Iziet");
		flexTable.setWidget(4, 0, btnIziet);
		flexTable.getCellFormatter().setVerticalAlignment(3, 0, HasVerticalAlignment.ALIGN_MIDDLE);
		flexTable.getCellFormatter().setHorizontalAlignment(3, 0, HasHorizontalAlignment.ALIGN_CENTER);
		flexTable.getCellFormatter().setHorizontalAlignment(1, 0, HasHorizontalAlignment.ALIGN_CENTER);
		flexTable.getCellFormatter().setHorizontalAlignment(0, 0, HasHorizontalAlignment.ALIGN_CENTER);
		flexTable.getCellFormatter().setHorizontalAlignment(4, 0, HasHorizontalAlignment.ALIGN_CENTER);
		
		AbsolutePanel absolutePanel_1 = new AbsolutePanel();
		absolutePanel.add(absolutePanel_1, 225, 43);
		absolutePanel_1.setSize("503px", "461px");
		
		Label lblAutors = new Label("Autors");
		absolutePanel.add(lblAutors, 10, 10);
	}
}
