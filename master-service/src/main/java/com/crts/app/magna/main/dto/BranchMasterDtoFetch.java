package com.crts.app.magna.main.dto;

public class BranchMasterDtoFetch {
		
		private String branchName;
		private String branchCode;

	
		private StateMasterDto branchStateId;

		
		private DistrictMasterDto branchDistrictId;
		
		private int branchStatus;
		private String branchManagerName;
		private String branchAddress;
		private String branchContactNumber;
		
		
		private BranchTypeMasterDto branchTypeId;
		
		private String branchCreationDate;

		public String getBranchName() {
			return branchName;
		}

		public void setBranchName(String branchName) {
			this.branchName = branchName;
		}

		public String getBranchCode() {
			return branchCode;
		}

		public void setBranchCode(String branchCode) {
			this.branchCode = branchCode;
		}

		public StateMasterDto getBranchStateId() {
			return branchStateId;
		}

		public void setBranchStateId(StateMasterDto branchStateId) {
			this.branchStateId = branchStateId;
		}

		public DistrictMasterDto getBranchDistrictId() {
			return branchDistrictId;
		}

		public void setBranchDistrictId(DistrictMasterDto branchDistrictId) {
			this.branchDistrictId = branchDistrictId;
		}

		public int getBranchStatus() {
			return branchStatus;
		}

		public void setBranchStatus(int branchStatus) {
			this.branchStatus = branchStatus;
		}

		public String getBranchManagerName() {
			return branchManagerName;
		}

		public void setBranchManagerName(String branchManagerName) {
			this.branchManagerName = branchManagerName;
		}

		public String getBranchAddress() {
			return branchAddress;
		}

		public void setBranchAddress(String branchAddress) {
			this.branchAddress = branchAddress;
		}

		public String getBranchContactNumber() {
			return branchContactNumber;
		}

		public void setBranchContactNumber(String branchContactNumber) {
			this.branchContactNumber = branchContactNumber;
		}

		public BranchTypeMasterDto getBranchTypeId() {
			return branchTypeId;
		}

		public void setBranchTypeId(BranchTypeMasterDto branchTypeId) {
			this.branchTypeId = branchTypeId;
		}

		public String getBranchCreationDate() {
			return branchCreationDate;
		}

		public void setBranchCreationDate(String branchCreationDate) {
			this.branchCreationDate = branchCreationDate;
		}
		public BranchMasterDtoFetch()
		{
			
		}

}
