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
	        	System.out.println("�����������С��");
	        	 n=sc.nextInt();
	        	 System.out.println("������Ԫ��ֵ�����ޣ�"); 
	        	 max=sc.nextInt();
	        	 System.out.println("������Ԫ��ֵ�����ޣ�");
	        	 min=sc.nextInt();
	        }catch(InputMismatchException e){
	        	System.out.println("���벻�Ϸ���");
	        	}
			//��ȡ�ļ��ַ�
					File file = new File("c://abc.txt");
					BufferedReader br = new BufferedReader(new FileReader(file));
					//ʹ��ArrayList���϶��嶯̬����list
					List<Integer> list = new ArrayList<Integer>();
					String tmp;
					//�ַ�ת��
					while((tmp = br.readLine()) != null){
						list.add(Integer.parseInt(tmp));
					}
					br.close();
					for(int i=0;i<n;i++)//ɸѡ������������Ԫ��ֵ�������
					{
						 
						if(list.get(i)<max&&list.get(i)>min)
							{
						   sum+=list.get(i);}
					}
					System.out.println("ǰ"+n+"��Ԫ�صĺ�Ϊ��"+sum);
	}
}
