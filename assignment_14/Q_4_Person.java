package assignment_14;

public class Q_4_Person {
	
	private String FirstName;
	private String LastName;
	private int Age;
	
	public Q_4_Person() {
		
		this.FirstName = "undefined";
		this.LastName = "undefined";
		this.Age = -1;
	}
	
	public Q_4_Person (String FirstName, String LastName, int Age){
	
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Age = Age;
		
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	@Override
	public String toString() {
		return FirstName + " | " + LastName + " | " + Age ;
	}

}
