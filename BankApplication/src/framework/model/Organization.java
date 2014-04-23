
package framework.model;


public class Organization
        extends Customer
        implements IOrganization {

    public Organization(String name, String email, String street, String city, String state, String zip, int no_of_Employees) {
        super(name, email, street, city, state, zip);
        this.no_of_Employees = no_of_Employees;
    }

    /**
     *
     */
    private int no_of_Employees;

	@Override
	public int getNumberOfEmployees() {
		// TODO Auto-generated method stub
		return no_of_Employees;
	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}
}
