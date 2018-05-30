
public class Capsule {

	public static void main(String[] args) {
		// インスタンス化
		Person taro = new Person("山田太郎",20);

		//getterを使ってtaroインスタンスの２つのprivateフィールドを読む
		System.out.println(taro.getName());
		System.out.println(taro.getAge());


//		taro.setName("鈴木太郎");
//		System.out.println(taro.getName());



	}
}
