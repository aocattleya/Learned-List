package com.internousdev.sample.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.sample.dao.SampleDAO;
import com.internousdev.sample.dto.SampleDTO;
import com.opensymphony.xwork2.ActionSupport;

public class SampleAction extends ActionSupport implements SessionAware{

	public Map<String, Object> session;		// sessionフィールド

	private int id;
	private String name;

	public String execute(){
		System.out.println("SampleAction.execute");

		// DAOを作成
		SampleDAO dao = new SampleDAO();

		// DAOのselectByIdメソッドを実行(指定したidのレコードを取得)
		SampleDTO dto = dao.selectById(id);

		// 取得したデータをSampleActionクラスのフィールドに設定
		id = dto.getId();
		name = dto.getName();

		return SUCCESS;		// 遷移先を決めるための文字列を返す
	}

	// jspで値を取得できるようにするためのメソッド			(sample.jspの<s:property value="id" />で表示している)
	public int getId(){
		System.out.println("SampleAction.getId");
		return id;
	}

	// jspから値を設定できるようにするためのメソッド		(index.jspの<s:textfield name="id" />で入力された値が入ってくる)
	public void setId(int id) {
		System.out.println("SampleAction.setId");
		this.id = id;
	}

	// jspで値を取得できるようにするためのメソッド			(sample.jspの<s:property value="name" />で表示している)
	public String getName() {
		System.out.println("SampleAction.getName");
		return name;
	}

	// セッションを受け取るためのメソッド		(SessionAwareを実装するとこのメソッドを作らないといけない)
	@Override
	public void setSession(Map<String, Object> session){
		System.out.println("SampleAction.setSession");
		this.session = session;
	}
}
