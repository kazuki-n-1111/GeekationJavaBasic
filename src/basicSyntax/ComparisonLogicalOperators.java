package basicSyntax;

public class ComparisonLogicalOperators {

	public static void main(String[] args) {
		//実装１
		int a = 10;
		int b = 1;
		
		boolean isGreater = (a > b);
		
		//実装１の出力
		System.out.println(isGreater);
		
		
		
		//実装２
		boolean isSunny = true;
		boolean isWarm = true;
		
		boolean theDay = (isSunny && isWarm);
		
		//実装２の出力
		System.out.println(theDay);
		
		
		
		//実装３
		int x = 1;
		int y = 2;
		
		boolean condition = (x >= 0 && y % 2 == 0);
		
		//実装３の出力
		System.out.println(condition);
		
		
		
		//実装４
		boolean hasPermission = false;
		boolean which = !(hasPermission);
		
		//実装４の出力
		System.out.println(which);
				
	}

}
