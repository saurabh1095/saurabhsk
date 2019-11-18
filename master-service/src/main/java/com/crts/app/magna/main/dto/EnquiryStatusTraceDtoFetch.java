package com.crts.app.magna.main.dto;

public class EnquiryStatusTraceDtoFetch {
	
	//@OneToOne
	private EnquiryDetailsDto enquiryId; 	//foreign key enquiry Details
	
	//@OneToOne
	private EnquiryDetailsDto customerId;	// foreign key enquiry Details

	public EnquiryDetailsDto getEnquiryId() {
		return enquiryId;
	}

	public void setEnquiryId(EnquiryDetailsDto enquiryId) {
		this.enquiryId = enquiryId;
	}

	public EnquiryDetailsDto getCustomerId() {
		return customerId;
	}

	public void setCustomerId(EnquiryDetailsDto customerId) {
		this.customerId = customerId;
	}
	public EnquiryStatusTraceDtoFetch()
	{
		
	}
	
}
