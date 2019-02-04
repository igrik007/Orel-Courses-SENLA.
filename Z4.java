//Задание 4 
//Необходимо написать программу, считывающую четыре логических значения и 
//печатающую “True” в том случае, если ровно два из них истинны. Значения вводятся 
//вручную во время выполнения программы. 

import java.util.Scanner;
public class Z4{
	public static void main(String[] args){
		boolean flag=true;
		int j,kol=0;
		String str="",str_tmp="";
		Scanner in  = new Scanner(System.in);
		System.out.println("Vvedite 4-e logicheskih znacheniya(naprimer: false false true true)");
		str=in.nextLine()+' ';
		for(int i=0;i<=str.length()-1;i++)
		{
			if(str.charAt(i)!=' '){
				str_tmp+=str.charAt(i);		
			}
			else{
				str_tmp="";
			}
			if(str_tmp.equals("true"))
				kol++;	
		}
		if(kol==2)
			System.out.println(flag);
	}
}