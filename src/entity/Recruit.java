package entity;

import java.io.Serializable;
import java.util.Date;

public class Recruit implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5060194595908448733L;
	private int id;//���
	private String recruitname;//��Ƹ��λ
	private int recruitnum;//��Ƹ����
	private String address;//�����ص�
	private String salary;//н��
	private Date releasetime;//����ʱ��
	private int validityperiod;//��Чʱ��
	private String requirements;//��ƸҪ��
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
