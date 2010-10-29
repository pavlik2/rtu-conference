package conf.client;

import conf.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import conf.client.Organizator;
import conf.client.Register;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */

public class Conference implements EntryPoint {
	private Button clickMeButton;
	public void onModuleLoad() {
		final RootPanel rootPanel = RootPanel.get();
	//	RootPanel rootPanel2 = RootPanel.get();
		clickMeButton = new Button();
		rootPanel.add(clickMeButton, 176, 176);
		clickMeButton.setSize("103px", "28px");
		clickMeButton.setText("LOGIN");
		
		final TextBox textBox = new TextBox();
		rootPanel.add(textBox, 176, 41);
		//textBox.
	//	rootPanel.
		final PasswordTextBox passwordTextBox = new PasswordTextBox();
		rootPanel.add(passwordTextBox, 176, 93);
		
		Label lblLogin = new Label("Login");
		rootPanel.add(lblLogin, 69, 49);
		
		Label lblPassword = new Label("Password:");
		rootPanel.add(lblPassword, 69, 101);
	
		final Button anchot = new Button ("Register");
		rootPanel.add(anchot, 400, 76);
		final Label label = new Label("Registracija veiksmiga");
		rootPanel.add(label, 400,76);
		label.setVisible(false);
		anchot.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
		
		final Register register = 	new Register();
		register.setGlassEnabled(true);
	    register.setAnimationEnabled(true);
		register.center();
		
		register.show();	
			anchot.setVisible(false);
			label.setVisible(true);
		};});
		
		
		
		clickMeButton.addClickHandler(new ClickHandler(){
			public void onClick(ClickEvent event) {
			
				
			
				
				Organizator org = new Organizator();
				rootPanel.clear();
				rootPanel.add(org);
			
				
			}
		});
		
	}
}
