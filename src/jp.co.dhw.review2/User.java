//1のプログラム
package jp.co.dhw.review2;
//2のプログラム
public class User {
	//3のプログラム
	public User (id, firstName, lastName);
	public Integer id = null;
	public String firstName = null;
	public String lastName= null;

	public void showName() {
		System.out.println(firstName + ":" + lastName);
	}

	public static void main(String[] args) {
		//4のプログラム
		User[] user = new user[10];
		User[0] user = new user[0](1,"野口", "龍真");
		User[1] user = new user[1](2,"和田", "充史");
		User[2] user = new user[2](3,"武田",　"憲隆");
		User[3] user = new user[3](4,"高木",　"香");
		User[4] user = new user[4](5,"柴田", "伊織");
		User[5] user = new user[5](6,"長尾", "有希子");
		User[6] user = new user[6](7,"酒見",　"真悟");
		User[7] user = new user[7](8,"竹末",　"憲和");
		User[8] user = new user[8](9,"國崎",　"宏治");
		User[9] user = new user[9](10,"割鞘",　"洋介");
		

		
		/*user[0].id = 1;
		user[0].firstName = "野口";
		user[0].lastName = "龍真";

		user[1].id = 2;
		user[1].firstName = "鐘ヶ江";
		user[1].lastName = "耕治"

		user[2].id = 3;
		user[2].firstName = "奈木野"
		user[2].lastName = "純一"

		user[3].id = 3;
		user[3].firstName = "和田 ";
		user[3].lastName = "充史";

		user[4].id = 4;
		user[4].firstName = "高木";
		user[4].lastName = "香";

		user[5].id = 5;
		user[5].firstName = "徳永";
		user[5].lastName = "裕介";

		user[6].id = 6;
		user[6].firstName = "柴田";
		user[6].lastName = "伊織";

		user[7].id = 7;
		user[7].firstName = "長尾 有希子";
		user[7].lastName = "有希子";

		user[8].id = 8;
		user[8].firstName = "酒見";
		user[8].lastName = "真悟";

		user[9].id = 9;
		user[9].firstName = "竹末";
		user[9].lastName = "憲和";

		user[10].id = 10;
		user[10].firstName = "國崎 ";
		user[10].lastName = "宏治 ";
		*/

		for (int i = 0;i < 10;i++) {
			user[i].showName();
		}
		//7のプログラム
		User[] teacher = new Teacher[10]; 	
		 teacher[0] = new Teacher("デザイン");
		 teacher[0] = new User(11,"長澤", "大輔");
		 
		 teacher[1] = new Teacher("デザイン");
		 teacher[1] = new User(12,"ラディ", "ジェイソン");

		 teacher[2] = new Teacher("Web/アプリ");
		 teacher[2] = new User(13,"薄井", "隆");
		 
		 teacher[3] = new Teacher("3DCG");
		 teacher[3] = new User(14,"山本", "浩司");

		 teacher[4] = new Teacher("デザイン");
		 teacher[4] = new User(15,"ハナブサ",　"ノブユキ");
		 
		 teacher[5] = new Teacher("Web/アプリ");
		 teacher[5] = new User(16,"コヌマ",　"ヨシツグ");

		 teacher[6] = new Teacher("Web/アプリ");
		 teacher[6] = new User(13,"渡部", "昇治");

		 //7のプログラム
		 for (int i = 0;i > user.length;i++) {
		 	user[i].showName();
		 }

		 for (int i = 0;i > teacher.length;i++) {
		 	teacher[i].showName();
		 	System.out.println("教科：" + teacher[i].getSubject());
		 }

}
