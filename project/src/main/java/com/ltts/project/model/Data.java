package com.ltts.project.model;

import javax.persistence.*;

@Entity
@Table(name = "patient")
public class Data {
	
	@Column
	@Id
	@GeneratedValue
	private int id;
	
	@Column
	private int pid;
	
	@Column
	private String timestamp;
	
	@Column
	private int heart_rate;
	
	@Column
	private int oxygen_level;
	
	@Column
	private int blood_pressure;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public int getHeart_rate() {
		return heart_rate;
	}

	public void setHeart_rate(int heart_rate) {
		this.heart_rate = heart_rate;
	}

	public int getOxygen_level() {
		return oxygen_level;
	}

	public void setOxygen_level(int oxygen_level) {
		this.oxygen_level = oxygen_level;
	}

	public int getBlood_pressure() {
		return blood_pressure;
	}

	public void setBlood_pressure(int blood_pressure) {
		this.blood_pressure = blood_pressure;
	}

	@Override
	public String toString() {
		return "Data [id=" + id + ", pid=" + pid + ", timestamp=" + timestamp + ", heart_rate=" + heart_rate
				+ ", oxygen_level=" + oxygen_level + ", blood_pressure=" + blood_pressure + "]";
	}

}
