package com.crts.app.magna.main.dto;

public class DistrictMasterDtoFetch {
	private int districtId;

	private String districtName;

	
	private StateMasterDto districtStateId;

	private int districtStatus;

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public StateMasterDto getDistrictStateId() {
		return districtStateId;
	}

	public void setDistrictStateId(StateMasterDto districtStateId) {
		this.districtStateId = districtStateId;
	}

	public int getDistrictStatus() {
		return districtStatus;
	}

	public void setDistrictStatus(int districtStatus) {
		this.districtStatus = districtStatus;
	}
	public DistrictMasterDtoFetch()
	{
		
	}


}
