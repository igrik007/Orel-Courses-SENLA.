//Задание 6 
//Необходимо написать программу, которая удаляет из текста числа. Текст вводится 
//вручную во время выполнения программы.  
import java.util.Scanner;
public class Z6{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String str="",str2="";
		char[] n=new char[]{'0','1','2','3','4','5','6','7','8','9'};
		boolean flag;
		str=in.nextLine();
		for(int i=0;i<str.length();i++){
			flag=true;
			for(int j=0;j<n.length;j++)
			{
				if(str.charAt(i)==n[j]){
					flag=false;
					break;
				}
			}
			if(flag==true)
			str2=str2+str.charAt(i);
		}
		str=str2;
		System.out.println(str);
		
	}
}