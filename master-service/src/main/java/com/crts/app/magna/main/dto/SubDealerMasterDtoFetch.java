package com.crts.app.magna.main.dto;

public class SubDealerMasterDtoFetch {
private int subDealerId;
	
	//@OneToOne
		//has-a-relationship(one-to-one Foreign key from dealer)
	private DealerMaster dealerId;
	
	private String subDealerName;
	
	private String contactNo;
	
	private String subDealerAddress;
	
	//@OneToOne
	private BranchMaster subDealerBranchId;   	////has-a-relationship(one-to-one Foreign key from branch)
	
	private String subDealerAccountNo;
	
	private String subDealerEmailId;
	
	private int subDealerStatus;
	
	private String subDealerIFSCCode;

	public int getSubDealerId() {
		return subDealerId;
	}

	public void setSubDealerId(int subDealerId) {
		this.subDealerId = subDealerId;
	}

	public DealerMaster getDealerId() {
		return dealerId;
	}

	public void setDealerId(DealerMaster dealerId) {
		this.dealerId = dealerId;
	}

	public String getSubDealerName() {
		return subDealerName;
	}

	public void setSubDealerName(String subDealerName) {
		this.subDealerName = subDealerName;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getSubDealerAddress() {
		return subDealerAddress;
	}

	public void setSubDealerAddress(String subDealerAddress) {
		this.subDealerAddress = subDealerAddress;
	}

	public BranchMaster getSubDealerBranchId() {
		return subDealerBranchId;
	}

	public void setSubDealerBranchId(BranchMaster subDealerBranchId) {
		this.subDealerBranchId = subDealerBranchId;
	}

	public String getSubDealerAccountNo() {
		return subDealerAccountNo;
	}

	public void setSubDealerAccountNo(String subDealerAccountNo) {
		this.subDealerAccountNo = subDealerAccountNo;
	}

	public String getSubDealerEmailId() {
		return subDealerEmailId;
	}

	public void setSubDealerEmailId(String subDealerEmailId) {
		this.subDealerEmailId = subDealerEmailId;
	}

	public int getSubDealerStatus() {
		return subDealerStatus;
	}

	public void setSubDealerStatus(int subDealerStatus) {
		this.subDealerStatus = subDealerStatus;
	}

	public String getSubDealerIFSCCode() {
		return subDealerIFSCCode;
	}

	public void setSubDealerIFSCCode(String subDealerIFSCCode) {
		this.subDealerIFSCCode = subDealerIFSCCode;
	}
	public SubDealerMasterDtoFetch()
	{
		
	}
	
}
