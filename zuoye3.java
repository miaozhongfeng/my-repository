package soft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class zuoye3 
{
	  //����˵����������ʽ���ж��ַ��Ƿ�Ϊ����
	  public static boolean isNumeric(CharSequence charSequence)
	  { 
		   Pattern pattern = Pattern.compile("[0-9]*"); 
		   Matcher isNum = pattern.matcher(charSequence);
		   if( !isNum.matches() )
		   {
		       return false; 
		   } 
		   return true; 
		}
	// TODO Auto-generated method stub
	public static void main(String[] args)
	{
		
		     Map<String,Integer> map=new HashMap<String,Integer>();
		     
		     Scanner sc=new Scanner(System.in);
		     //����es����Ӣ�ľ����ַ���
		     String es=null;
		     System.out.println("������Ӣ��̾䣺");
		      //С��ʾ��next�����ո񷵻أ�nextLine�ɶ�һ��
        	 es=sc.nextLine();
        	 //Ϊ�˲����ִ�Сд����������ĸת����Сд
        	 es= es.toLowerCase();
        	 //�����Ὣ�ַ����ֽ�
        	 StringTokenizer token=new StringTokenizer(es);
        	//����
        	 while(token.hasMoreTokens())
        	 {   
        		//����,[�ո�] ? . !��˫���ţ������ţ����з�ȥ�ָ� 
        		 String word=token.nextToken(", ?.!:\"\"\''\n"); 
        		//ȡ���ʵĵ�һ���ַ������ú���isNumeric�ж�word�����ַ��Ƿ�Ϊ����,�����жϵ��ʳ����Ƿ����3
        		if( !isNumeric(word.subSequence(0,1))&&word.length()>=4)
        		{  
        			//ͳ�Ƶ��ʵĸ���
        		   if(map.containsKey(word))
        		   {     
        	            int count=map.get(word);  
        	            //���HashMap����������ʣ���ʹ����������1
        	            map.put(word, count+1);
        		  }  
        		 //���û�еڶ�����ͬ���ʣ�����Ϊ1 
        	       else                                    
        	            map.put(word, 1);      
        	     }
        	   }  
        	 
        	 List<Map.Entry<String, Integer>> infoIds = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        	 System.out.println("�þ��������г��ȴ���3�ĵ��ʳ��ֵĴ����ֱ����£�");
        	  //������
        	 for (int i = 0; i < infoIds.size(); i++)        
        	 {     
        	       Entry<String, Integer> id = infoIds.get(i);  
        	       System.out.println(id.getKey()+":"+id.getValue());  
        	 }  
	}
	

}
