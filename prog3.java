package soft;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.io.InputStreamReader;
public class prog3 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int n = 0;int sum=0;int max=0;int min=0;
			try{
	        	System.out.println("请输入数组大小：");
	        	 n=sc.nextInt();
	        	 System.out.println("请输入元素值的上限："); 
	        	 max=sc.nextInt();
	        	 System.out.println("请输入元素值的下限：");
	        	 min=sc.nextInt();
	        }catch(InputMismatchException e){
	        	System.out.println("输入不合法！");
	        	}
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
					for(int i=0;i<n;i++)//筛选出符合条件的元素值进行求和
					{
						 
						if(list.get(i)<max&&list.get(i)>min)
							{
						   sum+=list.get(i);}
					}
					System.out.println("前"+n+"个元素的和为："+sum);
	}
}

