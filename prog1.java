package soft;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
public class prog1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n=100;//数组长度
		int count=0;//计数器
		int ch=0;//用于接收读取的字符
		//创建输入流对象
		BufferedReader br=new BufferedReader(new FileReader("c://abc.txt"));

		int[] a=new int[n];
		//将abc.txt文件中前100个字符写入数组
		while((ch=br.read())!=-1)
		{
		if(count==n-1)
		{
		break;
		}
		else
		{
		a[count]=(int)ch;
		count++;
		}	
		}
		         int sum=0;
		         for(int i=0;i<a.length;i++)
		         {
		       	  sum=a[i]+sum;
		         }
		         System.out.println("数组元素和是："+sum);
	}

}
