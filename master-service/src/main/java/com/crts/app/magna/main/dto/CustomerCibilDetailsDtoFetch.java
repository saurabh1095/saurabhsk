package com.crts.app.magna.main.dto;

public class CustomerCibilDetailsDtoFetch {
private int customerCibilDetailsId;
	
	private String customerCibilDetailsPrimaryId;
	
	private int customerCibilDetailsSecondaryId;
	
	private String customerCibilDetailsCibilStatus;
	
	private String customerCibilDetailsCibilReport;
	
	private int customerCibilDetailsCibilGeneratedDate;

	//@OneToOne
	private EnquiryDetailsDto customerId; //foreign key from Enqiry details

	public int getCustomerCibilDetailsId() {
		return customerCibilDetailsId;
	}

	public void setCustomerCibilDetailsId(int customerCibilDetailsId) {
		this.customerCibilDetailsId = customerCibilDetailsId;
	}

	public String getCustomerCibilDetailsPrimaryId() {
		return customerCibilDetailsPrimaryId;
	}

	public void setCustomerCibilDetailsPrimaryId(String customerCibilDetailsPrimaryId) {
		this.customerCibilDetailsPrimaryId = customerCibilDetailsPrimaryId;
	}

	public int getCustomerCibilDetailsSecondaryId() {
		return customerCibilDetailsSecondaryId;
	}

	public void setCustomerCibilDetailsSecondaryId(int customerCibilDetailsSecondaryId) {
		this.customerCibilDetailsSecondaryId = customerCibilDetailsSecondaryId;
	}

	public String getCustomerCibilDetailsCibilStatus() {
		return customerCibilDetailsCibilStatus;
	}

	public void setCustomerCibilDetailsCibilStatus(String customerCibilDetailsCibilStatus) {
		this.customerCibilDetailsCibilStatus = customerCibilDetailsCibilStatus;
	}

	public String getCustomerCibilDetailsCibilReport() {
		return customerCibilDetailsCibilReport;
	}

	public void setCustomerCibilDetailsCibilReport(String customerCibilDetailsCibilReport) {
		this.customerCibilDetailsCibilReport = customerCibilDetailsCibilReport;
	}

	public int getCustomerCibilDetailsCibilGeneratedDate() {
		return customerCibilDetailsCibilGeneratedDate;
	}

	public void setCustomerCibilDetailsCibilGeneratedDate(int customerCibilDetailsCibilGeneratedDate) {
		this.customerCibilDetailsCibilGeneratedDate = customerCibilDetailsCibilGeneratedDate;
	}

	public EnquiryDetailsDto getCustomerId() {
		return customerId;
	}

	public void setCustomerId(EnquiryDetailsDto customerId) {
		this.customerId = customerId;
	}
public CustomerCibilDetailsDtoFetch()
{
	
}
}
