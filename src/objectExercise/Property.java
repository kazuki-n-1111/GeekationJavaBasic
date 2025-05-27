package objectExercise;

public class Property {
	private String assets;	// 物件
	private String owner;	// 所有者
	private String assetsType;	// 物件種別
	private int assetsPrice;	// 価格
	
	// コンストラクタ
	Property(String assets, String owner, String assetsType, int assetsPrice){
		this.assets = assets;
		this.owner = owner;
		this.assetsType = assetsType;
		this.assetsPrice = assetsPrice;
	}
	
	// 共通分の出力
	public void info() {
		System.out.println("物件名：" + this.assets);
		System.out.println("物件所有者名" + this.owner);
		System.out.println("物件種別" + this.assetsType);
		System.out.println("物件価格" + this.assetsPrice);
	}
	
	// 以下ゲッター
	// assetsのゲッター
	public String getAssets() {
		return this.assets;
	}
	
	 // ownerのゲッター
	public String getOwner() {
		return this.owner;
	}
	
	// assetsTypeのゲッター
	public String getAssetsType() {
		return this.assetsType;
	}
	
	// assetsPriceのゲッター
	public int getAssetsPrice() {
		return this.assetsPrice;
	}
	
	
	// 以下セッター
	// assetsのセッター
	public void setAssets(String assets) {
		this.assets = assets;
	}
	
	// ownerのセッター
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	// assetsTypeのセッター
	public void setAssetsType(String assetsType) {
		this.assetsType = assetsType;
	}
	
	// assetsPriceのセッター
	public void setAssetsPrice(int assetsPrice) {
		this.assetsPrice = assetsPrice;
	}
	
}
