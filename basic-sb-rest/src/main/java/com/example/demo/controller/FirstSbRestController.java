package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.SampleRequest;
import com.example.demo.util.Util;

@RestController
@RequestMapping(value = "/firstSbRest")
public class FirstSbRestController {

	public FirstSbRestController() {
		System.out.println("FirstSbRestController INSTANCE created....");
	}
	
	@GetMapping(path = "/getMappingGET")
	public String getMappingGET() {
		return "Successfully returned from getMappingGET()........";
	}
	
	@RequestMapping(path = "/requestMapping")
	public String requestMapping() {
		return "Successfully returned from requestMapping()........";
	}
	
	@RequestMapping(path = "/requestMappingGET", method = RequestMethod.GET)
	public String requestMappingGET() {
		return "Successfully returned from requestMappingGET()........";
	}
	
	@RequestMapping(path = "/requestMappingPOST", method = RequestMethod.POST)
	public String requestMappingPOST() {
		return "Successfully returned from requestMappingPOST()........";
	}
	
	@RequestMapping(path = "/produceDefault", method = RequestMethod.GET)
	public SampleRequest produceDefault() {
		System.out.println("Successfully returned from produceDefault()........");
		return Util.createSampleRequest();
	}
	
	@RequestMapping(path = "/requestMappingGETConsumes", method = RequestMethod.GET, consumes =  { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public String requestMappingGETConsumes() {
		return "Successfully returned from requestMappingGETConsumes()........";
	}
	
	@RequestMapping(path = "/producesGETJSON", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public SampleRequest produces_GET_JSON() {
		return Util.createSampleRequest();
	}
	
	@RequestMapping(path = "/producesGETXML", method = RequestMethod.GET,  produces = MediaType.APPLICATION_XML_VALUE)
	public SampleRequest produces_GET_XML() {
		return Util.createSampleRequest();
	}

	@RequestMapping(path = "/consumesPOSTJSON", method = RequestMethod.POST, consumes =  { MediaType.APPLICATION_JSON_VALUE },
			produces = MediaType.APPLICATION_JSON_VALUE)
	public SampleRequest consumes_POST_JSON(@RequestBody SampleRequest sampleRequest) {
		return sampleRequest;
	}

	@RequestMapping(path = "/consumesPOSTXML", method = RequestMethod.POST, consumes =  {MediaType.APPLICATION_XML_VALUE },
			produces = MediaType.APPLICATION_XML_VALUE)
	public SampleRequest consumes_POST_XML(@RequestBody SampleRequest sampleRequest) {
		return sampleRequest;
	}
}
