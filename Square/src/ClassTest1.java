class ClassTest1 {
	public static void main(String args[]){
		int area;
		System.out.println("【一辺の長さが ５の正方形】");
		Square.length = 5; //一辺の長さを設定
		Square.display(); //正方形の形を出力
		area = Square.calcArea(); //正方形の面積を計算
		System.out.println("面積は " + area + "です");
	}
}
