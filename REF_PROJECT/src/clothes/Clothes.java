package clothes;

public class Clothes {
	//브랜드,상/하의 구분,사이즈,색상,스타일,가격
	static String brand = "T J F";
	String type;
	int size;
	String color;
	String style;
	int price;
	
	public Clothes(
			boolean type
			, int size
			, String style
			, int price) {
		this.type = (type) ? "상의" : "하의";
		this.size = size;
		this.style = style;
		this.price = price;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	String getBrandString() {
		return "[" + style + " madeBy "+ brand + "]";
	}
	String getClothesInfo() {
		return
				getBrandString()
				+ " 타입:" + this.type
				+ " 색상:" + this.color
				+ " 사이즈:" + this.size
				+ " 가격:" + this.price;
	}
}
