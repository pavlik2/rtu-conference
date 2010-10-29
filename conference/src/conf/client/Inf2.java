package conf.client;

import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Button;

public class Inf2 extends PopupPanel {

	public Inf2() {
		super(true);
		setPreviewingAllNativeEvents(true);
		
		AbsolutePanel absolutePanel = new AbsolutePanel();
		setWidget(absolutePanel);
		absolutePanel.setSize("181px", "153px");
		
		Label label = new Label("Inform\u0101cija par autoru: ");
		absolutePanel.add(label, 10, 10);
		label.setSize("143px", "27px");
		
		Button btnNosutitEpastu = new Button("Nosutit e-pastu");
		absolutePanel.add(btnNosutitEpastu, 10, 57);
		btnNosutitEpastu.setSize("100px", "28px");
	}
}
