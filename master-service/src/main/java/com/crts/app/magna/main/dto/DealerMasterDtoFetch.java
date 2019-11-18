package com.crts.app.magna.main.dto;

public class DealerMasterDtoFetch {
private int dealerId;
	
	private String dealerName;
	
	private String dealerContactNo;
	
	private String dealerAddress;
	
	//@OneToOne
	  // has a relation one to one foreign key from branch
	private BranchMasterDto dealerBranchId;

	private String dealerAccountNo;
	
	private String dealerEmailID;
	
	private int dealerStatus;

	private String dealerIFSCCode;
	
	private String dealerAccountType;
	
	private String dealerBankName;

	public int getDealerId() {
		return dealerId;
	}

	public void setDealerId(int dealerId) {
		this.dealerId = dealerId;
	}

	public String getDealerName() {
		return dealerName;
	}

	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}

	public String getDealerContactNo() {
		return dealerContactNo;
	}

	public void setDealerContactNo(String dealerContactNo) {
		this.dealerContactNo = dealerContactNo;
	}

	public String getDealerAddress() {
		return dealerAddress;
	}

	public void setDealerAddress(String dealerAddress) {
		this.dealerAddress = dealerAddress;
	}

	public BranchMasterDto getDealerBranchId() {
		return dealerBranchId;
	}

	public void setDealerBranchId(BranchMasterDto dealerBranchId) {
		this.dealerBranchId = dealerBranchId;
	}

	public String getDealerAccountNo() {
		return dealerAccountNo;
	}

	public void setDealerAccountNo(String dealerAccountNo) {
		this.dealerAccountNo = dealerAccountNo;
	}

	public String getDealerEmailID() {
		return dealerEmailID;
	}

	public void setDealerEmailID(String dealerEmailID) {
		this.dealerEmailID = dealerEmailID;
	}

	public int getDealerStatus() {
		return dealerStatus;
	}

	public void setDealerStatus(int dealerStatus) {
		this.dealerStatus = dealerStatus;
	}

	public String getDealerIFSCCode() {
		return dealerIFSCCode;
	}

	public void setDealerIFSCCode(String dealerIFSCCode) {
		this.dealerIFSCCode = dealerIFSCCode;
	}

	public String getDealerAccountType() {
		return dealerAccountType;
	}

	public void setDealerAccountType(String dealerAccountType) {
		this.dealerAccountType = dealerAccountType;
	}

	public String getDealerBankName() {
		return dealerBankName;
	}

	public void setDealerBankName(String dealerBankName) {
		this.dealerBankName = dealerBankName;
	}
	public DealerMasterDtoFetch()
	{
		
	}


}
