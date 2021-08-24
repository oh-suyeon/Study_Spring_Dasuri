package kr.or.ddit.cus.vo;

public class CusVO {
	
	private int cusNum;
	private int cusNm;
	private int zipcode;
	private String addr1;
	private String addr2;
	private String phoneNum;
	public int getCusNum() {
		return cusNum;
	}
	public void setCusNum(int cusNum) {
		this.cusNum = cusNum;
	}
	public int getCusNm() {
		return cusNm;
	}
	public void setCusNm(int cusNm) {
		this.cusNm = cusNm;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	@Override
	public String toString() {
		return "CusVO [cusNum=" + cusNum + ", cusNm=" + cusNm + ", zipcode=" + zipcode + ", addr1=" + addr1 + ", addr2="
				+ addr2 + ", phoneNum=" + phoneNum + "]";
	}
	
	
	
}
