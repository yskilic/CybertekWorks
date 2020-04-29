package assignment_14;

public class Q_14_TJMaxxTest {

	public static void main(String[] args) {
		
		Q_14_Item test = new Q_14_Item("aaa", 2, 5, 120);

		System.out.println(test.toString());
		
		Q_14_TJMaxx s = new Q_14_TJMaxx();
		
		s.addRegularItem(test);
		
		
		Q_14_OnSaleItem onsale1 = new Q_14_OnSaleItem("aaa", 2, 5, 120, 20);
		s.addOnSaleItem(onsale1);
		
		System.out.println(onsale1.toString());
		
		System.out.println(s.getAllItemNames());
		
		System.out.println(s.getOnSaleItem("aaa"));
		System.out.println(s.getRegularItems());
		System.out.println(s.getItemPrice(5));

	}

}
