package gwtWorkshop.mod1.client;

import com.google.gwt.dom.client.Style;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.TextBox;

public class TableDemo extends Composite {
	
	private FlexTable table;
	private DockLayoutPanel dock;
	private Button addRowButton;
	private Button deleteRowButton;
	
	public TableDemo() {
		table = new FlexTable();
		addRow();

		addRowButton = new Button("Add row");
		addRowButton.addClickHandler(createAddRowButtonClickHandler());
		deleteRowButton = new Button("Delete last row");
		deleteRowButton.addClickHandler(createDeleteRowButtonClickedHandler());
		
		dock = new DockLayoutPanel(Style.Unit.EM);
		dock.addNorth(new ButtonBar(addRowButton, deleteRowButton), 2);
		dock.add(table);
		
		initWidget(dock);
	}

	private ClickHandler createAddRowButtonClickHandler() {
		return new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent arg0) {
				addRow();
			}
		};
	}

	private ClickHandler createDeleteRowButtonClickedHandler() {
		return new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent arg0) {
				deleteRow();
			}
			
		};
	}
	
	private void addRow() {
		int r = table.getRowCount();
		
		table.setWidget(r, 0, new TextBox());
		table.setWidget(r, 1, new TextBox());
		table.setWidget(r, 2, new TextBox());
		table.setWidget(r, 3, new TextBox());
	}
	
	private void deleteRow() {
		int rowCount = table.getRowCount() - 1;
		if(rowCount > 0)
			table.removeRow(rowCount);
	}
	
}
