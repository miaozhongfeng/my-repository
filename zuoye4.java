package soft;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class zuoye4 
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
	public static void main(String[] args) throws Exception  
	{
		
	
	           Map<String,Integer> map=new HashMap<String,Integer>();
	          
	           File file = new File("e:\\�ĵ�\\Gone_with_the_wind.txt");
	           FileReader reader = new FileReader(file);
	           int fileLen = (int)file.length();
	           char[] chars = new char[fileLen];
	           reader.read(chars);
	           String es= String.valueOf(chars);
	           
	  /*Scanner sc=new Scanner(System.in);
		     //����es����Ӣ�ľ����ַ���
		     String es=null;
		     System.out.println("������Ӣ��̾䣺");
		      //С��ʾ��next�����ո񷵻أ�nextLine�ɶ�һ��
        	 es=sc.nextLine();*/
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
	
	        
        		   List<Map.Entry<String, Integer>> infoids = new ArrayList<Map.Entry<String, Integer>>(map.entrySet());
        		  
        	
        		   Collections.sort(infoids, new Comparator<Map.Entry<String, Integer>>() 
        		    		{     //����
        		                 public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) 
        		                 {     
        		                      if(o1.getValue()<o2.getValue())
        		                
        		                      return 1;
        		                      else if(o1.getValue()>o2.getValue())
        		                    	  return -1;
        		                      else
        		                    	  return(o1.getKey().compareTo(o2.getKey()));
        		                 }     
        		         });
        		                  
        		    
        		
        		   //System.out.println(new TreeMap<String, Integer>());
        		   FileWriter writer = new FileWriter("E:\\Result.txt.txt");
        		    for (int i = 0; i <infoids.size(); i++) 
        		    {   
                         Entry<String, Integer> id =infoids.get(i); 
                       
                       
                    	  
                             writer.write(id.getKey()+' '+id.getValue()+"\r\n");
                            
                         } 
                         
        		    writer.flush();
                    writer.close(); 
                         
        		      //System.out.println(id.getKey()+":"+id.getValue()); 
                        
        		    }
        		    
        		        } 

        
 
        


