package lesson3.labsolns.prob1;

public class PersonWithJob {
    private Person person;
    private double salary;

    public double getSalary() {
        return salary;
    }

    PersonWithJob(String n, double s) {
//		super(n);
        person = new Person(n);
        salary = s;
    }

    public Person getPerson() {
        return person;
    }

//	@Override
//	public boolean equals(Object aPersonWithJob) {
//		if(aPersonWithJob == null) return false;
//		if(!(aPersonWithJob instanceof PersonWithJob)) return false;
//		PersonWithJob p = (PersonWithJob)aPersonWithJob;
//		boolean isEqual = this.getName().equals(p.getName()) &&
//				this.getSalary()==p.getSalary();
//		return isEqual;
//	}

    @Override
    public boolean equals(Object aPersonWithJob) {
        if (aPersonWithJob == null) return false;

        // check if aPersonWithJob is a person then compare the name
        if (aPersonWithJob instanceof Person) {
            return this.getPerson().getName().equals(((Person) aPersonWithJob).getName());
        }

        // check if aPersonWithJob is PersonWithJob then check both name and salary
        PersonWithJob p = (PersonWithJob) aPersonWithJob;
        Person otherPerson = p.getPerson();

        boolean isEqual = this.getPerson().getName().equals(otherPerson.getName()) &&
                this.getSalary() == p.getSalary();
        return isEqual;
    }

    public static void main(String[] args) {
//		Person p1 = new PersonWithJob("Joe", 30000);
//		Person p2 = new Person("Joe");
//		//As PersonsWithJobs, p1 should be equal to p2
//		System.out.println("p1.equals(p2)? " + p1.equals(p2));
//		System.out.println("p2.equals(p1)? " + p2.equals(p1));

        // after refactor
        PersonWithJob p1 = new PersonWithJob("Joe", 30000);
        Person p2 = new Person("Joe");
        //As PersonsWithJobs, p1 should be equal to p2
        System.out.println("p1.equals(p2)? " + p1.equals(p2));
        System.out.println("p2.equals(p1)? " + p2.equals(p1));
    }


}
