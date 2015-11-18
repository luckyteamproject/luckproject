package com.cafe24.glaemfdjd.outsourcing.domain;

import com.cafe24.glaemfdjd.contract.domain.ContractDto;
import com.cafe24.glaemfdjd.schedule.domain.ScheduleDto;

public class OutsourcingDto {
	String outsourcing_code;
	ScheduleDto schedule;
	ContractDto contract;
	String outsourcing_signid;
	String outsourcing_date;
	
	public String getOutsourcing_code() {
		return outsourcing_code;
	}
	public void setOutsourcing_code(String outsourcing_code) {
		this.outsourcing_code = outsourcing_code;
	}
	public ScheduleDto getSchedule() {
		return schedule;
	}
	public void setSchedule(ScheduleDto schedule) {
		this.schedule = schedule;
	}
	public ContractDto getContract() {
		return contract;
	}
	public void setContract(ContractDto contract) {
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
