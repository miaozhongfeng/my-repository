package soft;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
public class prog1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n=100;//���鳤��
		int count=0;//������
		int ch=0;//���ڽ��ն�ȡ���ַ�
		//��������������
		BufferedReader br=new BufferedReader(new FileReader("c://abc.txt"));

		int[] a=new int[n];
		//��abc.txt�ļ���ǰ100���ַ�д������
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
		         System.out.println("����Ԫ�غ��ǣ�"+sum);
	}

}
