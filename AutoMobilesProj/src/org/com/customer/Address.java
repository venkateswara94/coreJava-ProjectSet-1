package org.com.customer;
/**
 * 
 * @author venkatesh
 *
 */
public class Address {

	private String addrId;
	
	private String phoneNumber;
	
	private String buildingName;
	
	private String localAreaName;
	
	private String city;
	
	private String state;
	
	private String country;
	
	private boolean isPrimaryAddress; 

	public Address(){}
	

	public Address(String addrId, String phoneNumber, String buildingName, String localAreaName, String city,
			String state, String country, boolean isPrimaryAddress) {
		super();
		this.addrId = addrId;
		this.phoneNumber = phoneNumber;
		this.buildingName = buildingName;
		this.localAreaName = localAreaName;
		this.city = city;
		this.state = state;
		this.country = country;
		this.isPrimaryAddress = isPrimaryAddress;
	}



	public boolean isPrimaryAddress() {
		return isPrimaryAddress;
	}



	public void setPrimaryAddress(boolean isPrimaryAddress) {
		this.isPrimaryAddress = isPrimaryAddress;
	}



	public String getAddrId() {
		return addrId;
	}

	public void setAddrId(String addrId) {
		this.addrId = addrId;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getLocalAreaName() {
		return localAreaName;
	}

	public void setLocalAreaName(String localAreaName) {
		this.localAreaName = localAreaName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	@Override
	public String toString() {
		return "Address [addrId=" + addrId + ", phoneNumber=" + phoneNumber + ", buildingName=" + buildingName
				+ ", localAreaName=" + localAreaName + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", isPrimaryAddress=" + isPrimaryAddress + "]";
	}

}
