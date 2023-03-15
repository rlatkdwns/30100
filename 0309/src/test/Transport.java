package test;

abstract class Transport{
	abstract void refuel();              //운송수단의 주유를 담당하는 메소드
	abstract void speedUp();           //운송수단의 속도 증가를 담당하는 메소드
	abstract void speedDown();        //운송수단의 속도 감소를 담당하는 메소드
}
