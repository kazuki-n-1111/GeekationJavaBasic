package basicSyntax;

public class Main {

	public static void main(String[] args) {
		
		int age = 3;   // Geekくんの年齢
		double height = 121.1;   // Geekくんの身長
		
		GeekIntroduction.greeting(age, height);   //greetingメソッドの呼び出し
		
		
		int num1 = 1;   // 引数１
		int num2 = 300;   // 引数２
		
		GeekIntroduction.specialSkill(num1,num2);   //specialSkillメソッドの呼び出し

	}

}
