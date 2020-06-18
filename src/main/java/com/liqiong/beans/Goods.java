package com.liqiong.beans;

public class Goods {

	private Integer tid;
	private String tname;
	private String tprice;
	private Integer bid;
	private String uptime;
	private Integer stauts;
	
	private String bname;
	
	private String isStauts;
	
	private Boolean flag;
	
	
	public Boolean getFlag() {
		return flag;
	}
	public void setFlag(Boolean flag) {
		this.flag = flag;
	}
	public String getIsStauts() {
		return isStauts;
	}
	public void setIsStauts(String isStauts) {
		this.isStauts = isStauts;
	}
	public Goods(Integer tid, String tname, String tprice, Integer bid, String uptime, Integer stauts, String bname) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tprice = tprice;
		this.bid = bid;
		this.uptime = uptime;
		this.stauts = stauts;
		this.bname = bname;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goods(Integer tid, String tname, String tprice, Integer bid, String uptime, Integer stauts) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tprice = tprice;
		this.bid = bid;
		this.uptime = uptime;
		this.stauts = stauts;
	}
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTprice() {
		return tprice;
	}
	public void setTprice(String tprice) {
		this.tprice = tprice;
	}
	public Integer getBid() {
		return bid;
	}
	public void setBid(Integer bid) {
		this.bid = bid;
	}
	public String getUptime() {
		return uptime;
	}
	public void setUptime(String uptime) {
		this.uptime = uptime;
	}
	public Integer getStauts() {
		return stauts;
	}
	public void setStauts(Integer stauts) {
		this.stauts = stauts;
	}
	@Override
	public String toString() {
		return "Goods [tid=" + tid + ", tname=" + tname + ", tprice=" + tprice + ", bid=" + bid + ", uptime=" + uptime
				+ ", stauts=" + stauts + ", bname=" + bname + "]";
	}
	
}
