import java.util.Random;
import java.io.*;

class file {
	public static void main(String args[])
	{
		// 0～100までの乱数を100個コンマ区切りで
		// ファイル出力する
		
		// 0～100までの乱数をint型の変数aに求めて
		// 出力
		Random b = new Random();
		int a =b.nextInt(101);
		System.out.print(a);
		// 変数aをtensu.txtにファイル出力する
		try{
			File file = new File("tensu.txt");
			FileWriter fw = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.println(a);
			pw.close();
		} catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
