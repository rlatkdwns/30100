package test;

public class Airplane {
	String airplanName;
	int distance;
	int speed;
	static int totalJetFuel = 1500;
	int jetFuel;
	
	public Airplane(String airplanName, int distance, int speed) {
		this.airplanName = airplanName;
		this.distance = distance;
		this.speed = speed;
	}
	
	void refuel() {
		  jetFuel = distance / 20;
	        if (jetFuel <= totalJetFuel) {
	            totalJetFuel -= jetFuel;
	            System.out.printf("항공유 %dL를 주유합니다.\n", jetFuel);
	            
	        } else {
	            System.out.println("항공유가 부족하여 주유할 수 없습니다.");
	        }
	}
	
	void speedUp() {
		speed+=1000;
		if(speed > 5500) {
			System.out.println("비행속도는 5500km를 넘을 수 없습니다.");
			speed=5500;
		}
	}
	
	void speedDown() {
		speed-=1000;
		if(speed <= 0) {
			System.out.println("비행기가 멈췄습니다");
			speed +=10;
		}
	}
	
	double fligthTime() {
		return (double)distance/(double)speed;
	}
}
