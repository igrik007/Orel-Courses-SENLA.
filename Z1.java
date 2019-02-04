//Задание 1 
//Необходимо написать программу, которая вычисляет простые числа в пределах от 1 
//до N. N вводится вручную во время выполнения программы. 
import java.util.Scanner;
 
public class Z1{
	
	public static void main(String[] args){
		int n,nomer=1,i;
		boolean flag;
		Scanner in = new Scanner(System.in);
		System.out.print("Vvedite chislo N=");
		n=in.nextInt();
		long startTime = System.currentTimeMillis();
		for(i=2;i<=n;i++){
			flag=true;
					for(int r=2;r<=Math.sqrt(i);r++)
					{
						if(i%r==0){
						flag=false;	
						break;}
					}
					if(flag){System.out.println(nomer+": "+i);nomer++;};
						}
		

		long timeSpent = System.currentTimeMillis() - startTime;
		System.out.println("time: " + timeSpent);
	}

}