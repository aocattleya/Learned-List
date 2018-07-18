

public class Person {
	//カプセル化（隠蔽）
	private String name = null;
	private int age = 0;

	//コンストラクタ
	public Person(String name,int age){
		this.name = name;
		this.age = age;
	}


	//カプセル化したフィールドに外部からアクセスするためのメソッド
	//getterとsetter
	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

	public void setName(String name){
		this.name = name;
	}
}