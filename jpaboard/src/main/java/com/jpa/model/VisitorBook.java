package com.jpa.model;

public class VisitorBook {
	
	private int postno;
	private String userid;
	private String address;
	private String content;
	private String companion;
	private String visitdate;
	
	public int getPostno() {
		return postno;
	}
	public void setPostno(int postno) {
		this.postno = postno;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCompanion() {
		return companion;
	}
	public void setCompanion(String companion) {
		this.companion = companion;
	}
	public String getVisitdate() {
		return visitdate;
	}
	public void setVisitdate(String visitdate) {
		this.visitdate = visitdate;
	}
	
	@Override
	public String toString() {
		return "VisitorBook [postno=" + postno + ", userid=" + userid + ", address=" + address + ", content=" + content
				+ ", companion=" + companion + ", visitdate=" + visitdate + "]";
	}
	
	
	
}
