
package SIG.controller;

import SIG.model.InvoiceLine;
import SIG.model.MyHeader;
import SIG.model.MyItem;
import SIG.view.Frame;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author ahmed
 */
public class TableAction implements ListSelectionListener{
    private Frame frame;

    public TableAction(Frame frame) {
        this.frame = frame;
    }
    
/*when select an invoice from the header tabel this method finds out which invoice has been selected
    from the header tabel and gets its item lines and update the second table the item table
    */
    @Override
    public void valueChanged(ListSelectionEvent e) {
        int invoiceIndex = frame.getTableInvoiceHeader().getSelectedRow();
        if(invoiceIndex!= -1){
             MyHeader selectedRow = frame.getInvoices().get(invoiceIndex);
             ArrayList<MyItem> items = selectedRow.getItems();
             frame.getLabelCustomerName().setText(selectedRow.getName());
             frame.getLabelInvoiceNum().setText(""+selectedRow.getNum());
             frame.getLabelInvoiceDate().setText(selectedRow.getDate());
             frame.getLabelTostalCost().setText(""+selectedRow.getTotalInvoice());
             InvoiceLine line = new InvoiceLine(items);
             frame.getTableInvoiceLines().setModel(line);
             line.fireTableDataChanged();
             
        }
    }
    
}
