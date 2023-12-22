package step01;

import java.util.List;
import java.util.Arrays;

public enum PayType {
	CARD,
	CASH("현금", Arrays.asList("계좌이체", "무통장입금")),
	ETC;
	
	private String typeCategory;
	private List<String> typeList;
	
	PayType(){}
	PayType(String typeCategory, List<String> typeList){
		this.typeCategory = typeCategory;
		this.typeList = typeList;
	}
	
	public String getTypeCategory() {
		return typeCategory;
	}
	
	public List<String> getTypeList(){
		return typeList;
	}
	
	
	
	
	
	
	
	
	
	
	
}
