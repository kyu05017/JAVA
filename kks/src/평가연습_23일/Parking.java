package 평가연습_23일;

public class Parking {
	// 필드
	private String car_number;		//차량넘버
	private String car_ParkingDate;	//입차날짜
	private String car_ParkingTime;	//입차시간
	private String car_OutTime;		//출차시간
	private boolean car_state;		//입차출차여부
	private int car_PayMoney;		//금액
	
	// 생성자
		
		// 빈생성자
	public Parking() {
	}
		// 풀생성자
	public Parking(String car_number, String car_ParkingDate, String car_ParkingTime, String car_OutTime,
			boolean car_state, int car_PayMoney) {
		this.car_number = car_number;
		this.car_ParkingDate = car_ParkingDate;
		this.car_ParkingTime = car_ParkingTime;
		this.car_OutTime = car_OutTime;
		this.car_state = car_state;
		this.car_PayMoney = car_PayMoney;
	}
	
	// 메소드
	public String getCar_ParkingDate() {
		return car_ParkingDate;
	}

	public void setCar_ParkingDate(String car_ParkingDate) {
		this.car_ParkingDate = car_ParkingDate;
	}

	public boolean getisCar_state() {
		return car_state;
	}

	public void setCar_state(boolean car_state) {
		this.car_state = car_state;
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
