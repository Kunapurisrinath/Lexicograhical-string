import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
public class LexoGraphicalString
{
	public static void main(String[] args) throws Exception
	{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		while(t--!=0)
		{
		    String s1=br.readLine();
		    String s2=br.readLine();
		    char b[]=s1.toCharArray();
		    int a[]=new int[26];
		    for(int i=0;i<s2.length();i++)
		    {
		        char ch=s2.charAt(i);
		        a[ch-97]++;
		    }
		    for(int i=0;i<a.length;i++)
		    {
		        char ch=b[i];
		        int ascii=(int)ch;
		        if(a[ascii-97]!=0)
		        {
		            for(int j=1;j<=a[ascii-97];j++)
		            {
		                System.out.print(ch);
		            }
		        }
		    }
		    if(t>=1)
		    System.out.println();
		}
		
	}
}
