package basicSyntax;

public class GeekIntroduction {
	
	// Geekくん自己紹介メソッド
	public static void greeting(int age, double height) {
		
		System.out.println("こんにちは!私はGeek君でごわす。");
		System.out.println("歳は" + age + "でごわす。");
		System.out.println("身長は" + height + "でごわす。");
	}
	// Geekくん特技メソッド
	public static void specialSkill(int num1, int num2) {
		
		if(num1 < 0  || num2 < 0) {   // 引数num1またはnum2が0より小さかった場合
			System.out.println("num1とnum2は0より大きい値にしてください。");
			return;   // メソッドの終了
		}else if(num1 >= num2){   // 引数num1がnum2以上の場合
			System.out.println("num2はnum1より大きい値にしてください。");
			return;   // メソッドの終了
		}else if(num1 >= 300 || num2 >= 300){   // 引数num1またはnum2が300以上だった場合
			System.out.println("num1とnum2は300以下にしてください。");
			return;   // メソッドの終了
		}else {
			int number = num1;
			
			for(int i = num1; i <= num2; i++) {
				
				if(number % 3 == 0 && number % 5 == 0) {
					System.out.println(number + "は3の倍数かつ5の倍数です。");
					number ++;
				}else if(number % 3 == 0) {
					System.out.println(number + "は3の倍数です。");
					number ++;
				}else if(number % 5 == 0) {
					System.out.println(number + "は5の倍数です。");
					number ++;
				}else {
					System.out.println(number);
					number ++;
				}
			}
		}
	}

}
