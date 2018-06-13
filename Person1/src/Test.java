
public class Test {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

	//木村次郎
		Person jirou = new Person();
		jirou.name = "木村次郎";
		jirou.age = 18;
		jirou.phoneNumber = "090-0000-0000";
		jirou.address = "jirou@yahoo.co.jp";
		jirou.job = "デザイナー";
		System.out.println(jirou.name);
		System.out.println(jirou.age);
		System.out.println(jirou.phoneNumber);
		System.out.println(jirou.address);
		System.out.println(jirou.job);

	//鈴木花子
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "080-0000-0000";
		hanako.address = "hanako@yahoo.co.jp";
		hanako.job = "ケーキ屋";
		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		System.out.println(hanako.job);

		jirou.talk();
		jirou.walk();
		jirou.run();
		hanako.talk();
		hanako.walk();
		hanako.run();

	//aibo
		Robot aibo = new Robot();
		aibo.name = "aibo";
		System.out.println(aibo.name);
		aibo.talk();
		aibo.walk();
		aibo.run();
	//asimo
		Robot asimo = new Robot();
		asimo.name = "asimo";
		System.out.println(asimo.name);
		asimo.talk();
		asimo.walk();
		asimo.run();
	//pepper
		Robot pepper = new Robot();
		pepper.name = "pepper";
		System.out.println(pepper.name);
		pepper.talk();
		pepper.walk();
		pepper.run();
	//doraemon
		Robot doraemon = new Robot();
		doraemon.name = "doraemon";
		System.out.println(doraemon.name);
		doraemon.talk();
		doraemon.walk();
		doraemon.run();
	}
}