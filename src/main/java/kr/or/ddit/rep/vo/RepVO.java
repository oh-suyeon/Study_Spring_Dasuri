package kr.or.ddit.rep.vo;

import java.util.Date;

public class RepVO {
	
	private int repNum;
	private int carNum;
	private int empNum;
	private int repCost;
	private Date repEndTime;
	
	public int getRepNum() {
		return repNum;
	}
	public void setRepNum(int repNum) {
		this.repNum = repNum;
	}
	public int getCarNum() {
		return carNum;
	}
	public void setCarNum(int carNum) {
		this.carNum = carNum;
	}
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	public int getRepCost() {
		return repCost;
	}
	public void setRepCost(int repCost) {
		this.repCost = repCost;
	}
	public Date getRepEndTime() {
		return repEndTime;
	}
	public void setRepEndTime(Date repEndTime) {
		this.repEndTime = repEndTime;
	}
	@Override
	public String toString() {
		return "RepVO [repNum=" + repNum + ", carNum=" + carNum + ", empNum=" + empNum + ", repCost=" + repCost
				+ ", repEndTime=" + repEndTime + "]";
	}
	
}
