package com.crts.app.magna.main.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.magna.main.dto.BranchMasterDtoFetch;
import com.crts.app.magna.main.dto.BranchTypeMasterDtoFetch;
import com.crts.app.magna.main.dto.CustomerCibilDetailsDtoFetch;
import com.crts.app.magna.main.dto.DealerMasterDtoFetch;
import com.crts.app.magna.main.dto.DistrictMasterDtoFetch;
import com.crts.app.magna.main.dto.EnquiryDetailsDtoFetch;
import com.crts.app.magna.main.dto.EnquiryStatusTraceDtoFetch;
import com.crts.app.magna.main.dto.LoanTypeDto;
import com.crts.app.magna.main.dto.LoanTypeDtoFetch;
import com.crts.app.magna.main.dto.StateMasterDtoFetch;
import com.crts.app.magna.main.dto.StatusMasterDto;
import com.crts.app.magna.main.dto.StatusMasterDtoFetch;
import com.crts.app.magna.main.dto.SubDealerMasterDtoFetch;
import com.crts.app.magna.main.dto.VenderDetailsDtoFetch;
import com.crts.app.magna.main.model.EnquiryDetails;
import com.crts.app.magna.main.model.LoanType;
import com.crts.app.magna.main.model.StatusMaster;
import com.crts.app.magna.main.service.HomeServiceI;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class HomeController {

	@Autowired
	HomeServiceI si;

	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = "application/json")
	public void save(@RequestBody String object) throws JsonMappingException, JsonProcessingException {
		System.out.println("inside save of controller");
//		System.out.println(object);
//		System.out.println(object.getClass().getName());
		ObjectMapper ob = new ObjectMapper();
		HashMap obb = ob.readValue(object, HashMap.class);
		System.out.println(obb.getClass().getName());
		Set<String> set = obb.keySet();
		for (String s : set) {
			System.out.println(s);
			if (s.equals("statusName")) {
				StatusMasterDto obb1 = ob.readValue(object, StatusMasterDto.class);
				System.out.println(obb1.getClass().getName());
				si.savedata(obb1);
			}
			else if (s.equals("loanName")) {
				LoanTypeDto obb1 = ob.readValue(object, LoanTypeDto.class);
				System.out.println(obb1.getClass().getName());
				si.savedata(obb1);
			}
		}

//		  if(object!=null) { System.out.println("inside save of controller if");
//		   }

	}

//	@RequestMapping("/getdata")
//	public List<StatusMasterDtoFetch> getlistdata() {
//		System.out.println("inside controller");
//		return si.fetchlistdata();
//	}
	@RequestMapping("/getStatusMaster")
	public List<StatusMasterDtoFetch> getStatusMaster()
	{
		return si.fetchStatusMaster();
	}
	@RequestMapping("/getBranchMaster")
	public List<BranchMasterDtoFetch> getBranchMaster()
	{
		return si.fetchBranchMaster();
	}
	@RequestMapping("/getBranchTypeMaster")
	public List<BranchTypeMasterDtoFetch> getBranchTypeMaster()
	{
		return si.fetchBranchTypeMaster();
	}
	@RequestMapping("/getCustomerCibilDetails")
	public List<CustomerCibilDetailsDtoFetch> getCustomerCibilDetails()
	{
		return si.fetchCustomerCibilDetails();
	}
	@RequestMapping("/getDealerMaster")
	public List<DealerMasterDtoFetch> getDealerMaster()
	{
		return si.fetchDealerMaster();
	}
	@RequestMapping("/getDistrictMaster")
	public List<DistrictMasterDtoFetch> getDistrictMaster()
	{
		return si.fetchDistrictMaster();
	}
	@RequestMapping("/getEnquiryDetails")
	public List<EnquiryDetailsDtoFetch> getEnquiryDetails()
	{
		return si.fetchEnquiryDetails();
	}
	@RequestMapping("/getLoanType")
	public List<LoanTypeDtoFetch> getLoanType()
	{
		return si.fetchLoanType();
	}
	@RequestMapping("/getStateMaster")
	public List<StateMasterDtoFetch> getStateMaster()
	{
		return si.fetchStateMaster();
	}
	@RequestMapping("/getSubDealerMaster")
	public List<SubDealerMasterDtoFetch> getSubDealerMaster()
	{
		return si.fetchSubDealerMaster();
	}
	@RequestMapping("/getVenderDetails")
	public List<VenderDetailsDtoFetch> getVenderDetails()
	{
		return si.fetchVenderDetails();
	}
}