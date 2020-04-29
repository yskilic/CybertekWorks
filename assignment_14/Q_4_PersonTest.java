package assignment_14;

public class Q_4_PersonTest {

	public static void main(String[] args) {
		
		Q_4_Person person = new Q_4_Person();
		
		System.out.println(person.getFirstName());
		System.out.println(person.getLastName());
		System.out.println(person.getAge());
		System.out.println(person.toString());
		
		
		person.setFirstName("John");
		person.setLastName("Doe");
		person.setAge(44);

		System.out.println(person.toString());
		
		Q_4_Person person2 = new Q_4_Person ("Fatima", "Lee", 22);
		
		System.out.println(person2.getFirstName());
		System.out.println(person2.getLastName());
		System.out.println(person2.getAge());
		System.out.println(person2.toString());
	}

}
