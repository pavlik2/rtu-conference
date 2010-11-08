package conf.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;

public class RW1 extends Composite {

	public RW1() {
		
		HorizontalPanel horizontalPanel = new HorizontalPanel();
		initWidget(horizontalPanel);
		
		FlowPanel flowPanel = new FlowPanel();
		horizontalPanel.add(flowPanel);
		flowPanel.setWidth("292px");
		
		AbsolutePanel absolutePanel = new AbsolutePanel();
		horizontalPanel.add(absolutePanel);
		absolutePanel.setSize("150px", "164px");
		
		Button button = new Button("New button");
		absolutePanel.add(button, 10, 10);
		button.setSize("100px", "34px");
		
		Button button_1 = new Button("New button");
		absolutePanel.add(button_1, 10, 56);
		button_1.setSize("100px", "34px");
		
		Button button_2 = new Button("New button");
		absolutePanel.add(button_2, 10, 99);
		button_2.setSize("100px", "34px");
	}
}
