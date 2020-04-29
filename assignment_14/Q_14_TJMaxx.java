package assignment_14;

import java.util.ArrayList;
import java.util.List;


public class Q_14_TJMaxx {
	

	private List<Q_14_Item> RegularItems;
	private List<Q_14_OnSaleItem> OnSaleItems;

	    
	  public Q_14_TJMaxx() {
	        
	    	RegularItems = new ArrayList<>();
	    	OnSaleItems = new ArrayList<>();
	    	
	   }

	   public void addRegularItem(Q_14_Item item) {
	       RegularItems.add(item);   
	   }

	   public void addOnSaleItem(Q_14_OnSaleItem item) {
	        OnSaleItems.add(item);    
	   }

	   public List<Q_14_Item> getRegularItems() {  
	        return RegularItems;
	   }

	   public List<Q_14_OnSaleItem> getOnSaleItems() { 
	        return OnSaleItems;
	   }

	   public int RegularItemsCount() {
	        return RegularItems.size();
	   }

	   public int OnSaleItemsCount() {
	        return OnSaleItems.size();
	   }

	   public List<String> getAllItemNames() {
	       
	    	List<String> AllItemNames = new ArrayList<>();
	    	
	    	for (Q_14_Item Item : RegularItems) {
	    			
	    		AllItemNames.add(Item.getName());
	    	}
	    	
	       for(Q_14_OnSaleItem Item : OnSaleItems) {
	    	   
	    	   	AllItemNames.add(Item.getName());
	       }
	       
	       return AllItemNames;
	    }

	   
	  public double getItemPrice(int catalogNumber){
	      
	    List<Q_14_Item> AllItemList = new ArrayList<>();	
	    AllItemList.addAll(RegularItems);
	    AllItemList.addAll(OnSaleItems);
	    		
	       for(Q_14_Item AllItems : AllItemList) {
	    			
	    	   if (AllItems.getCatalogNumber()==catalogNumber) {
	    		   return AllItems.getPrice();
	    				
	    	   } 
	    			
	    	}return 0.0;
	    	
	    }

	   public Q_14_OnSaleItem getOnSaleItem(String name){
	        
	    	for(Q_14_OnSaleItem OnSaleItem : OnSaleItems) {
	    		
	    		if(OnSaleItem.getName().equalsIgnoreCase(name)) {
	    			return OnSaleItem;
	    			
	    		} 
	    				
	    	}return null;
	     }

	   
	   public void removeItem(int catalogNumber) {
	    	
	    	for(Q_14_Item RegularItem : RegularItems) {
	    		
	    		if(RegularItem.getCatalogNumber()==catalogNumber) {
	    			RegularItems.remove(RegularItem);
	    			
	    		}
	    	}
	    	for(Q_14_OnSaleItem OnSaleItem : OnSaleItems) {
	    		
	    		if(OnSaleItem.getCatalogNumber()==catalogNumber) {
	    			OnSaleItems.remove(OnSaleItem);
	    			
	    		}
	    	}
	    	
	    }

	   
	   public void buyItem(int catalogNumber) {
	       
	    	List<Q_14_Item> AllItemList = new ArrayList<>();	
		    AllItemList.addAll(RegularItems);
		    AllItemList.addAll(OnSaleItems);
		    		
		       for(Q_14_Item AllItems : AllItemList) {
		    			
		    	   if (AllItems.getCatalogNumber()==catalogNumber) {
		    		   AllItems.setQuantity(AllItems.getQuantity()-1);
		    			
		    		   if (AllItems.getQuantity()==0) {
		    			   removeItem(AllItems.getCatalogNumber());
		    		   }
		    		   
		    	   } 
		    			
		    	}
		    	
		   }
	 
	}


