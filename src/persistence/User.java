package persistence;

public class User {

	private String name;
	private String email;
	private String nationalId;
	private boolean seller;
	private boolean isPerson;
	private boolean isCompany;

	public User() {
	}

	public User(String name, String email, String nationId, boolean seller, boolean isPerson, boolean isCompany) {
		this.name = name;
		this.email = email;
		this.nationalId = nationId;
		this.seller = seller;
		this.isPerson = isPerson;
		this.isCompany = isCompany;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the nationalId
	 */
	public String getNationalId() {
		return nationalId;
	}

	/**
	 * @param nationalId
	 *            the nationalId to set
	 */
	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	/**
	 * @return the seller
	 */
	public boolean isSeller() {
		return seller;
	}

	/**
	 * @param seller
	 *            the seller to set
	 */
	public void setSeller(boolean seller) {
		this.seller = seller;
	}

	/**
	 * @return the isPerson
	 */
	public boolean isPerson() {
		return isPerson;
	}

	/**
	 * @param isPerson
	 *            the isPerson to set
	 */
	public void setPerson(boolean isPerson) {
		this.isPerson = isPerson;
	}

	/**
	 * @return the isCompany
	 */
	public boolean isCompany() {
		return isCompany;
	}

	/**
	 * @param isCompany
	 *            the isCompany to set
	 */
	public void setCompany(boolean isCompany) {
		this.isCompany = isCompany;
	}

}
