import java.lang.*;
import java.util.*;
import java.io.*;

public class Start 
{
    public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int z=sc.nextInt();
		for(int i=0;i<=z;i++){
		String s=sc.nextLine();
		int n=s.length();
		if(n<11){
		    System.out.println(s);
		}else{
		    char ch=s.charAt(0);
		    char ch1=s.charAt(n-1);
		    System.out.print(ch);
		    System.out.print(n-2);
		    System.out.println(ch1);
		}
	}
    }
}
