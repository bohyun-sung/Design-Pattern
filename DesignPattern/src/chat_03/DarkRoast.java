package chat_03;

public class DarkRoast extends Beverage{

	public DarkRoast() {
		description = "��ũ �ν�Ʈ";
	}
	@Override
	public double cost() {
		return 1.99 + super.cost();
	}

}
