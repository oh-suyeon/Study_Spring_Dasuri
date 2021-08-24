package kr.or.ddit.car.vo;

public class CarVO {
	
	private int carNum;
	private int cusNum;
	private String carMaker;
	private int modelYear;
	private int carMileage;
	public int getCarNum() {
		return carNum;
	}
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	public int getCusNum() {
		return cusNum;
	}
	public void setCusNum(int cusNum) {
		this.cusNum = cusNum;
	}
	public String getCarMaker() {
		return carMaker;
	}
	public void setCarMaker(String carMaker) {
		this.carMaker = carMaker;
	}
	public int getModelYear() {
		return modelYear;
	}
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	public int getCarMileage() {
		return carMileage;
	}
	public void setCarMileage(int carMileage) {
		this.carMileage = carMileage;
	}
	@Override
	public String toString() {
		return "CarVO [carNum=" + carNum + ", cusNum=" + cusNum + ", carMaker=" + carMaker + ", modelYear=" + modelYear
				+ ", carMileage=" + carMileage + "]";
	}
	
}
