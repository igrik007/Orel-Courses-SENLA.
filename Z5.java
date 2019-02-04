//Задание 5 
//Необходимо написать программу, которая проверяет слово на "палиндромность". 
//Слово для проверки вводится вручную во время выполнения программы.  

import java.util.Scanner;
public class Z5{
		public static void main(String[] args){
			Scanner in = new Scanner(System.in);
			String str="",str_tmp="";
			System.out.println("Vvedite slovo:");
			str=in.nextLine();
			//System.out.println(str+str.charAt(1));
			for(int i=str.length()-1;i>=0;i--){
				
				str_tmp=str_tmp+str.charAt(i);
				
			}
			if(str.equals(str_tmp))
				System.out.println("Vvedennoe slovo-palindrom");
			else
				System.out.println("Vvedennoe slovo-ne palindrom");
		}
	
	

}