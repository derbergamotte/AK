package com.name.test28;

public class Students {
	private String name;
	private int mark;
	
	public Students(String name, int mark) {
		super();
		this.name = name;
		this.mark = mark;
	}
	public Students() {
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMark() {
		return mark;
	}
	public void setMark(int mark) {
		this.mark = mark;
	}
}
