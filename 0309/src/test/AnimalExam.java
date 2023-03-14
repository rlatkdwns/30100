package test;

public class AnimalExam {
	public static void main(String[] args) {
		Cat c1 = new Cat("고양이");
		c1.eat();
             c1.eat();
	}
}
class Animal{
	String name;
	int food = 0;
       /* 1) 기본 생성자 생성 
	
       /* 2) eat 함수 생성 : 반환타입 x, 매개변수 x
           - “eat 함수를 호출할 때마다 food 값이 10씩 증가합니다." 출력 */
	public Animal() {}
	public void eat() {
		food+=10;
	}
	
}


class Cat extends Animal{
	
	public Cat(String name) {
		this.name = name;
		System.out.println("동물의 종류는" + name + " 이고, 나이는"+ age + "살 입니다");
	}
	int age = 3;
	
	
	public void eat() {
		food+=10;
		System.out.println("오늘 먹은 음식의 양은 " + food +"g 입니다");
		
	}
}