package conf.client;

import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.ScrollPanel;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.ClickEvent;

public class Recenzijas_forma extends DialogBox {

	public Recenzijas_forma() {
		setHTML("Recenzija");
		
		AbsolutePanel absolutePanel = new AbsolutePanel();
		setWidget(absolutePanel);
		absolutePanel.setSize("585px", "753px");
		
		Label lblRecenzents = new Label("Recenzents:");
		absolutePanel.add(lblRecenzents, 23, 28);
		
		Label lblAutors = new Label("Autors:");
		absolutePanel.add(lblAutors, 340, 28);
		
		Label lblRakstaNosaukums = new Label("Raksta nosaukums:");
		absolutePanel.add(lblRakstaNosaukums, 340, 62);
		
		FlexTable flexTable = new FlexTable();
		absolutePanel.add(flexTable, 38, 129);
		flexTable.setSize("530px", "202px");
		
		Label lblRakstaNovertejumaKriteriji = new Label("Raksta novertejuma kriteriji");
		flexTable.setWidget(0, 0, lblRakstaNovertejumaKriteriji);
		
		Label lblAktualitte = new Label("1. Aktualit\u0101te");
		flexTable.setWidget(1, 0, lblAktualitte);
		
		Label lblA = new Label("2. Ideju un uzskatu originalit\u0101te");
		flexTable.setWidget(2, 0, lblA);
		
		Label lblIdejuIzklasta = new Label("3. Ideju izklasta saprotam\u012Bba");
		flexTable.setWidget(3, 0, lblIdejuIzklasta);
		
		Label lblPtijumaMra = new Label("4. P\u0113tijuma m\u0113r\u0137a defin\u0113\u0161ana");
		flexTable.setWidget(4, 0, lblPtijumaMra);
		
		Label lblAnaltiskaisKomponents = new Label("5. Anal\u012Btiskais komponents");
		flexTable.setWidget(5, 0, lblAnaltiskaisKomponents);
		
		Label lblProjektanasrisinjuma = new Label("6. Projekt\u0113\u0161anas (risin\u0101juma) komponents");
		flexTable.setWidget(6, 0, lblProjektanasrisinjuma);
		
		Label lblNosaukumaAtbilstba = new Label("7. Nosaukuma atbilst\u012Bba saturam");
		flexTable.setWidget(7, 0, lblNosaukumaAtbilstba);
		
		Label lblAttluUn = new Label("8. Att\u0113lu un tabulu adekvatums");
		flexTable.setWidget(8, 0, lblAttluUn);
		
		Label lblAtsauuUn = new Label("9. Atsau\u010Du un literat\u016Bru atbilst\u012Bba");
		flexTable.setWidget(9, 0, lblAtsauuUn);
		
		Label lblSecinjumuKvalitte = new Label("10. Secin\u0101jumu kvalit\u0101te");
		flexTable.setWidget(10, 0, lblSecinjumuKvalitte);
		
		Label lblKopejaisVertejums = new Label("Kopejais vertejums");
		absolutePanel.add(lblKopejaisVertejums, 40, 371);
		
		Label lblRekomendcijas = new Label("Rekomend\u0101cijas");
		absolutePanel.add(lblRekomendcijas, 283, 371);
		
		ListBox comboBox = new ListBox();
		comboBox.addItem("Noteikti public\u0113t");
		comboBox.addItem("Iespejams public\u0113t");
		comboBox.addItem("Nepublic\u0113t");
		absolutePanel.add(comboBox, 38, 390);
		
		ListBox comboBox_1 = new ListBox();
		comboBox_1.addItem("Raksts prasa pamat\u012Bgu p\u0101rstr\u0101d\u0101\u0161anu");
		comboBox_1.addItem("Raksts prasa s\u012Bkus labijumus/papildina\u0161anu");
		comboBox_1.addItem("Raksts neprasa labujumus/parstrada\u0161anu");
		absolutePanel.add(comboBox_1, 283, 393);
		
		Label lblKomentriUnIeteikumi = new Label("Koment\u0101ri un ieteikumi autoram");
		absolutePanel.add(lblKomentriUnIeteikumi, 40, 430);
		
		TextArea textArea = new TextArea();
		absolutePanel.add(textArea, 39, 463);
		textArea.setSize("521px", "87px");
		
		Label lblKomentriParTu = new Label("Koment\u0101ri par t\u0113\u017Eu kvalit\u0101ti un ieteikumi to labojumam");
		absolutePanel.add(lblKomentriParTu, 38, 585);
		
		TextArea textArea_1 = new TextArea();
		absolutePanel.add(textArea_1, 38, 621);
		textArea_1.setSize("522px", "69px");
		
		Button btnOk = new Button("OK");
		btnOk.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				Recenzijas_forma.this.hide();
			}
		});
		absolutePanel.add(btnOk, 225, 715);
		btnOk.setSize("100px", "28px");
		
		Button btnCancel = new Button("Cancel");
		absolutePanel.add(btnCancel, 340, 715);
		btnCancel.setSize("100px", "28px");
	}
}
