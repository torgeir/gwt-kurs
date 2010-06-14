package gwtWorkshop.mod1.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

public class Mod1 implements EntryPoint {

	@Override
	public void onModuleLoad() {
		
		// Using DOM to create page
		Document document = Document.get();
		final Element myDiv = document.getElementById("myDiv");
		myDiv.setInnerText("Hello myDiv, how you doing?");

		
		// Using widgets
		Button button = new Button("Give me Math.rand()!");
		button.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent arg0) {

				myDiv.setInnerText(Double.toString(Math.random()));
				
			}
			
		});
		
		RootPanel rootPanel = RootPanel.get();
		rootPanel.add(button);
	}

}
