package test;

public class Car {
	String oilType;
	int speed;
	
	public Car(String oilType, int speed) {
		super();
		this.oilType = oilType;
		this.speed = speed;
	}
	
	void refuel() {
        if (oilType.equals("디젤")) {
            System.out.println("디젤을 주유합니다");
        } else if (oilType.equals("전기")) {
            System.out.println("전기를 충전합니다");
        } else if (oilType.equals("태양열")) {
            System.out.println("태양열을 충전합니다");
        } else if (oilType.equals("가스")) {
            System.out.println("가스를 주유합니다");
        } else {
            System.out.println("휘발유를 주유합니다");
        }
    }
	
	void speedUp() {
		speed+=10;
		if(speed > 110) {
			System.out.println("속도위반 범칙금 10만원 부과합니다");
			speed = 10;
		}
		
	}
	
	void speedDown() {
		speed-=10;
		if(speed <= 0) {
			System.out.println("차가 멈췄습니다");
			speed = 10;
		}
		
	}
}
