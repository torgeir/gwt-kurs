package gwtWorkshop.mod1.client;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;

public class ButtonBar extends Composite {

	private FlowPanel buttonBar;

	public ButtonBar(Widget... widgets) {
		buttonBar = new FlowPanel();
		addWidgets(widgets);
		initWidget(buttonBar);
	}

	private void addWidgets(Widget[] widgets) {
		for (Widget w : widgets) {
			buttonBar.add(w);
		}
	}
}
