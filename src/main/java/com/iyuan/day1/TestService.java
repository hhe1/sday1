package com.iyuan.day1;

public class TestService {
	private String dbname;

	public String getDbname() {
		return dbname;
	}

	public void setDbname(String dbname) {
		this.dbname = dbname;
	}

	public void say() {
		System.out.println("TestService---dbname is -"+dbname);
	}
}
