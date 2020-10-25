class CarNabi {
	public static void main(String[] args) {
		// コマンドライン引数から速度と移動距離を得る
		int speed = Integer.parseInt(args[0]);
		int distance = Integer.parseInt(args[1]);
		// Carクラスのインスタンスを作る
		Car a = new Car(speed, distance);
		a.speed = speed;
		a.distance = distance;
		double time = a.getTime();
		// 移動時間を表示する
		System.out.println("目的地まで" + time + "時間です。");
	}
}

class Car {
	// フィールド
	int speed;     // 速度(int型)
	int distance;  // 距離(int型)
		
	// 速度と移動距離を指定できるコンストラクタ
	Car(int speed, int distance) {
		this.speed = speed;
		this.distance = distance;
	}			
	// 移動時間(double型)を戻り値とするメソッドgetTime
	double getTime() {
		return this.distance/this.speed;
	}
}