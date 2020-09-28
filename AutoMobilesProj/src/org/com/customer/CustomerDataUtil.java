package org.com.customer;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author venkatesh
 *
 */
public class CustomerDataUtil {
	static List<Customer> custList = new ArrayList<>();
	
	public static List<Customer> getCustomers(){		
		
		//Customer -1		
		Address a1 = new Address("A102","9022345","Rainbow Enclave","Madhura Nagar","Vijayawada","AP","India",false);
		Address a2 = new Address("A200","8893243","Ramesh Tower","Kukatpalli","Hyderabad","Telangana","India",true);
		List<Address> addrList1 = new ArrayList<>();
		addrList1.add(a1);		
		addrList1.add(a2);
		Customer c1 = new Customer("C100","Banu","Male",28,"PAN",addrList1);		
		custList.add(c1);
		
		//Customer -2
		Address a3 = new Address("A102","7738745","Green Garden","Jasola Vihar","Delhi","NCR","India",true);
		List<Address> addrList2 = new ArrayList<>();
		addrList2.add(a3);
		Customer c2 = new Customer("C101","Godsay","Male",25,"Driving Licence",addrList2);
		custList.add(c2);
		
		
		//Customer-3
		Address a4 = new Address("B094","54893472","Palm medows","F5-Cross","Michigon","Michigon","USA",true);
		List<Address> addrList3 = new ArrayList<>();
		addrList3.add(a4);
		Customer c3 = new Customer("C945","Hitesh","Female",29,"Voter Card",addrList3);
		custList.add(c3);
		
		return custList;
	}

}
