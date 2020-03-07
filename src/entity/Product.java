package entity;

import java.util.Date;

public class Product {
	private int id;
	private String feilei;
	private String pname;
	private String fujian;
	private String jieshao;
	private Date fabutime;
	private String fujianname;
	private String pimg;
	private String productinform;
	public int getId() {
		return id;
	}
	public String getFeilei() {
		return feilei;
	}
	public String getPname() {
		return pname;
	}
	public String getFujian() {
		return fujian;
	}
	public String getJieshao() {
		return jieshao;
	}
	public Date getFabutime() {
		return fabutime;
	}
	public String getFujianname() {
		return fujianname;
	}
	public String getPimg() {
		return pimg;
	}
	public String getProductinform() {
		return productinform;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setFeilei(String feilei) {
		this.feilei = feilei;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public void setFujian(String fujian) {
		this.fujian = fujian;
	}
	public void setJieshao(String jieshao) {
		this.jieshao = jieshao;
	}
	public void setFabutime(Date fabutime) {
		this.fabutime = fabutime;
	}
	public void setFujianname(String fujianname) {
		this.fujianname = fujianname;
	}
	public void setPimg(String pimg) {
		this.pimg = pimg;
	}
	public void setProductinform(String productinform) {
		this.productinform = productinform;
	}
	public Product(int id, String feilei, String pname, String fujian, String jieshao, Date fabutime, String fujianname,
			String pimg, String productinform) {
		super();
		this.id = id;
		this.feilei = feilei;
		this.pname = pname;
		this.fujian = fujian;
		this.jieshao = jieshao;
		this.fabutime = fabutime;
		this.fujianname = fujianname;
		this.pimg = pimg;
		this.productinform = productinform;
	}
	public Product(String feilei, String pname, String fujian, String jieshao, Date fabutime, String fujianname,
			String pimg, String productinform) {
		super();
		this.feilei = feilei;
		this.pname = pname;
		this.fujian = fujian;
		this.jieshao = jieshao;
		this.fabutime = fabutime;
		this.fujianname = fujianname;
		this.pimg = pimg;
		this.productinform = productinform;
	}
	public Product() {
		super();
	}
	
}
