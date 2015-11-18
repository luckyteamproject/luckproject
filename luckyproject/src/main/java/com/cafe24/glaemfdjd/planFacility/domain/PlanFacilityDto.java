package com.cafe24.glaemfdjd.planFacility.domain;

import com.cafe24.glaemfdjd.companyInfo.domain.CompanyInfoDto;
import com.cafe24.glaemfdjd.contract.domain.ContractDto;
import com.cafe24.glaemfdjd.inteEquip.domain.InteEquipDto;
import com.cafe24.glaemfdjd.schedule.domain.ScheduleDto;
import com.cafe24.glaemfdjd.wbsPCate.domain.WbsPCateDto;

public class PlanFacilityDto {
	String plan_facility_code;
	CompanyInfoDto company_info;
	String plan_facility_acctcode;
	ContractDto contract;
	ScheduleDto schedule;
	WbsPCateDto wbs_pcate;
	InteEquipDto inteequip;
	int plan_facility_updateno;
	String plan_facility_startdate;
	String plan_facility_enddate;
	int plan_facility_cash;
	String plan_facility_signid;
	String plan_facility_date;
	
	public String getPlan_facility_code() {
		return plan_facility_code;
	}
	public void setPlan_facility_code(String plan_facility_code) {
		this.plan_facility_code = plan_facility_code;
	}
	public CompanyInfoDto getCompany_info() {
		return company_info;
	}
	public void setCompany_info(CompanyInfoDto company_info) {
		this.company_info = company_info;
	}
	public String getPlan_facility_acctcode() {
		return plan_facility_acctcode;
	}
	public void setPlan_facility_acctcode(String plan_facility_acctcode) {
		this.plan_facility_acctcode = plan_facility_acctcode;
	}
	public ContractDto getContract() {
		return contract;
	}
	public void setContract(ContractDto contract) {
		this.contract = contract;
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
	public int getPlan_facility_updateno() {
		return plan_facility_updateno;
	}
	public void setPlan_facility_updateno(int plan_facility_updateno) {
		this.plan_facility_updateno = plan_facility_updateno;
	}
	public String getPlan_facility_startdate() {
		return plan_facility_startdate;
	}
	public void setPlan_facility_startdate(String plan_facility_startdate) {
		this.plan_facility_startdate = plan_facility_startdate;
	}
	public String getPlan_facility_enddate() {
		return plan_facility_enddate;
	}
	public void setPlan_facility_enddate(String plan_facility_enddate) {
		this.plan_facility_enddate = plan_facility_enddate;
	}
	public int getPlan_facility_cash() {
		return plan_facility_cash;
	}
	public void setPlan_facility_cash(int plan_facility_cash) {
		this.plan_facility_cash = plan_facility_cash;
	}
	public String getPlan_facility_signid() {
		return plan_facility_signid;
	}
	public void setPlan_facility_signid(String plan_facility_signid) {
		this.plan_facility_signid = plan_facility_signid;
	}
	public String getPlan_facility_date() {
		return plan_facility_date;
	}
	public void setPlan_facility_date(String plan_facility_date) {
		this.plan_facility_date = plan_facility_date;
	}
}
