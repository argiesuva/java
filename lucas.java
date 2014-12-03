import java.math.*;

// 検索ワード：
// 使うクラス：

class lucas {
	public static void main(String args[])
	{
		// リュカ数列(1～100項まで算出して、合計を表示)
		// 合計を入れる変数を定義して、0を代入しておく
		// BigInteger型でryukaを定義して0を代入
		BigInteger ryuka = new BigInteger("0");
		//// BigInteger型の配列の定義(100項まで)
		BigInteger [] hai = new BigInteger[101];
		//// 0項目の初期化
		hai[0] = new BigInteger("2");
		//// 1項目の初期化
		hai[1] = new BigInteger("1");
		ryuka = ryuka.add(hai[1]);
		//// 2～100項の計算
		///// 2～100までのループをfor文で書く
		for (int i=2 ; i<=100 ; i++){
			// やりたいこと：n = n + one;
			// BigIntegerに書き換えると
			//          n = n.add(one);
			hai[i] = hai[i-1].add(hai[i-2]);
			// 算出した値を合計する変数に足す
			ryuka = ryuka.add(hai[i]);
			// 足した値を表示
			System.out.println(ryuka);
		}
	}
}

