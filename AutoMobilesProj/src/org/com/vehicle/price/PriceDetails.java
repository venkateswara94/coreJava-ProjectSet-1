package org.com.vehicle.price;
/**
 * 
 * @author venkatesh
 *
 */
public class PriceDetails {

	private boolean isPaymentDone;

	private int noOfUnits;

	private int factoryPrice;

	private int gst_percent;

	//private int accessoriesPrice;

	//private int discountedPrice;

	//private int serviceCharge;

	//private int otherCharges;
	
	private double totalPrice;
	
	private double netPrice;

	public PriceDetails(){}

	public PriceDetails(boolean isPaymentDone, int noOfUnits, int factoryPrice, int gst_percent, double totalPrice,
			double netPrice) {
		super();
		this.isPaymentDone = isPaymentDone;
		this.noOfUnits = noOfUnits;
		this.factoryPrice = factoryPrice;
		this.gst_percent = gst_percent;
		this.totalPrice = totalPrice;
		this.netPrice = netPrice;
	}

	public boolean isPaymentDone() {
		return isPaymentDone;
	}

	public void setPaymentDone(boolean isPaymentDone) {
		this.isPaymentDone = isPaymentDone;
	}

	public int getNoOfUnits() {
		return noOfUnits;
	}

	public void setNoOfUnits(int noOfUnits) {
		this.noOfUnits = noOfUnits;
	}

	public int getFactoryPrice() {
		return factoryPrice;
	}

	public void setFactoryPrice(int factoryPrice) {
		this.factoryPrice = factoryPrice;
	}

	public int getGst_percent() {
		return gst_percent;
	}

	public void setGst_percent(int gst_percent) {
		this.gst_percent = gst_percent;
	}

	public double getTotalPrice() {
		if(this.totalPrice==0.0 && this.factoryPrice!=0 && this.gst_percent!=0){
			return this.noOfUnits*(this.factoryPrice+(this.factoryPrice*this.gst_percent/100));
		}else
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public double getNetPrice() {
		if(this.netPrice==0.0){
			return this.noOfUnits*this.factoryPrice;
		}else
			return netPrice;
		
	}

	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}

	@Override
	public String toString() {
		return "PriceDetails [isPaymentDone=" + isPaymentDone + ", noOfUnits=" + noOfUnits + ", factoryPrice="
				+ factoryPrice + ", gst_percent=" + gst_percent + ", totalPrice=" + totalPrice + ", netPrice="
				+ netPrice + "]";
	}
	
	public int equals(PriceDetails p1) {
		return (p1.getTotalPrice()>this.getTotalPrice())?-1:1;

	}
	
}
