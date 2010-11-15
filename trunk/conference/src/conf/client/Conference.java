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
	private Button clickMeButton; final static RootPanel rootPanel = RootPanel.get();
	public void onModuleLoad() {
	//	final RootPanel rootPanel = RootPanel.get();
	//	RootPanel rootPanel2 = RootPanel.get();
		clickMeButton = new Button();
		rootPanel.add(clickMeButton, 654, 70);
		clickMeButton.setSize("103px", "28px");
		clickMeButton.setText("Ieiet sist\u0113ma");
		
		final TextBox textBox = new TextBox();
		rootPanel.add(textBox, 608, 10);
		//textBox.
	//	rootPanel.
		final PasswordTextBox passwordTextBox = new PasswordTextBox();
		rootPanel.add(passwordTextBox, 608, 40);
		
		Label lblLogin = new Label("E-pasts");
		rootPanel.add(lblLogin, 530, 10);
		
		Label lblPassword = new Label("Parole");
		rootPanel.add(lblPassword, 530, 40);
	
		final Button anchot = new Button ("Pieteikties konferencei");
		rootPanel.add(anchot, 10, 10);
		anchot.setSize("166px", "28px");
		final Label label = new Label("Registracija veiksmiga");
		rootPanel.add(label, 438,82);
		
		Button btnAtjaunotParoli = new Button("Atjaunot paroli");
		rootPanel.add(btnAtjaunotParoli, 654, 104);
		btnAtjaunotParoli.setSize("103px", "28px");
		
		Button btnOrganizator = new Button("Organizator");
		btnOrganizator.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				Org_main org = new Org_main();
				rootPanel.clear();
				rootPanel.add(org);
				
			}
		});
		rootPanel.add(btnOrganizator, 246, 164);
		btnOrganizator.setSize("100px", "28px");
		
		Button btnAuthor = new Button("Author");
		btnAuthor.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				
				Author org = new Author();
				rootPanel.clear();
				rootPanel.add(org);
			}
		});
		rootPanel.add(btnAuthor, 246, 216);
		btnAuthor.setSize("100px", "28px");
		
		Button btnReviewer = new Button("Reviewer");
		btnReviewer.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				Reviewer org = new Reviewer();
				rootPanel.clear();
				rootPanel.add(org);
			}
		});
		rootPanel.add(btnReviewer, 246, 262);
		btnReviewer.setSize("100px", "28px");
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
			
				
			
				
				
			
				
			}
		});
		
	}
}
