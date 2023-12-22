package step01.api;

class IT{
	public int num;
	
	public IT(int num) {
		this.num = num;
		System.out.println("IT" + num + "가 생성");
	}
	
	// 소멸
	public void finalize() {
		System.out.println("IT" + num + "가 제거");
	}
}



public class Ex01Lang {
	public static void main(String[] args) {
		// Object
		Object obj1 = new Object();
//		System.out.println(obj1); // java.lang.Object@15db9742
		
		
		// hashcode()
//		System.out.println(obj1.hashCode()); //366712642

		// equals()
		Object obj2 = new Object();
//		System.out.println(obj2); // java.lang.Object@6d06d69c
		
//		System.out.println(obj1.equals(obj2)); // false
//		System.out.println(obj1 == obj2); // false
		
		// System
		// getProperty() : 시스템 속성값 활용
//		System.out.println(System.getProperty("os.name")); //Windows 11
//		System.out.println(System.getProperty("java.runtime.name")); 
//		System.out.println(System.getProperty()); 
		
		
		// gc() : 가비지 컬렉터를 직접 호출
//		IT it;
		
//		it = new IT(1);
//		it = null;
//		it = new IT(2);
//		it = new IT(3);
		
//		System.gc();
		
		// String
		String str1 = "String";
		String str2 = "String";
		String str3 = new String("String");
		String str4 = new String("String");
	
		// 내용 : equals()
//		System.out.println(str1.equals(str2)); //true
//		System.out.println(str3.equals(str4)); //true           --> 내용을 비교
//		System.out.println(str1.equals(str3)); //true
//		
//		
//		System.out.println();
//		
//		// 주소값 : ==
//		System.out.println(str1 == str2); //true
//		System.out.println(str3 == str4); //false               --> 주소값을 비교
//		System.out.println(str1 == str3); //false
		
		// charAt()
		String str5 = "Java API";
//		System.out.println(str5.charAt(5));
//		System.out.println(str5.charAt(8)); // 예외: StringIndexOut
//		System.out.println(str5.charAt(str5.length()-1));
		
		//length
//		System.out.println(str5.length());
		
		// indexOf()
//		System.out.println(str5.indexOf("a"));
		
		// toXXXCase()
//		System.out.println(str5.toLowerCase());
		
		// subString()
//		System.out.println(str5.substring(1, 5));
		
		// replace()
//		System.out.println(str5.replace("Java", "자바"));
		
		// trim()
//		String trimTest = "	Java API	";
//		System.out.println(trimTest.trim());
//		
//		// split()
//		String splitTest = "Java-API-Split-Test";
//		System.out.println(splitTest.split(""));
//		
//		String[] splitArray = splitTest.split("-");
//		for(String str : splitArray) {
//			System.out.println(str);
//		}
		
		
		
		
		// String VS StringBuffer
//		String string = "abc";
//		// "def" 추가 출력
//		System.out.println("before : "+string.hashCode());
//		string += "def";
//		System.out.println("after : "+ string.hashCode());
//		System.out.println(string);
		
//		System.out.println();
		
//		StringBuffer stringBuffer = new StringBuffer("abc");s
//		System.out.println(stringBuffer);
		
//		StringBuilder
		
		//Wrapper
		//Boxing 박싱
		Integer i1 = new Integer("10");
		System.out.println(i1);
		
		// Unboxing 언박싱
		int i2 = i1.intValue();
		System.out.println(i2);
		
		//Auto
		int i3 = i1;
		Integer i4 = 10;
		
		// parseXXX() : 문자열 기본타입 -> 본래 기본타입
		System.out.println(Integer.parseInt("10"));
		System.out.println(Boolean.parseBoolean("true"));
		System.out.println(Double.parseDouble("10.3"));
		
		// Math
		// random() : 0.0 <= random < 1.0
		System.out.println(Math.random());
		System.out.println((int)0.95);
		
		// 1 ~ 10 난수 생성?
		System.out.println(Math.random()*10);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
