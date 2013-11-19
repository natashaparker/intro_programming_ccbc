/**
 * 
 */

/**
 * @author user
 *
 */

public class Contacts {

	/**
	 * 
	 */
	
	private String name;
	private String phone_number;
	private String address;
	
	public Contacts(String name, String phone_number, String address) {
		this.name = name;
		this.phone_number = phone_number;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Contacts [name=" + name + ", phone_number=" + phone_number
				+ ", address=" + address + "]";
	}

}
