import java.util.Random;
import java.io.*;

class sort {
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
			int sum=0;
			// 分割された文字列の表示
            for (int i=0; i<str1Ary.length; i++) {
            	// idatas[i]に、str1Ary[i]をint型にキャストして代入
            	idatas[i]=Integer.valueOf(str1Ary[i]).intValue();
            	sum=sum+idatas[i];
            	System.out.println(str1Ary[i]);
            }
            System.out.println("合計＝"+sum);
            
            
			// ファイルを閉じる
			br.close();
			
			// 並び替え
			// 0 1 2 3番目
			// 5 2 3 1
			// >0,1=並び替え
			// 2 5 3 1
			// >1,2=並び替え
			// 2 3 5 1
			// >2,3=並び替え
			// 2 3 1 5
			// -----------
			// >0,1=そのまま
			// >1,2=並びかえ
			// 2 1 3 5
			// -----------
			// >0,1=並び替え
			// 1 2 3 5
			// ------------
			// データ個数＝4
			// i:j
			// 0:0～2=4-2-0=4-2-i
			// 1:0～1=4-2-1=4-2-i
			// 2:0   =4-2-2=4-2-i
			// 以上から、iは0～データ個数-2
			// jは、0～データ個数-2-i
			for(int i=0;i<idatas.length-1;i++)
			{
				for(int j=0;j<idatas.length-1-i;j++)
				{
					if (idatas[j]>idatas[j+1])
					{
						int w = idatas[j];
						idatas[j]=idatas[j+1];
						idatas[j+1]=w;
					}
				}
			}
			for(int i=0 ; i<idatas.length;i++) {
				System.out.print(idatas[i]+",");
			}
			
		} catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}
