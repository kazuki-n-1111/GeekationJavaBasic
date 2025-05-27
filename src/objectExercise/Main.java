package objectExercise;

public class Main {

	public static void main(String[] args) {
		
		Apartment apartment = new Apartment("いい感じのアパートメント", "山田　マンション太郎", "マンション", 50000000, "3LDK");
		Land land = new Land("いい感じの土地", "山田　土地太郎", "土地", 8000000, 105.2);
		
		apartment.info();
		land.info();
		
		
		// 以下はゲッター及びセッターの検証用
		// Apartmentのゲッター
		// System.out.println(apartment.getAssets());
		// System.out.println(apartment.getOwner());
		// System.out.println(apartment.getAssetsType());
		// System.out.println(apartment.getAssetsPrice());
		// System.out.println(apartment.getLayout());
		
		// Landのゲッター
		// System.out.println(land.getAssets());
		// System.out.println(land.getOwner());
		// System.out.println(land.getAssetsType());
		// System.out.println(land.getAssetsPrice());
		// System.out.println(land.getExtent());
		
	}

}
