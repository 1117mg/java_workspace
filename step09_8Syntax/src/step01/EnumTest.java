package step01;

public class EnumTest {
	public static void main(String[] args) {
//		System.out.println(Color.RED.getColorCode());
		
		// 현금 - 무통장입금
		if("현금".equals(PayType.CASH.getTypeCategory())) {
			// 결제 처리 로직
			for(String cashType : PayType.CASH.getTypeList()) {
				if("계좌이체".equals(cashType)) {
					System.out.println("계좌이체 로직");
				} else if("무통장입금".equals(cashType)){
					System.out.println("무통장입금 로직");
				}
			}
		} else if("카드".equals(PayType.CARD)) {
			
		}
		
	}

}
