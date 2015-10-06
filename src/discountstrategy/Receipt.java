
package discountstrategy;

/**
 *
 * @author Thomas
 */
public class Receipt{
    
    private Customer customer;
    private DatabaseAccessStrategy db;
    private LineItems [] lineitems = {};

    public Receipt(String custId, DatabaseAccessStrategy db) {
        this.customer = db.findCustomer(custId);
        this.db = db;
    }

    public void addLineItems(String prodId, int qty){
        LineItems item = new LineItems(db,qty,prodId);
        addArrayToLineItems(item);
        
    }
    
    public void addArrayToLineItems(LineItems item){
        LineItems [] items = new LineItems[lineitems.length+1];
        
        
        
        for(int i = 0; i< lineitems.length;i++){
            items[i]=lineitems[i];
            
        }
        items[items.length-1]= item;
        lineitems = items;
        items = null;
        
    }
    
    
    public final Customer findCustomer(final String custId) {
        // validation is needed for method parameter
        if(custId == null || custId.length() == 0) {
            System.out.println("Invalid ID");
            return null;  // end method prematurely after log to console
        }
        
        Customer customerID = db.findCustomer(custId);
        if(customerID == null){
            System.out.println("Invalid ID");
            
        }
        
        return customerID;
    }
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public double getTotalBeforeDiscount() {
        double total= 0;
        for(LineItems b : lineitems){
            total += b.getSubtotal();
            
        }
        
        return total;
    }

    public double getTotalSavings(){
        double savingsTotal = 0;
        for(LineItems b : lineitems){
            savingsTotal += b.getSubtotalDiscount();
            
        }
        return savingsTotal;
    }

    public double getTotal(){
        return getTotalBeforeDiscount() - getTotalSavings();
        
    }

    public LineItems[] getLineitems() {
        return lineitems;
    }

    public void setLineitems(LineItems[] lineitems) {
        this.lineitems = lineitems;
    }
    
    

  
    
    
}
