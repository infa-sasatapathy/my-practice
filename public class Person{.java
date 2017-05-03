public class Person{
	private String firstName;
	private String lastName;
	private int age;

	public Person(String firstName, String lastName) {
	this.firstName = firstName;
	this.last Name = lastName;
	this.age=age;
	}
	public void setFirstName(String firstName)  throws
		IllegalArgumentException {
			if (firstName.isEmpty())
				throws new Illegal ArgumentException("Can't pass empty first name");
			this.firstName = firstName;
	}
	public void setLastName(String lastName)  throws
		IllegalArgumentException {
			if (firstName.isEmpty())
				throws new Illegal ArgumentException("Can't pass empty last name");
			this.firstName = firstName;
	}
	public void setLastName(String lastName) {
	this.lastName = lastName;
	}
#new addition
}
