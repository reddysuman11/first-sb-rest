package com.example.demo.util;

import com.example.demo.model.Address;
import com.example.demo.model.SampleRequest;

public interface Util {

	public static SampleRequest createSampleRequest() {
	
		SampleRequest sampleRequest = new SampleRequest();
		sampleRequest.setPhone(789654);
		sampleRequest.setName("Advik");
		sampleRequest.setAddress(createAddress());
		return sampleRequest;
		
	}
	
	public static Address createAddress() {
		Address address = new Address();
		address.setHno(29);
		address.setStreet("sirpur");
		address.setCity("Nizamabad");
		address.setState("Telangana");
		
		return address;
	}
	
}
