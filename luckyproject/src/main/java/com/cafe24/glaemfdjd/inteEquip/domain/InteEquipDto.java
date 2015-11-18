package com.cafe24.glaemfdjd.inteEquip.domain;

import com.cafe24.glaemfdjd.client.domain.ClientDto;
import com.cafe24.glaemfdjd.companyInfo.domain.CompanyInfoDto;

public class InteEquipDto {
	String inteequip_code;
	CompanyInfoDto company_info;
	ClientDto client;
	String inteequip_status;
	String inteequip_inout;
	String inteequip_name;
	String inteequip_rentdate;
	String inteequip_returndate;
	int inteequip_price;
	int inteequip_count;
	String inteequip_signid;
	String inteequip_date;
	
	public String getInteequip_code() {
		return inteequip_code;
	}
	public void setInteequip_code(String inteequip_code) {
		this.inteequip_code = inteequip_code;
	}
	public CompanyInfoDto getCompany_info() {
		return company_info;
	}
	public void setCompany_info(CompanyInfoDto company_info) {
		this.company_info = company_info;
	}
	public ClientDto getClient() {
		return client;
	}
	public void setClient(ClientDto client) {
		this.client = client;
	}
	public String getInteequip_status() {
		return inteequip_status;
	}
	public void setInteequip_status(String inteequip_status) {
		this.inteequip_status = inteequip_status;
	}
	public String getInteequip_inout() {
		return inteequip_inout;
	}
	public void setInteequip_inout(String inteequip_inout) {
		this.inteequip_inout = inteequip_inout;
	}
	public String getInteequip_name() {
		return inteequip_name;
	}
	public void setInteequip_name(String inteequip_name) {
		this.inteequip_name = inteequip_name;
	}
	public String getInteequip_rentdate() {
		return inteequip_rentdate;
	}
	public void setInteequip_rentdate(String inteequip_rentdate) {
		this.inteequip_rentdate = inteequip_rentdate;
	}
	public String getInteequip_returndate() {
		return inteequip_returndate;
	}
	public void setInteequip_returndate(String inteequip_returndate) {
		this.inteequip_returndate = inteequip_returndate;
	}
	public int getInteequip_price() {
		return inteequip_price;
	}
	public void setInteequip_price(int inteequip_price) {
		this.inteequip_price = inteequip_price;
	}
	public int getInteequip_count() {
		return inteequip_count;
	}
	public void setInteequip_count(int inteequip_count) {
		this.inteequip_count = inteequip_count;
	}
	public String getInteequip_signid() {
		return inteequip_signid;
	}
	public void setInteequip_signid(String inteequip_signid) {
		this.inteequip_signid = inteequip_signid;
	}
	public String getInteequip_date() {
		return inteequip_date;
	}
	public void setInteequip_date(String inteequip_date) {
		this.inteequip_date = inteequip_date;
	}
	
}
