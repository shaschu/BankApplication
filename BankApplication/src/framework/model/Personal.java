
package framework.model;


public class Personal
        extends Customer
        implements IPerson {

	private String type;
    public Personal(String name, String email, String street, String city, String state, String zip, String birthdate) {
        super(name, email, street, city, state, zip);
        this.birthdate = birthdate;
    }
    /*
     * this constructor for CC Account
     */
    public Personal(String name, String email, String street, String city, String state, String zip, String ccNumber,String expDate,String atype) {
        super(name, email, street, city, state, zip);
//        this.ccNumber = ccNumber;
//        this.expDate=expDate;
        super.setCcNumber(ccNumber);
        super.setExpDate(expDate);
        super.setType(atype);
        this.type=atype;
    }
   /*@Override
    public String getField(String key) {
        if ("birthdate".equals(key)) {
            return birthdate;
        } else {
            return super.getField(key);
        }
    }*/

    @Override
    public String getType() {
        return type;
    }
    public String getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}
//	public String getCcNumber() {
//		return ccNumber;
//	}
//	public void setCcNumber(String ccNumber) {
//		this.ccNumber = ccNumber;
//	}
//	public String getExpDate() {
//		return expDate;
//	}
//	public void setExpDate(String expDate) {
//		this.expDate = expDate;
//	}
	/**
     *
     */
    private String birthdate;
//    private String ccNumber;
//    private String expDate;
	
}
