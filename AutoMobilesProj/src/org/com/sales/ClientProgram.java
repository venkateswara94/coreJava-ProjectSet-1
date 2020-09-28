package org.com.sales;

import java.util.function.Supplier;

import org.com.vehicle.book.service.VehicleBookingService;
import org.com.vehicle.booking.client.VehicleBookingRQ;
import org.com.vehicle.booking.client.VehicleBookingRS;
import org.com.vehicle.exceptioin.VehicleValidationException;
import org.com.vehicle.search.client.VehicleSearchRQ;
import org.com.vehicle.search.client.VehicleSearchRS;
import org.com.vehicle.search.service.VehicleSearchService;
/**
 * 
 * @author venkatesh
 *
 */
public class ClientProgram {

	VehicleSearchRQ searchRQ = new VehicleSearchRQ("C101", "Male", 28, "India", 2);
	VehicleBookingRQ bookingRQ = new VehicleBookingRQ("C101","Male",28,"India","A4934","Acess","Suzuki",2);

	// requesting for availability/search of vehicles
	public VehicleSearchRS getVehicles() {
		VehicleSearchRS response = null;
		//VehicleSearchService vehiclesearch = new VehicleSearchService();
		
		///Suppliers are useful when we don’t need to supply any value and obtain a result at the same time.
		Supplier<VehicleSearchService> vehiclesearch = VehicleSearchService::new;
		try {
			response = vehiclesearch.get().getVehicles(searchRQ);
			//System.out.println(response);
		} catch (VehicleValidationException e) {
			System.out.println(e.getMessage());
		}
		return response;
	}

	
	public VehicleBookingRS bookVehicle(){
		VehicleBookingRS vehicleRs = null;
		//VehicleSearchRS vehicleSearchRs = getVehicles();
		VehicleBookingService service = new VehicleBookingService();
		
		try {
			vehicleRs = service.bookVehicle(bookingRQ);
			System.out.println(vehicleRs);
		} catch (VehicleValidationException e) {
			System.out.println(e.getMessage());
		}
		return vehicleRs;	
	}
	
	public static void main(String[] args) {
		ClientProgram cp = new ClientProgram();
		cp.getVehicles();
		//cp.bookVehicle();
	}

}
