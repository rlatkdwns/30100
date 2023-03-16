package as;

public class PokemonTest {
	public static void main(String[] args) {
		Pokemon a = new Pokemon( "asa", 55, "asd");
		a.show();
	}
}
class Pokemon {
	String pokeName;
	int legs;
	String skill;
	public Pokemon() {
		super();
	}
	public Pokemon(String pokeName, int legs, String skill) {
		super();
		this.pokeName = pokeName;
		this.legs = legs;
		this.skill = skill;
	}
	void show() {
		System.out.printf("이름: %s, 다리 갯수 : %d, 기술: %s",pokeName, legs, skill);
	}
	
}