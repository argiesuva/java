class fibo {
	public static void main(String args[])
	{
		// フィボナッチ数列(0～10項まで算出して表示)
		//// 配列の定義
		int [] hai = new int[11];
		//// 0項目の初期化
		hai[0] = 0;
		//// 1項目の初期化
		hai[1] = 1;
		//// 2～10項の計算
		///// 2～10までのループをfor文で書く
		for (int i=2 ; i<=10 ; i++){
			hai[i] = hai[i-1] + hai[i-2];
		}
		//// 1～10項までを表示
		for (int i=1 ; i<=10 ; i++){
		     System.out.println(hai[i]);
		}
		/* 5～8までのループ
		for (int i=5 ; i<=8 ; i++) {
			System.out.println(i);
		}
		
		int [] hai = new int[10];
		hai[0] = 0;
		hai[1] = 10;
		hai[2] = 100;
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

