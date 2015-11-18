package com.cafe24.glaemfdjd.planInteEmp.domain;

import com.cafe24.glaemfdjd.companyInfo.domain.CompanyInfoDto;
import com.cafe24.glaemfdjd.contract.domain.ContractDto;
import com.cafe24.glaemfdjd.emp.domain.EmpDto;
import com.cafe24.glaemfdjd.schedule.domain.ScheduleDto;
import com.cafe24.glaemfdjd.wbsPCate.domain.WbsPCateDto;

public class PlanInteEmpDto {
	String plan_inteemp_code;
	CompanyInfoDto company_info;
	String plan_inteemp_acctcode;
	ContractDto contract;
	ScheduleDto schedule;
	WbsPCateDto wbs_pcate;
	int plan_inteemp_updateno;
	EmpDto emp;
	int plan_inteemp_cash;
	String plan_inteemp_signid;
	String plan_inteemp_date;
	
	public String getPlan_inteemp_code() {
		return plan_inteemp_code;
	}
	public void setPlan_inteemp_code(String plan_inteemp_code) {
		this.plan_inteemp_code = plan_inteemp_code;
	}
	public CompanyInfoDto getCompany_info() {
		return company_info;
	}
	public void setCompany_info(CompanyInfoDto company_info) {
		this.company_info = company_info;
	}
	public String getPlan_inteemp_acctcode() {
		return plan_inteemp_acctcode;
	}
	public void setPlan_inteemp_acctcode(String plan_inteemp_acctcode) {
		this.plan_inteemp_acctcode = plan_inteemp_acctcode;
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
	public int getPlan_inteemp_updateno() {
		return plan_inteemp_updateno;
	}
	public void setPlan_inteemp_updateno(int plan_inteemp_updateno) {
		this.plan_inteemp_updateno = plan_inteemp_updateno;
	}
	public EmpDto getEmp() {
		return emp;
	}
	public void setEmp(EmpDto emp) {
		this.emp = emp;
	}
	public int getPlan_inteemp_cash() {
		return plan_inteemp_cash;
	}
	public void setPlan_inteemp_cash(int plan_inteemp_cash) {
		this.plan_inteemp_cash = plan_inteemp_cash;
	}
	public String getPlan_inteemp_signid() {
		return plan_inteemp_signid;
	}
	public void setPlan_inteemp_signid(String plan_inteemp_signid) {
		this.plan_inteemp_signid = plan_inteemp_signid;
	}
	public String getPlan_inteemp_date() {
		return plan_inteemp_date;
	}
	public void setPlan_inteemp_date(String plan_inteemp_date) {
		this.plan_inteemp_date = plan_inteemp_date;
	}
}
