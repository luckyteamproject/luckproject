package com.cafe24.glaemfdjd.ongoing.domain;

import com.cafe24.glaemfdjd.companyInfo.domain.CompanyInfoDto;
import com.cafe24.glaemfdjd.contract.domain.ContractDto;
import com.cafe24.glaemfdjd.emp.domain.EmpDto;
import com.cafe24.glaemfdjd.schedule.domain.ScheduleDto;
import com.cafe24.glaemfdjd.wbsPCate.domain.WbsPCateDto;

public class OngoingDto {
	String ongoing_code;
	ScheduleDto schedule;
	CompanyInfoDto company_info;
	ContractDto contract;
	EmpDto emp;
	WbsPCateDto wbs_pcate;
	String ongoing_gisungclass;
	int ongoing_gisungcash;
	String ongoing_sts;
	String ongoing_startdate;
	String ongoing_enddate;
	String ongoing_detail;
	String ongoing_signid;
	String ongoing_date;
	
	public String getOngoing_code() {
		return ongoing_code;
	}
	public void setOngoing_code(String ongoing_code) {
		this.ongoing_code = ongoing_code;
	}
	public ScheduleDto getSchedulel() {
		return schedule;
	}
	public void setSchedulel(ScheduleDto schedulel) {
		this.schedule = schedulel;
	}
	public CompanyInfoDto getCompany_info() {
		return company_info;
	}
	public void setCompany_info(CompanyInfoDto company_info) {
		this.company_info = company_info;
	}
	public ContractDto getContract() {
		return contract;
	}
	public void setContract(ContractDto contract) {
		this.contract = contract;
	}
	public EmpDto getEmp() {
		return emp;
	}
	public void setEmp(EmpDto emp) {
		this.emp = emp;
	}
	public WbsPCateDto getWbs_pcate() {
		return wbs_pcate;
	}
	public void setWbs_pcate(WbsPCateDto wbs_pcate) {
		this.wbs_pcate = wbs_pcate;
	}
	public String getOngoing_gisungclass() {
		return ongoing_gisungclass;
	}
	public void setOngoing_gisungclass(String ongoing_gisungclass) {
		this.ongoing_gisungclass = ongoing_gisungclass;
	}
	public int getOngoing_gisungcash() {
		return ongoing_gisungcash;
	}
	public void setOngoing_gisungcash(int ongoing_gisungcash) {
		this.ongoing_gisungcash = ongoing_gisungcash;
	}
	public String getOngoing_sts() {
		return ongoing_sts;
	}
	public void setOngoing_sts(String ongoing_sts) {
		this.ongoing_sts = ongoing_sts;
	}
	public String getOngoing_startdate() {
		return ongoing_startdate;
	}
	public void setOngoing_startdate(String ongoing_startdate) {
		this.ongoing_startdate = ongoing_startdate;
	}
	public String getOngoing_enddate() {
		return ongoing_enddate;
	}
	public void setOngoing_enddate(String ongoing_enddate) {
		this.ongoing_enddate = ongoing_enddate;
	}
	public String getOngoing_detail() {
		return ongoing_detail;
	}
	public void setOngoing_detail(String ongoing_detail) {
		this.ongoing_detail = ongoing_detail;
	}
	public String getOngoing_signid() {
		return ongoing_signid;
	}
	public void setOngoing_signid(String ongoing_signid) {
		this.ongoing_signid = ongoing_signid;
	}
	public String getOngoing_date() {
		return ongoing_date;
	}
	public void setOngoing_date(String ongoing_date) {
		this.ongoing_date = ongoing_date;
	}
}
