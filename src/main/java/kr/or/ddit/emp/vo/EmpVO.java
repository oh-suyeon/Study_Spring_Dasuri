package kr.or.ddit.emp.vo;

import org.springframework.web.multipart.MultipartFile;

public class EmpVO {
	
	private int salary;
	private String phoneNum;
	private String addr2;
	private String addr1;
	private int zipcode;
	private String empNm;
	private int empNum;
	private MultipartFile file;
	private String filePath;
	private int rnum;
	
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	public String getEmpNm() {
		return empNm;
	}
	public void setEmpNm(String empNm) {
		this.empNm = empNm;
	}
	public int getEmpNum() {
		return empNum;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public int getRnum() {
		return rnum;
	}
	public void setRnum(int rnum) {
		this.rnum = rnum;
	}
	@Override
	public String toString() {
		return "EmpVO [salary=" + salary + ", phoneNum=" + phoneNum + ", addr2=" + addr2 + ", addr1=" + addr1
				+ ", zipcode=" + zipcode + ", empNm=" + empNm + ", empNum=" + empNum + ", file=" + file + ", filePath="
				+ filePath + ", rnum=" + rnum + "]";
	}
	
}
