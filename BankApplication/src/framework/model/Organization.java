
package framework.model;


public class Organization
        extends Customer
        implements IOrganization {

    public Organization(String name, String email, String street, String city, String state, String zip, String no_of_Employees) {
        super(name, email, street, city, state, zip);
        this.no_of_Employees = Integer.parseInt(no_of_Employees);
    }

    @Override
    public String getField(String key) {
        if ("employees".equals(key)) {
            return "" + no_of_Employees;
        } else {
            return super.getField(key);
        }
    }

    @Override
    public String getType() {
        return "C";
    }
    /**
     *
     */
    private int no_of_Employees;
}
