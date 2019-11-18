package com.crts.app.magna.main.model;


	import javax.persistence.Column;
	import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
	import javax.persistence.Table;
import javax.persistence.Transient;

	@Entity
	@Table(name="mf_m_loantype")
	public class LoanType {
		@Id
		@Column(name="ln_id")
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int loanId;
		

		
		@Column(name="ln_name")
		private String loanName;

		

		public int getLoanId() {
			return loanId;
		}

		public void setLoanId(int loanId) {
			this.loanId = loanId;
		}

		public String getLoanName() {
			return loanName;
		}

		public void setLoanName(String loanName) {
			this.loanName = loanName;
		}
		  
		
	}



