package org.com.vehicle.price;

import java.util.Date;

import org.com.customer.Customer;
/**
 * 
 * @author venkatesh
 *
 */
public class BillStructure {

	private int billNumber;

	private Date soldDate;

	private int warrantyInMonths;

	private PriceDetails priceDetails;

	private Customer customerDetails;

	public BillStructure() {
		// TODO Auto-generated constructor stub
	}

	public BillStructure(int billNumber, Date soldDate, int warrantyInMonths, PriceDetails priceDetails,
			Customer customerDetails) {
		super();
		this.billNumber = billNumber;
		this.soldDate = soldDate;
		this.warrantyInMonths = warrantyInMonths;
		this.priceDetails = priceDetails;
		this.customerDetails = customerDetails;
	}

	public int getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(int billNumber) {
		this.billNumber = billNumber;
	}

	public Date getSoldDate() {
		return soldDate;
	}

	public void setSoldDate(Date soldDate) {
		this.soldDate = soldDate;
	}

	public int getWarrantyInMonths() {
		return warrantyInMonths;
	}

	public void setWarrantyInMonths(int warrantyInMonths) {
		this.warrantyInMonths = warrantyInMonths;
	}

	public PriceDetails getPriceDetails() {
		return priceDetails;
	}

	public void setPriceDetails(PriceDetails priceDetails) {
		this.priceDetails = priceDetails;
	}

	public Customer getCustomerDetails() {
		return customerDetails;
	}

	public void setCustomerDetails(Customer customerDetails) {
		this.customerDetails = customerDetails;
	}

	@Override
	public String toString() {
		return "BillStructure [billNumber=" + billNumber + ", soldDate=" + soldDate + ", warrantyInMonths="
				+ warrantyInMonths + ", priceDetails=" + priceDetails + ", customerDetails=" + customerDetails + "]";
	}

}
