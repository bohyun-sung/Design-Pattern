package chat_03;

public class Milk extends CondimentDecorator{
	Beverage beverage;
	
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	@Override
	public double cost() {
		return 0.10;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", ¿ìÀ¯";
	}

}
