
public class Car {
	static int maxGas = 10;
	private int gas;
	
	public Car() {
		gas = maxGas;
	}
	
	public int getGas() {
		return gas;
	}
	
	public void setGas(int gas) {
		this.gas = gas;
	}
	
	public void showGas() {
		System.out.printf("Gas remaining: %d/%d.%n", gas, maxGas);				
	}
	
	public void gameOver() {
		System.out.println("Out of gas!");
	}
}
