package com.cafe24.glaemfdjd.schedule.domain;

import com.cafe24.glaemfdjd.companyInfo.domain.CompanyInfoDto;
import com.cafe24.glaemfdjd.contract.domain.ContractDto;
import com.cafe24.glaemfdjd.emp.domain.EmpDto;
import com.cafe24.glaemfdjd.wbsPCate.domain.WbsPCateDto;

public class ScheduleDto {
	String schedule_code;
	CompanyInfoDto company_info;
	ContractDto contract;
	EmpDto emp;
	WbsPCateDto wbs_pcate;
	String outsourcing_code;
	int schedule_updateno;
	String schedule_startdate;
	String schedule_enddate;
	String schedule_detail;
	int schedule_cash;
	String schedule_signid;
	String schedule_date;
	
	public String getSchedule_code() {
		return schedule_code;
	}
	public void setSchedule_code(String schedule_code) {
		this.schedule_code = schedule_code;
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
	public String getOutsourcing_code() {
		return outsourcing_code;
	}
	public void setOutsourcing_code(String outsourcing_code) {
		this.outsourcing_code = outsourcing_code;
	}
	public int getSchedule_updateno() {
		return schedule_updateno;
	}
	public void setSchedule_updateno(int schedule_updateno) {
		this.schedule_updateno = schedule_updateno;
	}
	public String getSchedule_startdate() {
		return schedule_startdate;
	}
	public void setSchedule_startdate(String schedule_startdate) {
		this.schedule_startdate = schedule_startdate;
	}
	public String getSchedule_enddate() {
		return schedule_enddate;
	}
	public void setSchedule_enddate(String schedule_enddate) {
		this.schedule_enddate = schedule_enddate;
	}
	public String getSchedule_detail() {
		return schedule_detail;
	}
	public void setSchedule_detail(String schedule_detail) {
		this.schedule_detail = schedule_detail;
	}
	public int getSchedule_cash() {
		return schedule_cash;
	}
	public void setSchedule_cash(int schedule_cash) {
		this.schedule_cash = schedule_cash;
	}
	public String getSchedule_signid() {
		return schedule_signid;
	}
	public void setSchedule_signid(String schedule_signid) {
		this.schedule_signid = schedule_signid;
	}
	public String getSchedule_date() {
		return schedule_date;
	}
	public void setSchedule_date(String schedule_date) {
		this.schedule_date = schedule_date;
	}
}
