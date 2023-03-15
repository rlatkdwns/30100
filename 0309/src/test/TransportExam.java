package test;

public class TransportExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car("디젤", 5);
		Car c2 = new Car("가스", 110);
		
		c1.refuel();
		c2.refuel();
		c1.speedDown();
		c2.speedUp();
		
		Airplane a1 = new Airplane("보잉 747", 10000, 1000);
		Airplane a2 = new Airplane("에어버스 380", 20000, 5000);
		Airplane a3 = new Airplane("보잉 707", 10000, 5000);
		
		a1.refuel();
		a2.refuel();
		a3.refuel();
		System.out.println(a1.airplanName + "의 비행시간은 "+a1.fligthTime());
		System.out.println(a2.airplanName + "의 비행시간은 "+  a2.fligthTime());
		System.out.print(a1.airplanName + " "); a1.speedDown();
		
		a2.speedUp();
		
	}

}
