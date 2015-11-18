package com.cafe24.glaemfdjd.ongoingInteEmp.domain;

import com.cafe24.glaemfdjd.companyInfo.domain.CompanyInfoDto;
import com.cafe24.glaemfdjd.contract.domain.ContractDto;
import com.cafe24.glaemfdjd.emp.domain.EmpDto;
import com.cafe24.glaemfdjd.ongoing.domain.OngoingDto;
import com.cafe24.glaemfdjd.schedule.domain.ScheduleDto;
import com.cafe24.glaemfdjd.wbsPCate.domain.WbsPCateDto;

public class OngoingInteEmpDto {
	String ongoing_inteemp_code;
	CompanyInfoDto company_info;
	String ongoing_inteemp_acctcode;
	ContractDto contract;
	OngoingDto ongoing;
	ScheduleDto schedule;
	WbsPCateDto wbs_pcate;
	EmpDto emp;
	int ongoing_inteemp_cash;
	String ongoing_inteemp_signid;
	String ongoing_inteemp_date;
	
	public String getOngoing_inteemp_code() {
		return ongoing_inteemp_code;
	}
	public void setOngoing_inteemp_code(String ongoing_inteemp_code) {
		this.ongoing_inteemp_code = ongoing_inteemp_code;
	}
	public CompanyInfoDto getCompany_info() {
		return company_info;
	}
	public void setCompany_info(CompanyInfoDto company_info) {
		this.company_info = company_info;
	}
	public String getOngoing_inteemp_acctcode() {
		return ongoing_inteemp_acctcode;
	}
	public void setOngoing_inteemp_acctcode(String ongoing_inteemp_acctcode) {
		this.ongoing_inteemp_acctcode = ongoing_inteemp_acctcode;
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
	public void setSchedulel(ScheduleDto schedule) {
		this.schedule = schedule;
	}
	public WbsPCateDto getWbs_pcate() {
		return wbs_pcate;
	}
	public void setWbs_pcate(WbsPCateDto wbs_pcate) {
		this.wbs_pcate = wbs_pcate;
	}
	public EmpDto getEmp() {
		return emp;
	}
	public void setEmp(EmpDto emp) {
		this.emp = emp;
	}
	public int getOngoing_inteemp_cash() {
		return ongoing_inteemp_cash;
	}
	public void setOngoing_inteemp_cash(int ongoing_inteemp_cash) {
		this.ongoing_inteemp_cash = ongoing_inteemp_cash;
	}
	public String getOngoing_inteemp_signid() {
		return ongoing_inteemp_signid;
	}
	public void setOngoing_inteemp_signid(String ongoing_inteemp_signid) {
		this.ongoing_inteemp_signid = ongoing_inteemp_signid;
	}
	public String getOngoing_inteemp_date() {
		return ongoing_inteemp_date;
	}
	public void setOngoing_inteemp_date(String ongoing_inteemp_date) {
		this.ongoing_inteemp_date = ongoing_inteemp_date;
	}
}
