package com.internousdev.age.action;

import com.opensymphony.xwork2.ActionSupport;

public class AgeAction extends ActionSupport {
	private int age;
	private String kekka;

	public String execute() {

		kekka = SUCCESS;

		if(age >= 20) {
			kekka = ERROR;
		}
		return kekka;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getKekka() {
		return kekka;
	}

}