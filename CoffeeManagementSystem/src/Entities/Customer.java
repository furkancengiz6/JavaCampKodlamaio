package Entities;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private int dateOfBirth;
	private String nationalitId;

	public Customer() {

	}

	public Customer(final int id, final String firstName, final String lastName, final int dateOfBirth,
			final String nationalitId) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
		this.nationalitId = nationalitId;
		this.dateOfBirth = dateOfBirth;

	}

	public int getId() {
		return id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(final int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalitId() {
		return nationalitId;
	}

	public void setNationalitId(final String nationalitId) {
		this.nationalitId = nationalitId;
	}

}
