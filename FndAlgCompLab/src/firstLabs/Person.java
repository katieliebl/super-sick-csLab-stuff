package firstLabs;

public class Person {
	static int currentYear = 2017;
	private String name;
	private int birthYear;
	private int age;
	
	//constructor
	public Person(String name, int bdate){
		this.name = name;
		this.birthYear = bdate;
	}

	//reassigns the birth year
	public void reset_birthday(int year){
		birthYear = year;
	}
	
	//displays a person's name, birth year, age, and status as a senior citizen
	public void display_info(){
		System.out.println("This is " + name);
		System.out.printf("I was born in %d. ",birthYear);
		
		age = currentYear - birthYear;
		System.out.printf("I am %d years old ",age);
		if (age >= 65){
			System.out.println("\nI'm a senior citizen");
		}
		else{
			System.out.println("\nI'm not old enough to be classified as a senior by Medicare!");
		}
		
	}
	
	/*uses age to determine & display whether they are a senior citizen or not
	public void areYouOld() {
		
	}
	*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person John = new Person("John",1957);
		John.display_info();
		//John.areYouOld();
	}

}