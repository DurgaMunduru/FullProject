package com.dxc.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="jobs")
public class JobPost {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long jid;
	
	@Column(name="title")
	private String title;
	
	@Column(name="company")
	private String company;

	@Column(name="des")
	private String desc;
	
	@Column(name="tech1")
	private String tech1;
	
	@Column(name="tech2")
	private String tech2;
	public JobPost() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JobPost(long jid, String title, String company, String desc, String tech1, String tech2) {
		super();
		this.jid = jid;
		this.title = title;
		this.company = company;
		this.desc = desc;
		this.tech1 = tech1;
		this.tech2 = tech2;
	}
	public long getJid() {
		return jid;
	}
	public void setJid(long jid) {
		this.jid = jid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getTech1() {
		return tech1;
	}
	public void setTech1(String tech1) {
		this.tech1 = tech1;
	}
	public String getTech2() {
		return tech2;
	}
	public void setTech2(String tech2) {
		this.tech2 = tech2;
	}
	@Override
	public String toString() {
		return "JobPost [jid=" + jid + ", title=" + title + ", company=" + company + ", desc=" + desc + ", tech1="
				+ tech1 + ", tech2=" + tech2 + "]";
	}
	
}
