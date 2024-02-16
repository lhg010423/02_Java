package edu.kh.poly.ex1.model.vo;

public class Tesla extends Car{ // 전기차
	
	private int batteryCapacity; // 배터리 용량
	
	public Tesla() {}

	public Tesla(String engin, String fuel, int wheel, int batteryCapacity) {
		super(engin, fuel, wheel);
		this.batteryCapacity = batteryCapacity;
	}

	public int getBatteryCapacity() {
		return batteryCapacity;
	}

	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}

	// Car.toString() 오버라이딩
	@Override
	public String toString() {
		return super.toString() + " / " + batteryCapacity;

	}
	
	
	

}
