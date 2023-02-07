
public class Driver extends Car {
	public Driver() {
		super();
	}
	
	public void drive() {
		if(super.getGas() > 0) {
			System.out.println("Driving...");
			super.setGas(super.getGas()-1);
			super.showGas();
		}
		else {
			super.gameOver();
		}
	}
	
	public void useBooster() {
		if(super.getGas() > 0) {
			if(super.getGas() >= 3) {
				System.out.println("Using boosters!");
				super.setGas(super.getGas()-3);
			}
			else {
				System.out.println("Car doesn't have enough gas to use boosters.");
			}
			super.showGas();
		}
		else {
			super.gameOver();
		}
	}
	
	public void refuel() {
		if(super.getGas() > 0) {
			if(super.getGas() <= 8) {
				System.out.println("Refueling the car...");
				super.setGas(super.getGas()+2);
			}
			else {
				System.out.println("Car has too much gas. Cannot refill.");
			}
			super.showGas();
		}
		else {
			super.gameOver();
		}
	}
}
