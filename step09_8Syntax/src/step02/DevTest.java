package step02;

import model.domain.Developer;

public class DevTest {
	public static void main(String[] args) {
		// 외부로부터 WEB 문자열 -> EnumType Web 개발자 객체 생성
		// ver1 : 문자열 -> enum type 문자열
//		if("WEB".equals(DevType.WEB.name())) {
//			Developer webDev = new Developer("it", 3, DevType.WEB);
//		}
		
		// ver2 : 문자열 -> enum type
//		System.out.println(DevType.WEB == DevType.WEB);
		if(DevType.WEB == DevType.valueOf("WEB")) {
			Developer webDev = new Developer("it", 3, DevType.WEB);
		}
	}

}
