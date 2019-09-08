package com.example.rest.webservices.restfulwebservices;

import java.util.Date;

public class TodoBean 
{
	private int id;
	private String desc;
	private String username;
	private Date targetDate;
	private boolean isDone;
	
	public TodoBean(int id, String desc, String username, Date targetDate, boolean isDone) {
		super();
		this.id = id;
		this.desc = desc;
		this.username = username;
		this.targetDate = targetDate;
		this.isDone = isDone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getTargetDate() {
		return targetDate;
	}

	public void setTargetDate(Date targetDate) {
		this.targetDate = targetDate;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	@Override
	public String toString() {
		return "TodoBean [id=" + id + ", desc=" + desc + ", username=" + username + ", targetDate=" + targetDate
				+ ", isDone=" + isDone + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TodoBean other = (TodoBean) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
}
