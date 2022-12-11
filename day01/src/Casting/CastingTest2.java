package Casting;

class Animal{
	int age;
	String name;
	
	
	
	public Animal(String name) {
		super();
		this.name = name;
	}



	void crying() {
		System.out.println("울어");
	}
}

class Dog extends Animal{
	
	public Dog(String name) {
		super(name);
	}
	
	void crying() {
		System.out.println("멍멍");
	}
	
	void walk() {
		System.out.println("산책가기");
	}
}

class Cat extends Animal{

	public Cat(String name) {
		super(name);
	}
	
	//알트 쉬프트 s 다음 v
	@Override
	void crying() {
		// TODO Auto-generated method stub
		System.out.println("야옹!!");
	}
}

public class CastingTest2 {
	public static void main(String[] args) {
//		Animal animal = new Dog();
		
//		1. 같은 메소드가 부모에도 있고 자식에도 있는 경우(오버라이딩)
//		animal.crying();
//		업캐스팅을 하여도 오버라이딩된 메소드가 실행된다.
		
//		2. 메소드가 부모에는 없고 자식에서 추가된 경우
//		(부모에 존재하지 않는 멤버에 접근하려는 경우)
//		animal.walk();
//		자식 클래스에서 추가한 멤버는 부모타입의 참조변수로는 접근할 수 없다.
		
//		이 경우에는 다운 캐스팅을 해야 한다.
//		((Dog)animal).walk();
		
		Dog dog = new Dog("바둑이");
		Cat cat = new Cat("나비");
		
//		printText(dog);
//		printText(cat);
//		tryWalk(dog);
		tryWalk(cat);
	}
	
	
//	1. 메소드의 매개변수로 여러 타입의 값을 전달받는 경우	
//	일반적으로는 각각의 타입을 처리하는 메소드를 별도로 만들어야한다.
	
//	static void printText(Dog dog) {
//		System.out.println(dog.name + "이가 운다!");
//		dog.crying();
//	}
//	
//	static void printText(Cat cat) {
//		System.out.println(cat.name + "이가 운다!");
//		cat.crying();
//	}
	
//	2.	같은 부모클래스가 존재한다면 매개변수를 부모클래스 타입으로 받는다.(업캐스팅)
//	하나의 메소드에서 매개변수를 부모타입으로 만들면 여러 자식타입을 받아서 사용이 가능하다.
	static void printText(Animal animal) {
		System.out.println(animal.name + "이가 운다!");
		animal.crying();
	}
	
//	3. 만약 부모클래스에 존재하지 않는 멤버에 접근하기 위해서는?
//	Down Casting을 해줘야 한다.
	static void tryWalk(Animal animal) {
		//매개변수로 받아온 객체의 주소가 Cat타입인지 Dog타입인지 확인을 해야한다.
		if(animal instanceof Dog) {
//			Dog 타입이 맞다면 Dog로 Down Casting한다.
			((Dog)animal).walk();
		}else {
			System.out.println("산책하기 싫어!");
		}
	}
	
}
