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
		//ǰ100�������
		int n=100;int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=list.get(i);
		}
		System.out.println("����Ԫ�صĺ�Ϊ��"+sum);
	}

}
