package basicSyntax;

public class MethodPractice {

	public static void main(String[] args) {
		//足し算
		int sumNum = method1(10,5);
		method5(sumNum);
		
		//引き算
		int subNum = method2(10,5);
		method5(subNum);
		
		//掛け算
		int maltiNum = method3(10,5);
		method5(maltiNum);
		
		//割り算
		int divNum = method4(10,5);
		method5(divNum);
	}
	public static int method1(int num1,int num2) {
		//足し算
		int sum = num1 + num2;
		
		return sum;
	}
	public static int method2(int num1,int num2) {
		int sub = num1 - num2;
		
		return sub;
	}
	public static int method3(int num1, int num2) {
		int malti = num1 * num2;
		
		return malti;
	}
	public static int method4(int num1,int num2) {
		int div = num1 / num2;
		
		return div;
	}
	public static void method5(int num) {
		System.out.println(num);
	}
	

}
