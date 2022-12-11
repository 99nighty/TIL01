package Casting;

class Tv {
	int vol;
	int ch;
	boolean power;
	
	void chUp() {;}
	void chDown() {;}
	void volUp() {;}
	void volDown() {;}
	void powerOnOff() {;}
}

class SmartTv extends Tv{
	void netflix() {;}
}

public class CastingTest {
	public static void main(String[] args) {
		
		// **Up Casting**
		
//		1.
//		SmartTv smartTv = new SmartTv();
//		자료형		변수명		= 값;
//		Tv tv = (Tv)smartTv;

//		2.
//		Tv tv = (Tv)new SmartTv();
		
//		3.
		Tv tv = new SmartTv();
//		부모클래스 타입의 참조변수로 자식클래스 타입의 객체를 참조한다.(가르키게 한다.)
//		부모클래스 타입의 참조변수에 자식클래스 타입의 객체의 주소값을 저장한다.
		
//		new SamrtTv().ch = 10;
//		System.out.println(new SmartTv.ch());
		
		tv.ch = 3;
		tv.power = true;
		tv.vol = 10;
		tv.chDown();
//		tv.netflix();
		
		
		
		
		
//		**Down Casting**
		SmartTv smartTv2 = (SmartTv)tv;
		System.out.println(smartTv2.ch);

//		잘못된 down casting
		Tv parents = new Tv();
//		SmartTv child = (SmartTv)parents;	//오류발생
//		Down Casting은 반드시 Up Casting 된 객체로 해야 한다.
//		즉, Up Casting 된 객체를 다시 원래 자식타입으로 돌리는 것이 Down Casting이다.
		
		
	}
}
