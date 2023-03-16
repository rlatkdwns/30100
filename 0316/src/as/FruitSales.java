package as;

public class FruitSales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitSeller se = new FruitSeller();
		FruitBuyer by = new FruitBuyer();
		
		se.saleApple(2500);
		by.buyApple(se, 2000);
		se.showSaleResult();
		by.showBuyResult();

	}

}
class FruitSeller{
	int apple = 20;
	int money = 0;
	int price = 1000;
	public FruitSeller() {
		super();
	}
	
	int saleApple(int mon) {
		int num = 0;
		num += mon/price;
		money += mon/price*price;
		apple -= num;
		return num;
		
	}
	void showSaleResult() {
		System.out.println("과일 판매자");
		System.out.printf("남은 과일수 : %d, 수익: %d\n",apple, money);
	}
	
}
class FruitBuyer{
	int apple = 0;
	int money = 5000;
	public FruitBuyer() {
		super();
	}
	void buyApple(FruitSeller se, int mo) {
		apple += se.saleApple(mo);
		money -= mo;
	}
	void showBuyResult() {
		System.out.println("과일 구매자");
		System.out.printf("현재 잔액: %d, 사과 개수: %d\n", money, apple);
	}
}