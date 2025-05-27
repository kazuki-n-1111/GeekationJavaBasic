package objectExercise;

public class Apartment extends Property {
	
	// Apartment独自のフィールド
	private String layout;
	
	// Apartmentのコンストラクタ
	Apartment(String assets, String owner, String assetsType, int assetsPrice, String layout){
		super(assets, owner, assetsType, assetsPrice);
		this.layout = layout;
	}
	
	// オーバーライド
	public void info() {
		super.info();
		System.out.println("間取り" + this.layout);
	}
	
	
	
	// 以下ゲッター
	// layoutのゲッター
	public String getLayout() {
		return this.layout;
	}
	
	// 以下セッター
	// layoutのセッター
	public void setLayout(String layout) {
		this.layout = layout;
	}

}
