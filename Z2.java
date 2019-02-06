

//Задание 2 
//Необходимо написать рекурсивный алгоритм, который находит числа Фибоначчи в 
//пределах от 1 до N. N вводится вручную во время выполнения программы. 
import java.util.Scanner;
import java.util.ArrayList;
public class Z2{
	public static ArrayList<Integer> sp=new ArrayList<Integer>();
		
	public static void main(String[] args){
		int n,i=1,j=2;
		Scanner in = new Scanner(System.in);
		System.out.print("Vvedite N:");
		n=in.nextInt();		
		F(n,i,j);
	}
	
	public static void F(int n,int tek,int j){
		if(tek==1){sp.add(1);sp.add(1);}
		if(tek<=n)
		{
			if(tek==sp.get(j-1)+sp.get(j-2)){
				sp.add(tek);
				j++;
			}
				tek++;
				F(n,tek,j);
		}else{
			for(int k=0;k<=sp.size()-1;k++)
		{
			System.out.println(sp.get(k));
	    }
		}
			
	}
}
