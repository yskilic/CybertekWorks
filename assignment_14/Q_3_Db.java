package assignment_14;

public class Q_3_Db {

	private String Data;
	
	private int Yint;
	
	public void insertData(String Data, int Yint) {

		setData(Data);
		setYint(Yint);
		
	}

	public void setData(String Data) {
		this.Data = Data;
	
	}
	
	public void setYint(int Yint) {
		this.Yint = Yint;
		
	}

	public String getData() {
		return Data;
	}

	public int getYint() {
		return Yint;
	}
	
	

}
