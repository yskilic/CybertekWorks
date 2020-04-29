package assignment_14;

public class Q_3_DbTest {

	public static void main(String[] args) {
		
		Q_3_Db db = new Q_3_Db();
		
		db.insertData("aaa", 123);
		System.out.println(db.getData());
		System.out.println(db.getYint());
		
		System.out.println("---");
		
		db.setData("zzz");
		db.setYint(200);
		
		System.out.println(db.getData());
		System.out.println(db.getYint());
		

	}

}
