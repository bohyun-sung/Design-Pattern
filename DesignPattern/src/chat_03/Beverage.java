package chat_03;

public abstract class Beverage {
	public static final double VENTI = 1.20;
	public static final double GRAND = 1.15;
	public static final double TALL = 1.10;
	private double size;
	protected String description = "제목 없음";
	public double milkCost;
	public double soyCost;
	public double mochaCost;
	public double whipCost;
	
	public String getDescription() {
		return description;
	}
	
	public double cost() {
		double condimentCost = 0.0;
		if (hasMilk()) {
			condimentCost += milkCost;
		}if (hasSoy()) {
			condimentCost += soyCost;
		}if (hasMocha()) {
			condimentCost += mochaCost;
		}if (hasWhip()) {
			condimentCost += whipCost;
		}
		return condimentCost;
	}

	private boolean hasMocha() {
		return true;
	}

	private boolean hasWhip() {
		return true;
	}


	public boolean hasSoy() {
		
		return true;
	}

	private boolean hasMilk() {
		return true;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public double getMilkCost() {
		return milkCost;
	}

	public void setMilkCost(double milkCost) {
		this.milkCost = milkCost;
	}

	public double getSoyCost() {
		return soyCost;
	}

	public void setSoyCost(double soyCost) {
		this.soyCost = soyCost;
	}

	public double getMochaCost() {
		return mochaCost;
	}

	public void setMochaCost(double mochaCost) {
		this.mochaCost = mochaCost;
	}

	public double getWhipCost() {
		return whipCost;
	}

	public void setWhipCost(double whipCost) {
		this.whipCost = whipCost;
	}
	
}
