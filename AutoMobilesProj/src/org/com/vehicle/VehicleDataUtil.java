package org.com.vehicle;

import java.util.ArrayList;
import java.util.List;

import org.com.vehicle.price.PriceDetails;
/**
 * 
 * @author venkatesh
 *
 */
public class VehicleDataUtil {
	
	public static List<Vehicle> getVehiclesData(){
	List<Vehicle> vehicleList = new ArrayList<Vehicle>();
	PriceDetails dioPrice = new PriceDetails(false, 1, 40000, 20, 0.0, 0.0);
	dioPrice.setTotalPrice(dioPrice.getTotalPrice());
	dioPrice.setNetPrice(dioPrice.getNetPrice());
	Vehicle dio = new Vehicle("H1023","Dio","Honda",dioPrice,"HondaIndia",2);
	vehicleList.add(dio);
	
	PriceDetails access125Price = new PriceDetails(false, 1, 35000, 18, 0.0, 0.0);
	access125Price.setTotalPrice(access125Price.getTotalPrice());
	access125Price.setNetPrice(access125Price.getNetPrice());
	Vehicle access125 = new Vehicle("A4934","Acess","Suzuki",access125Price,"SZK",2);
	vehicleList.add(access125);
	
	PriceDetails vespaPrice = new PriceDetails(false, 1, 37000, 15, 0.0, 0.0);
	vespaPrice.setTotalPrice(vespaPrice.getTotalPrice());
	vespaPrice.setNetPrice(vespaPrice.getNetPrice());
	Vehicle vespa = new Vehicle("LV434","Vespa","LML",vespaPrice,"LVG PVT Ltd",2);
	vehicleList.add(vespa);
	
	PriceDetails mahendraAutoPrice = new PriceDetails(false, 1, 78000, 22, 0.0, 0.0);
	mahendraAutoPrice.setTotalPrice(mahendraAutoPrice.getTotalPrice());
	mahendraAutoPrice.setNetPrice(mahendraAutoPrice.getNetPrice());
	Vehicle mahendraAuto = new Vehicle("MZA4937","Mahendra","M&M",mahendraAutoPrice,"Mahi Automobiles",3);
	vehicleList.add(mahendraAuto);
	
	PriceDetails benzPrice = new PriceDetails(false, 1, 724000, 16, 0.0, 0.0);
	benzPrice.setTotalPrice(benzPrice.getTotalPrice());
	benzPrice.setNetPrice(benzPrice.getNetPrice());
	Vehicle benzCar = new Vehicle("TBSC3D432","Benz","Tata-Benz",benzPrice,"T&B India",4);
	vehicleList.add(benzCar);
	
	return vehicleList;
	
	}

}
