package lesson3.labsolns.prob1;


public class Person {

	private String name;
	Person(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false;

		// check if aPersonWithJob is an instance of person then compare the name
		if(aPerson instanceof Person) {
			return this.getName().equals(((Person) aPerson).getName());
		}

		return this.getName().equals(((PersonWithJob) aPerson).getPerson().getName());
	}
	public static void main(String[] args) {
		
	}

}
