package Team2;


public class Car {
	
	private String carNum;
	private String carTimehour;
	private String carTimemin;
	private int parking;

	private int payMoney;
	
	
	public Car() {
		
	}



	public Car(String carNum, String carTimehour,String carTimemin , int parking) {
		this.carNum = carNum;
		this.carTimehour = carTimehour;
		this.carTimemin = carTimemin;
		this.parking = parking;
	}

	
	
	public String getCarTimehour() {
		return carTimehour;
	}



	public void setCarTimehour(String carTimehour) {
		this.carTimehour = carTimehour;
	}



	public String getCarTimemin() {
		return carTimemin;
	}



	public void setCarTimemin(String carTimemin) {
		this.carTimemin = carTimemin;
	}



	public int getPayMoney() {
		return payMoney;
	}



	public void setPayMoney(int payMoney) {
		this.payMoney = payMoney;
	}




	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public int getParking() {
		return parking;
	}

	public void setParking(int parking) {
		this.parking = parking;
	}

	
	
}
