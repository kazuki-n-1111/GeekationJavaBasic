package basicSyntax;

public class Calculation {

	public static void main(String[] args) {
		//実装内容１
		int x = 5;
		int y = 10;
		int z = x + y;
		
		//実装内容１の出力
		System.out.println("変数zの値は" + z + "です。");
		
		
		
		//実装内容２
		double a = 5.25;
		a += 2.5;
		a *= 3.0;
		int b = (int) a;
		b += 10;
		
		//実装内容２の出力
		System.out.println("変数aの値は" + a + "です。");
		System.out.println("変数bの値は" + b + "です。");
	}

}
