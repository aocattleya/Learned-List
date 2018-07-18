package com.internousdev.plus.action;

import com.opensymphony.xwork2.ActionSupport;

public class PlusAction extends ActionSupport {

	private int text1;
	private int text2;
	private int plus;

	public String execute() {

		plus = text1 + text2;

		return SUCCESS;
	}

	public void setText1(int test1) {
		text1 = test1;
	}

	public void setText2(int test2) {
		text2 = test2;
	}

	public int getPlus() {
		return plus;
	}

}
