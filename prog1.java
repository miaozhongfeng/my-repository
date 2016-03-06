package soft;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class prog1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//读取文件字符
		File file = new File("c://abc.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		//使用ArrayList集合定义动态数组list
		List<Integer> list = new ArrayList<Integer>();
		String tmp;
		//字符转换
		while((tmp = br.readLine()) != null){
			list.add(Integer.parseInt(tmp));
		}
		br.close();
		//前100个数求和
		int n=100;int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=list.get(i);
		}
		System.out.println("数组元素的和为："+sum);
	}

}
