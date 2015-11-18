package com.cafe24.glaemfdjd.wbsPCate.domain;

import com.cafe24.glaemfdjd.wbsCate.domain.WbsCateDto;

public class WbsPCateDto {
	String wbs_pcate_code;
	WbsCateDto wbs_cate;
	String wbs_pcate_name;
	
	public String getWbs_pcate_code() {
		return wbs_pcate_code;
	}
	public void setWbs_pcate_code(String wbs_pcate_code) {
		this.wbs_pcate_code = wbs_pcate_code;
	}
	public WbsCateDto getWbs_cate() {
		return wbs_cate;
	}
	public void setWbs_cate(WbsCateDto wbs_cate) {
		this.wbs_cate = wbs_cate;
	}
	public String getWbs_pcate_name() {
		return wbs_pcate_name;
	}
	public void setWbs_pcate_name(String wbs_pcate_name) {
		this.wbs_pcate_name = wbs_pcate_name;
	}
	
}
