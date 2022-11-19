

//class of sigItem which store in item name, unit price, quantity and links the invoice with it 


package SIG.model;
/**
 *
 * @author ahmed
 */
public class MyItem {
    private MyHeader invoice;
    private String itemName;
    private double unitPrice;
    private int quantity;

    public MyItem() {
    }

    public MyItem(String itemName, int quantity,double unitPrice,MyHeader header) {
        this.invoice= header;
        this.quantity = quantity;
        this.itemName = itemName;
        this.unitPrice = unitPrice;
    }
     public double getTotalLine(){
        return unitPrice * quantity;
    }



    public MyHeader getInvoice() {
        return invoice;
    }

    public void setInvoice(MyHeader invoice) {
        this.invoice = invoice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "sigItem{" + "itemName=" + itemName + ", unitPrice=" + unitPrice + ", quantity=" + quantity + '}';
    }
    public double getTotal(){
        return unitPrice * quantity;
    }

   public String getItemsFromTabel(){
       return invoice.getNum() + "," + itemName + "," + unitPrice + "," +quantity;
   }

   
    
}
