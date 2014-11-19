// 検索ワード：
// 使うクラス：

class lucas {
	public static void main(String args[])
	{
		// リュカ数列(1～100項まで算出して、合計を表示)
		// 合計を入れる変数を定義して、0を代入しておく
		double ryuka = 0;
		//// 配列の定義(100項まで)
		double [] hai = new double[101];
		//// 0項目の初期化
		hai[0] = 2;
		//// 1項目の初期化
		hai[1] = 1;
		//// 2～100項の計算
		///// 2～100までのループをfor文で書く
		for (int i=2 ; i<=100 ; i++){
			hai[i] = hai[i-1] + hai[i-2];
			// 算出した値を合計する変数に足す
			ryuka = ryuka + hai[i];
			// 足した値を表示
			System.out.println(ryuka);
		}

		/* 5～8までのループ
		for (int i=5 ; i<=8 ; i++) {
			System.out.println(i);
		}
		
		int [] hai = new int[10];
		hai[0] = 0;
		hai[1] = 10;
		hai[2] = 100
		System.out.println(hai[0]+","+hai[1]+","+hai[2]);
		
		for (int i=0 ; i<=9 ; i++) {
			hai[i] = i*2;
		}
		for (int i=0 ; i<=9 ; i++) {
			System.out.println(hai[i]);
		}
		*/
	}
}

