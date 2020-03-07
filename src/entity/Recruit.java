package entity;

import java.io.Serializable;
import java.util.Date;

public class Recruit implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5060194595908448733L;
	private int id;//编号
	private String recruitname;//招聘岗位
	private int recruitnum;//招聘人数
	private String address;//工作地点
	private String salary;//薪资
	private Date releasetime;//发布时间
	private int validityperiod;//有效时间
	private String requirements;//招聘要求
	public int getId() {
		return id;
	}
	public String getRecruitname() {
		return recruitname;
	}
	public int getRecruitnum() {
		return recruitnum;
	}
	public String getAddress() {
		return address;
	}
	public String getSalary() {
		return salary;
	}
	public Date getReleasetime() {
		return releasetime;
	}
	public int getValidityperiod() {
		return validityperiod;
	}
	public String getRequirements() {
		return requirements;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setRecruitname(String recruitname) {
		this.recruitname = recruitname;
	}
	public void setRecruitnum(int recruitnum) {
		this.recruitnum = recruitnum;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	public void setReleasetime(Date releasetime) {
		this.releasetime = releasetime;
	}
	public void setValidityperiod(int validityperiod) {
		this.validityperiod = validityperiod;
	}
	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}
	public Recruit(int id, String recruitname, int recruitnum, String address, String salary, Date releasetime,
			int validityperiod, String requirements) {
		super();
		this.id = id;
		this.recruitname = recruitname;
		this.recruitnum = recruitnum;
		this.address = address;
		this.salary = salary;
		this.releasetime = releasetime;
		this.validityperiod = validityperiod;
		this.requirements = requirements;
	}
	
	public Recruit(String recruitname, int recruitnum, String address, String salary, Date releasetime,
			int validityperiod, String requirements) {
		super();
		this.recruitname = recruitname;
		this.recruitnum = recruitnum;
		this.address = address;
		this.salary = salary;
		this.releasetime = releasetime;
		this.validityperiod = validityperiod;
		this.requirements = requirements;
	}
	public Recruit() {
		super();
	}
	
}
