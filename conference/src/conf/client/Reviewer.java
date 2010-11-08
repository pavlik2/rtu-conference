package conf.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.cellview.client.CellList;
import com.google.gwt.cell.client.TextCell;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.dom.client.Style.Unit;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Reviewer extends Composite {

	public Reviewer() {
		
		AbsolutePanel absolutePanel = new AbsolutePanel();
		initWidget(absolutePanel);
		absolutePanel.setSize("505px", "314px");
		
		VerticalPanel horizontalPanel = new VerticalPanel();
		absolutePanel.add(horizontalPanel, 10, 10);
		horizontalPanel.setSize("139px", "124px");
		
		Button button_1 = new Button("New button");
		horizontalPanel.add(button_1);
		
		Button button = new Button("New button");
		horizontalPanel.add(button);
		
		Button button_2 = new Button("New button");
		horizontalPanel.add(button_2);
		
		AbsolutePanel absolutePanel_1 = new AbsolutePanel();
		absolutePanel.add(absolutePanel_1, 167, 10);
		absolutePanel_1.setSize("328px", "266px");
	}
}
