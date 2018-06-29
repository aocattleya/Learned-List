package com.internousdev.textbox.action;

import com.opensymphony.xwork2.ActionSupport;

public class TextBoxAction extends ActionSupport {
	private String name;
	private int age;

	private String kekka;

	public String execute() {

		kekka = name + age;

		return SUCCESS;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getKekka() {
		return kekka;
	}

}
