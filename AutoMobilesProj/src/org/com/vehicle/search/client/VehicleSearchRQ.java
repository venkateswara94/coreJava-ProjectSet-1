package org.com.vehicle.search.client;
/**
 * 
 * @author venkatesh
 *
 */
public class VehicleSearchRQ {

	// customerdetails, vehiclerq

	private String custId;

	private String gender;

	private int age;

	//private String addrId;

	private String country;

	//private String vehicleName;

	//private String companyName;
	
	//private double totalPrice;
	
	private int noOfWheels;
	
	public VehicleSearchRQ(){}

	public VehicleSearchRQ(String custId, String gender, int age, String country, int noOfWheels) {
		super();
		this.custId = custId;
		this.gender = gender;
		this.age = age;
		this.country = country;
		this.noOfWheels = noOfWheels;
	}

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	@Override
	public String toString() {
		return "VehicleSearchRQ [custId=" + custId + ", gender=" + gender + ", age=" + age + ", country=" + country
				+ ", noOfWheels=" + noOfWheels + "]";
	}

}
