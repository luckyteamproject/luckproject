package com.cafe24.glaemfdjd.ongoingFacility.domain;

import com.cafe24.glaemfdjd.companyInfo.domain.CompanyInfoDto;
import com.cafe24.glaemfdjd.contract.domain.ContractDto;
import com.cafe24.glaemfdjd.inteEquip.domain.InteEquipDto;
import com.cafe24.glaemfdjd.ongoing.domain.OngoingDto;
import com.cafe24.glaemfdjd.schedule.domain.ScheduleDto;
import com.cafe24.glaemfdjd.wbsPCate.domain.WbsPCateDto;

public class OngoingFacilityDto {
	String ongoing_facility_code;
	CompanyInfoDto company_info;
	String ongoing_facility_acctcode;
	ContractDto contract;
	OngoingDto ongoing;
	ScheduleDto schedule;
	WbsPCateDto wbs_pcate;
	InteEquipDto inteequip;
	String ongoing_facility_startdate;
	String ongoing_facility_enddate;
	int ongoing_facility_cash;
	String ongoing_facility_signid;
	String ongoing_facility_date;
	
	public String getOngoing_facility_code() {
		return ongoing_facility_code;
	}
	public void setOngoing_facility_code(String ongoing_facility_code) {
		this.ongoing_facility_code = ongoing_facility_code;
	}
	public CompanyInfoDto getCompany_info() {
		return company_info;
	}
	public void setCompany_info(CompanyInfoDto company_info) {
		this.company_info = company_info;
	}
	public String getOngoing_facility_acctcode() {
		return ongoing_facility_acctcode;
	}
	public void setOngoing_facility_acctcode(String ongoing_facility_acctcode) {
		this.ongoing_facility_acctcode = ongoing_facility_acctcode;
	}
	public ContractDto getContract() {
		return contract;
	}
	public void setContract(ContractDto contract) {
		this.contract = contract;
	}
	public OngoingDto getOngoing() {
		return ongoing;
	}
	public void setOngoing(OngoingDto ongoing) {
		this.ongoing = ongoing;
	}
	public ScheduleDto getSchedule() {
		return schedule;
	}
	public void setSchedule(ScheduleDto schedule) {
		this.schedule = schedule;
	}
	public WbsPCateDto getWbs_pcate() {
		return wbs_pcate;
	}
	public void setWbs_pcate(WbsPCateDto wbs_pcate) {
		this.wbs_pcate = wbs_pcate;
	}
	public InteEquipDto getInteequip() {
		return inteequip;
	}
	public void setInteequip(InteEquipDto inteequip) {
		this.inteequip = inteequip;
	}
	public String getOngoing_facility_startdate() {
		return ongoing_facility_startdate;
	}
	public void setOngoing_facility_startdate(String ongoing_facility_startdate) {
		this.ongoing_facility_startdate = ongoing_facility_startdate;
	}
	public String getOngoing_facility_enddate() {
		return ongoing_facility_enddate;
	}
	public void setOngoing_facility_enddate(String ongoing_facility_enddate) {
		this.ongoing_facility_enddate = ongoing_facility_enddate;
	}
	public int getOngoing_facility_cash() {
		return ongoing_facility_cash;
	}
	public void setOngoing_facility_cash(int ongoing_facility_cash) {
		this.ongoing_facility_cash = ongoing_facility_cash;
	}
	public String getOngoing_facility_signid() {
		return ongoing_facility_signid;
	}
	public void setOngoing_facility_signid(String ongoing_facility_signid) {
		this.ongoing_facility_signid = ongoing_facility_signid;
	}
	public String getOngoing_facility_date() {
		return ongoing_facility_date;
	}
	public void setOngoing_facility_date(String ongoing_facility_date) {
		this.ongoing_facility_date = ongoing_facility_date;
	}
}
