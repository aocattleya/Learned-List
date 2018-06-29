package com.internousdev.sample.dto;

public class SampleDTO {

	private int id;			// idフィールド
	private String name;	// nameフィールド

	// idを取得する
	public int getId() {
		return id;
	}

	// idに設定する
	public void setId(int id) {
		this.id = id;
	}

	// nameを取得する
	public String getName() {
		return name;
	}

	// nameに設定する
	public void setName(String name) {
		this.name = name;
	}
}
