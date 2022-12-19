//Abelardo Magana Jr., Kendrick Affel, amagana60@toromail.csudh.edu
public class Customer { 
	private String firstname; 
	private String lastname;
	private String SSN; 

	public Customer(String fn, String ln, String ssn){
		this.firstname=fn;
		this.lastname=ln;
		this.SSN=ssn;
	}

	public String getFirstName() {
		return firstname;
	}
	public String getLastName() { 
		return lastname;
	}
	public String getSocialSecurity() {
		return SSN;
	}
	public void setFirstName(String firstname) {
		this.firstname = firstname; 
	}
	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	public void setSSN(String sSN) {
		SSN = sSN; 
	}
}