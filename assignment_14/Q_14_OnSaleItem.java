package assignment_14;

public class Q_14_OnSaleItem extends Q_14_Item{
	
    private double discount;

    public Q_14_OnSaleItem(String name,int quantity,int catalogNumber,double price, double discount) {
    	super(name, quantity,catalogNumber, price);
    	super.setPrice((price-(price*discount/100)));
    	this.discount = discount;
    }

    
    public double getDiscount() {
        return discount;
    }

   
    public void setDiscount(double discount) {
       this.discount = discount;
    }


	@Override
	public String toString() {
		return "OnSaleItem {discount=" + discount + "%, name=" + getName() + ", price=" + getPrice() + "}";
	}
  
}
