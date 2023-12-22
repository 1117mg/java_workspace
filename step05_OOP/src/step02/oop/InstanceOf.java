/* instanceOf
 * - 문법 : 객체 instanceOf 타입
 * - 결과 : boolean (t / f)
 */
package step02.oop;

class A {}
class B extends A {} 
class C extends A {}

public class InstanceOf {
	public static void main(String[] args) {
		A b = new B();
		A c = new C();
		
		System.out.println(b instanceof A); // true
		System.out.println(b instanceof B); // true
		System.out.println(b instanceof C); // false
		
		System.out.println();
		
		System.out.println(c instanceof A); // true
		System.out.println(c instanceof B); // false
		System.out.println(c instanceof C); // true
		
		System.out.println();
		
		B b2 = new B();
		System.out.println(b2 instanceof A); // true
		System.out.println(b2 instanceof B); // true
//		System.out.println(b2 instanceof C); // 에러
		
	}
}
