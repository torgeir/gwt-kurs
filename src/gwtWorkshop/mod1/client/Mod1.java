package gwtWorkshop.mod1.client;

import gwtWorkshop.mod1.client.ajax.AjaxPanel;
import gwtWorkshop.mod1.client.ajax.HelloRestPanel;
import gwtWorkshop.mod1.client.ajax.JsniPanel;
import gwtWorkshop.mod1.client.ajax.JsonRestPanel;
import gwtWorkshop.mod1.client.ajax.XMLRestPanel;
import gwtWorkshop.mod1.client.calendar.CalendarModelImpl;
import gwtWorkshop.mod1.client.calendar.CalendarModelMock;
import gwtWorkshop.mod1.client.calendar.CalendarPanel1;
import gwtWorkshop.mod1.client.calendar.CalendarPanel3;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.dom.client.Style;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.StackLayoutPanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class Mod1 implements EntryPoint {

	@Override
	public void onModuleLoad() {

		RootLayoutPanel rootPanel = RootLayoutPanel.get();
		
		DockLayoutPanel dock = new DockLayoutPanel(Style.Unit.EM);
		
		FlowPanel southPanel = new FlowPanel();
		FlowPanel northPanel = new FlowPanel();
		FlowPanel eastPanel = new FlowPanel();
		FlowPanel westPanel = new FlowPanel();
		FlowPanel centerPanel = new FlowPanel();
		
		southPanel.getElement().getStyle().setBackgroundColor("grey");
		northPanel.getElement().getStyle().setBackgroundColor("grey");
		eastPanel.getElement().getStyle().setBackgroundColor("black");
		westPanel.getElement().getStyle().setBackgroundColor("white");
		centerPanel.getElement().getStyle().setBackgroundColor("black");
		
		dock.addSouth(southPanel, 5);
		dock.addNorth(northPanel, 5);
		dock.add(createSplitLayoutPanel());
		
		rootPanel.add(dock);
	}
	
	private TabLayoutPanel createTabPanel() {
		FlowPanel blackPanel = new FlowPanel();
		FlowPanel greenPanel = new FlowPanel();
		FlowPanel bluePanel = new FlowPanel();
		
		blackPanel.getElement().getStyle().setBackgroundColor("black");
		greenPanel.getElement().getStyle().setBackgroundColor("green");
		bluePanel.getElement().getStyle().setBackgroundColor("blue");
		
//		CalendarModelMock model = new CalendarModelMock();
		CalendarModelImpl model = new CalendarModelImpl();
		CalendarPanel3 calendarPanel = new CalendarPanel3(model);
		
		TabLayoutPanel p = new TabLayoutPanel(2, Style.Unit.EM);
		
		p.add(new TableDemo(), "Table Demo");
		p.add(calendarPanel, "Green");
		p.add(createAjaxDemos(), "Blue");
		
		return p;
	}

	private StackLayoutPanel createStackLayoutPanel() {
		FlowPanel blackPanel = new FlowPanel();
		FlowPanel greenPanel = new FlowPanel();
		FlowPanel bluePanel = new FlowPanel();
		
		blackPanel.getElement().getStyle().setBackgroundColor("black");
		greenPanel.getElement().getStyle().setBackgroundColor("green");
		bluePanel.getElement().getStyle().setBackgroundColor("blue");
		
		StackLayoutPanel p = new StackLayoutPanel(Style.Unit.EM);
		
		p.add(blackPanel, "Black", 2);
		p.add(greenPanel, "Green", 2);
		p.add(bluePanel, "Blue", 2);
		
		return p;
	}
	
	private SplitLayoutPanel createSplitLayoutPanel() {
		FlowPanel blackPanel = new FlowPanel();
		blackPanel.getElement().getStyle().setBackgroundColor("black");

		blackPanel.addStyleName("blackPanel");
		
		SplitLayoutPanel p = new SplitLayoutPanel();
		p.addWest(createStackLayoutPanel(), 200);
		p.addEast(blackPanel, 200);
		p.add(createTabPanel());
		return p;
	}
	
	private Widget createAjaxDemos() {
		AjaxPanel helloRestPanel = new HelloRestPanel();
		XMLRestPanel xmlRestPanel = new XMLRestPanel();
		TabLayoutPanel p = new TabLayoutPanel(3, Style.Unit.EM);
		p.add(helloRestPanel, "HelloRestPanel");
		p.add(xmlRestPanel, "XMLRestPanel");
		p.add(new JsonRestPanel(), "JSONRestPanel");
		p.add(new JsniPanel(), "JSONRestPanel");
		return p;
	}
	
}
