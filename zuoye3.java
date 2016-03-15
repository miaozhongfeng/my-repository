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
	  //函数说明：正则表达式法判断字符是否为数字
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
		     //定义es接收英文句子字符串
		     String es=null;
		     System.out.println("请输入英语短句：");
		      //小提示：next遇到空格返回，nextLine可读一行
        	 es=sc.nextLine();
        	 //为了不区分大小写，把所有字母转换成小写
        	 es= es.toLowerCase();
        	 //这个类会将字符串分解
        	 StringTokenizer token=new StringTokenizer(es);
        	//遍历
        	 while(token.hasMoreTokens())
        	 {   
        		//按照,[空格] ? . !，双引号，单引号，换行符去分割 
        		 String word=token.nextToken(", ?.!:\"\"\''\n"); 
        		//取单词的第一个字符，调用函数isNumeric判断word的首字符是否为数字,并且判断单词长度是否大于3
        		if( !isNumeric(word.subSequence(0,1))&&word.length()>=4)
        		{  
        			//统计单词的个数
        		   if(map.containsKey(word))
        		   {     
        	            int count=map.get(word);  
        	            //如果HashMap已有这个单词，则使它的数量加1
        	            map.put(word, count+1);
        		  }  
        		 //如果没有第二个相同单词，数量为1 
        	       else                                    
        	            map.put(word, 1);      
        	     }
        	   }  
        	 
        	 List<Map.Entry<String, Integer>> infoIds = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        	 System.out.println("该句子中所有长度大于3的单词出现的次数分别如下：");
        	  //输出结果
        	 for (int i = 0; i < infoIds.size(); i++)        
        	 {     
        	       Entry<String, Integer> id = infoIds.get(i);  
        	       System.out.println(id.getKey()+":"+id.getValue());  
        	 }  
	}
	

}
