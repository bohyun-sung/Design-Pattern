package chat_03;

public class DarkRoast extends Beverage{

	public DarkRoast() {
		description = "다크 로스트";
	}
	@Override
	public double cost() {
		return 1.99 + super.cost();
	}

}
