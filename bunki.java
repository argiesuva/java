class bunki {
	public static void main(String args[])
	{
		// 答えの値
		int kotae=0;
    	// 入力：数値1、記号、数値２の順番に入力
    	System.out.print("数値1=");
    	int in0 = new java.util.Scanner(System.in).nextInt();
    	System.out.print(
    		"足し算(+)、引き算(-)、掛け算(*)、割り算(/)、余り(%)のどれか=");
		// String型の変数kigouに、上記の記号を入力
		String kigou = new java.util.Scanner(System.in).nextLine();
    	System.out.print("数値2=");
    	int in1 = new java.util.Scanner(System.in).nextInt();

		// 処理：記号に応じて計算
		
		
		// 出力：計算結果を出力
		// 「数値1 計算記号 数値2 = 答え」
		System.out.println("" + in0 + kigou + in1 + "=" + kotae);
	}
}

