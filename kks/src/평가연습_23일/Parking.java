package 평가연습_23일;

public class Parking {
	
	private String car_number;
	private String car_ParkingTime;
	private String car_OutTime;
	private int car_PayMoney;
	
	public Parking() {
	}
	
	public Parking(String car_number, String car_ParkingTime, String car_OutTime, int car_PayMoney) {
		this.car_number = car_number;
		this.car_ParkingTime = car_ParkingTime;
		this.car_OutTime = car_OutTime;
		this.car_PayMoney = car_PayMoney;
	}

	public String getCar_number() {
		return car_number;
	}

	public void setCar_number(String car_number) {
		this.car_number = car_number;
	}

	public String getCar_ParkingTime() {
		return car_ParkingTime;
	}

	public void setCar_ParkingTime(String car_ParkingTime) {
		this.car_ParkingTime = car_ParkingTime;
	}

	public String getCar_OutTime() {
		return car_OutTime;
	}

	public void setCar_OutTime(String car_OutTime) {
		this.car_OutTime = car_OutTime;
	}

	public int getCar_PayMoney() {
		return car_PayMoney;
	}

	public void setCar_PayMoney(int car_PayMoney) {
		this.car_PayMoney = car_PayMoney;
	}
	
	
	
}
