package chat_03;

public class Soy extends CondimentDecorator{
	Beverage beverage;
	
	
	public Soy(Beverage beverage) {
		this.beverage = beverage;
		
	}
	
	@Override
	public double cost() {
		double cost = beverage.cost();
		if (getSize() == Beverage.TALL) {
			cost += 0.11111;
		}else if (getSize() == Beverage.GRAND) {
			cost += 0.22222;
		}else if (getSize() == Beverage.VENTI) {
			cost += 0.33333;
		}
		return cost;
	}
	@Override
	public double getSize() {
		return beverage.getSize();
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", µŒ¿Ø";
	}

}
