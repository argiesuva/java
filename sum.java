import java.util.Random;
import java.io.*;

class sum {
	public static void main(String args[])
	{
		// 変数aをtensu.txtにファイル出力する
		try{
			// tensu.txtに書き込む準備
			File file = new File("tensu.csv");
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			// 読み込んだデータをコンマで分割する
			String datas = br.readLine();
			String[] str1Ary = datas.split(",");
			int [] idatas=new int[str1Ary.length];
			// 分割された文字列の表示
            for (int i=0; i<str1Ary.length; i++) {
            	// idatas[i]に、str1Ary[i]をint型にキャストして代入
            	idatas[i]=Integer.valueOf(str1Ary[i]).intValue();
            	
            	System.out.println(str1Ary[i]);
            }
            
            
            
			// ファイルを閉じる
			br.close();
		} catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
