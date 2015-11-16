package com.cafe24.glaemfdjd.model;

public class Outsourcing {
	String outsourcing_code;
	Schedule schedule;
	Contract contract;
	String outsourcing_signid;
	String outsourcing_date;
	
	public String getOutsourcing_code() {
		return outsourcing_code;
	}
	public void setOutsourcing_code(String outsourcing_code) {
		this.outsourcing_code = outsourcing_code;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	public Contract getContract() {
		return contract;
	}
	public void setContract(Contract contract) {
		this.contract = contract;
	}
	public String getOutsourcing_signid() {
		return outsourcing_signid;
	}
	public void setOutsourcing_signid(String outsourcing_signid) {
		this.outsourcing_signid = outsourcing_signid;
	}
	public String getOutsourcing_date() {
		return outsourcing_date;
	}
	public void setOutsourcing_date(String outsourcing_date) {
		this.outsourcing_date = outsourcing_date;
	}
}
