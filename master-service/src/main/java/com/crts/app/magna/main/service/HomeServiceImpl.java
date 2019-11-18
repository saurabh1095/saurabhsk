package com.crts.app.magna.main.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
import com.crts.app.magna.main.model.EnquiryStatusTrace;
import com.crts.app.magna.main.model.LoanType;
import com.crts.app.magna.main.model.StatusMaster;
import com.crts.app.magna.main.repository.HomeRepositoryI;
import com.crts.app.magna.main.repository.LoanTypeRepository;

@Service
public class HomeServiceImpl implements HomeServiceI
{
	@Autowired
	HomeRepositoryI hri;
	
	@Autowired
	LoanTypeRepository ltr;
	

	@Override
	public void savedata(Object o) {
		System.out.println("inside save of service");
//		ModelMapper m=new ModelMapper();
//		StatusMaster sm=m.map(o,StatusMaster.class);
//		System.out.println(sm);
		System.out.println(o.getClass().getName());
		if(o instanceof StatusMasterDto)
		{
			System.out.println("inside save of service statusmaster");
			ModelMapper m=new ModelMapper();
			StatusMaster sm=m.map(o,StatusMaster.class);
//			StatusMaster sm=(StatusMaster) o;
			hri.save(sm);
		}
		else if(o instanceof LoanTypeDto)
		{
			System.out.println("inside save of service loan type");
			ModelMapper m=new ModelMapper();
			LoanType lt=m.map(o,LoanType.class);
//			LoanType lt=(LoanType) o;
			ltr.save(lt);
		}
	}
//		else if(o instanceof StatusMaster)
//		{
//			StatusMaster sm=(StatusMaster) o;
//			hri.save(sm);
//		}
		
		
//	}

	@Override
	public List<StatusMasterDtoFetch> fetchStatusMaster() {
		System.out.println("inside Service");
		List<StatusMaster> l=(List<StatusMaster>) hri.findAll();
		System.out.println(l);
		System.out.println("hiiiii");
		ModelMapper m=new  ModelMapper();
		List<StatusMasterDtoFetch> list=new ArrayList<StatusMasterDtoFetch>();
		for(StatusMaster object:l)
		{
			StatusMasterDtoFetch smdf=m.map(object, StatusMasterDtoFetch.class);
			list.add(smdf);
		}
	
//		List<StatusMasterDtoFetch> ls= (List<StatusMasterDtoFetch>) m.map(l, StatusMasterDtoFetch.class);
		return list;
	}


	@Override
	public List<BranchMasterDtoFetch> fetchBranchMaster() {
		System.out.println("inside Service");
		List<BranchMaster> l=(List<BranchMaster>) hri.findAll();
		ModelMapper m=new  ModelMapper();
		List<BranchMasterDtoFetch> list=new ArrayList<BranchMasterDtoFetch>();
		for(BranchMaster object:l)
		{
			BranchMasterDtoFetch smdf=m.map(object, BranchMasterDtoFetch.class);
			list.add(smdf);
		}
	
		return list;
	}


	@Override
	public List<BranchTypeMasterDtoFetch> fetchBranchTypeMaster() {
		System.out.println("inside Service");
		List<BranchTypeMaster> l=(List<BranchTypeMaster>) hri.findAll();
		ModelMapper m=new  ModelMapper();
		List<BranchTypeMasterDtoFetch> list=new ArrayList<BranchTypeMasterDtoFetch>();
		for(BranchTypeMaster object:l)
		{
			BranchTypeMasterDtoFetch smdf=m.map(object, BranchTypeMasterDtoFetch.class);
			list.add(smdf);
		}
	
		return list;
	}


	@Override
	public List<CustomerCibilDetailsDtoFetch> fetchCustomerCibilDetails() {
		System.out.println("inside Service");
		List<CustomerCibilDetails> l=(List<CustomerCibilDetails>) hri.findAll();
		ModelMapper m=new  ModelMapper();
		List<CustomerCibilDetailsDtoFetch> list=new ArrayList<CustomerCibilDetailsDtoFetch>();
		for(CustomerCibilDetails object:l)
		{
			CustomerCibilDetailsDtoFetch smdf=m.map(object,CustomerCibilDetailsDtoFetch.class);
			list.add(smdf);
		}
	
		return list;
	}


	@Override
	public List<DealerMasterDtoFetch> fetchDealerMaster() {
		List<DealerMaster> l=(List<DealerMaster>) hri.findAll();
		ModelMapper m=new  ModelMapper();
		List<DealerMasterDtoFetch> list=new ArrayList<DealerMasterDtoFetch>();
		for(DealerMaster object:l)
		{
			DealerMasterDtoFetch smdf=m.map(object,DealerMasterDtoFetch.class);
			list.add(smdf);
		}
	
		return list;
	}
	@Override
	public List<DistrictMasterDtoFetch> fetchDistrictMaster() {
		List<DistrictMaster> l=(List<DistrictMaster>) hri.findAll();
		ModelMapper m=new  ModelMapper();
		List<DistrictMasterDtoFetch> list=new ArrayList<DistrictMasterDtoFetch>();
		for(DistrictMaster object:l)
		{
			DistrictMasterDtoFetch smdf=m.map(object,DistrictMasterDtoFetch.class);
			list.add(smdf);
		}
	
		return list;
	}


	@Override
	public List<EnquiryDetailsDtoFetch> fetchEnquiryDetails() {
		List<EnquiryDetails> l=(List<EnquiryDetails>) hri.findAll();
		ModelMapper m=new  ModelMapper();
		List<EnquiryDetailsDtoFetch> list=new ArrayList<EnquiryDetailsDtoFetch>();
		for(EnquiryDetails object:l)
		{
			EnquiryDetailsDtoFetch smdf=m.map(object,EnquiryDetailsFetch.class);
			list.add(smdf);
		}
	
		return list;
	}


	@Override
	public List<EnquiryStatusTraceDtoFetch> fetchEnquiryStatusTrace() {
		List<EnquiryStatusTrace> l=(List<EnquiryStatusTrace>) hri.findAll();
		ModelMapper m=new  ModelMapper();
		List<EnquiryStatusTraceDtoFetch> list=new ArrayList<EnquiryStatusTraceDtoFetch>();
		for(EnquiryStatusTrace object:l)
		{
			EnquiryStatusTraceDtoFetch smdf=m.map(object,EnquiryStatusTraceDtoFetch.class);
			list.add(smdf);
		}
	
		return list;
	}


	@Override
	public List<LoanTypeDtoFetch> fetchLoanType() {
		List<LoanType> l=(List<LoanType>) ltr.findAll();
		ModelMapper m=new  ModelMapper();
		List<LoanTypeDtoFetch> list=new ArrayList<LoanTypeDtoFetch>();
		for(LoanType object:l)
		{
			LoanTypeDtoFetch smdf=m.map(object,LoanTypeDtoFetch.class);
			list.add(smdf);
		}
	
		return list;
	}


	@Override
	public List<StateMasterDtoFetch> fetchStateMaster() {
		List<StateMaster> l=(List<StateMaster>) ltr.findAll();
		ModelMapper m=new  ModelMapper();
		List<StateMasterDtoFetch> list=new ArrayList<StateMasterDtoFetch>();
		for(StateMaster object:l)
		{
			StateMasterDtoFetch smdf=m.map(object,StateMasterDtoFetch.class);
			list.add(smdf);
		}
	
		return list;
	}


	@Override
	public List<SubDealerMasterDtoFetch> fetchSubDealerMaster() {
		List<SubDealerMaster> l=(List<SubDealerMaster>) ltr.findAll();
		ModelMapper m=new  ModelMapper();
		List<SubDealerMasterDtoFetch> list=new ArrayList<SubDealerMasterDtoFetch>();
		for(SubDealerMaster object:l)
		{
			SubDealerMasterDtoFetch smdf=m.map(object,SubDealerMasterDtoFetch.class);
			list.add(smdf);
		}
	
		return list;
	}


	@Override
	public List<VenderDetailsDtoFetch> fetchVenderDetails() {
		List<VenderDetails> l=(List<VenderDetails>) ltr.findAll();
		ModelMapper m=new  ModelMapper();
		List<VenderDetailsDtoFetch> list=new ArrayList<VenderDetailsDtoFetch>();
		for(VenderDetails object:l)
		{
			VenderDetailsDtoFetch smdf=m.map(object,VenderDetailsDtoFetch.class);
			list.add(smdf);
		}
	
		return list;
	}


	


	
}
	

//	@Override
//	public List<Statusalldto> getalldata() {
//		// TODO Auto-generated method stub
//		HomeServiceImpl h=new HomeServiceImpl();
//		List<StatusMaster> ll=(List<StatusMaster>) h.getd();
//		System.out.println(ll);
//		ModelMapper m=new ModelMapper();
//		List<Statusalldto>l=(List<Statusalldto> )m.map(ll, Statusalldto.class);
//		return l;
//	}

//	@Override
//	public List<Statusalldto> getd() {
//		// TODO Auto-generated method stub
//		List<StatusMaster> ll=(List<StatusMaster>) hri.findAll();
//		System.out.println("getd"+ll);
//ModelMapper m=new ModelMapper();
//List<Statusalldto> l=(List<Statusalldto>) m.map(ll, Statusalldto.class);
//return l;
//	}
//	
