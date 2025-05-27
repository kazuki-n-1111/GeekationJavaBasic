package objectExercise;

public class Land extends Property {
	
	// Land独自のフィールド
	private double extent;
	
	// Landのコンストラクタ
	Land(String assets, String owner, String assetsType, int assetsPrice, double extent){
		super(assets, owner, assetsType, assetsPrice);
		this.extent = extent;
	}
	
	// オーバーライド
	public void info() {
		super.info();
		System.out.println("広さ：" + this.extent + "㎡");
	}
	
	
	
	// 以下はゲッター
	// layoutのゲッター
	public double getExtent() {
		return this.extent;
	}
	
	// 以下はセッター
	// layoutのセッター
	public void setExtent(double extent) {
		this.extent = extent;
	}

}
