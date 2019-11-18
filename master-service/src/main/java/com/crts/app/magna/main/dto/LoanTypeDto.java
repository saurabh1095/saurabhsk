package com.crts.app.magna.main.dto;

public class LoanTypeDto {
	private String loanName;
private StatusMasterDto sm;
	public StatusMasterDto getSm() {
	return sm;
}

public void setSm(StatusMasterDto sm) {
	this.sm = sm;
}

	public String getLoanName() {
		return loanName;
	}

	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}


}
