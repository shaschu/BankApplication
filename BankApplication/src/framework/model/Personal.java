
package framework.model;


public class Personal
        extends Customer
        implements IPerson {

    public Personal(String name, String email, String street, String city, String state, String zip, String birthdate) {
        super(name, email, street, city, state, zip);
        this.birthdate = birthdate;
    }

    @Override
    public String getField(String key) {
        if ("birthdate".equals(key)) {
            return birthdate;
        } else {
            return super.getField(key);
        }
    }

    @Override
    public String getType() {
        return "P";
    }
    /**
     *
     */
    private String birthdate;
}
