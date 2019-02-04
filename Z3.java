//Задание 3 
//Необходимо написать алгоритм, выполняющий сортировку массива целых чисел по 
//убыванию. Массив вводится вручную во время выполнения программы. 

import java.util.Scanner;
public class Z3{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int elem,n;
		int[] mass;
		boolean flag=true;
		System.out.println("Razmer massiva=");
		n=in.nextInt();
		mass = new int[n];
		for(int e=0;e<n;e++)
		{
		 System.out.print("N["+(e+1)+"]=");
		 mass[e]=in.nextInt();
		 System.out.print("\n");
		}
	
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(mass[j]<mass[j+1]){
					elem=mass[j+1];
					mass[j+1]=mass[j];
					mass[j]=elem;
				}
			}
			
			
		}
		System.out.println("Otsortirovanniy po ubivaniyu massiv:");
	 for(int f=0;f<n;f++)
	 {
		 System.out.print(mass[f]+" ");
	 }
		 
		
		
	}
	
	
}