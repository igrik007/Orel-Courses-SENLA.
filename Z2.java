

//Задание 2 
//Необходимо написать рекурсивный алгоритм, который находит числа Фибоначчи в 
//пределах от 1 до N. N вводится вручную во время выполнения программы. 
import java.util.Scanner;
import java.math.BigInteger;
public class Z2{
	public static  BigInteger[] memF;// = new  BigInteger[1000];
	public static void main(String[] args){
		int n_2,n_3;
		Scanner in=new Scanner(System.in);
		System.out.println("Vvedite N: ");
		n_2=in.nextInt();
		memF = new  BigInteger[n_2+3];
		long startTime = System.currentTimeMillis();
		n_3=n_2;
		if(n_2>105)n_2=(int)Math.sqrt(n_2);		
		Fib(n_2);
		//for(int i=0;i<=n_2;i++)
		//{
			
		//	System.out.println(i+" "+memF[i]);
			
		//}
	//	System.out.println("\n");
		for(int j=0;j<=n_3;j++)
		{
			
			for(int p=0;p<=memF.length-1;p++)
			{
				if(memF[p]!=null){
				if(BigInteger.valueOf(j).compareTo(memF[p])==0){
				System.out.println(j);
				break;
				}}
				
			}
		}
		long timeSpent = System.currentTimeMillis() - startTime;
System.out.println("time: " + timeSpent);
}
 public static BigInteger Fib(int n)
        {
            if (n == 0) return BigInteger.valueOf(n);
			if (n == 1) memF[n]=BigInteger.valueOf(n);
            if (memF[n] != null) return memF[n];
            memF[n] = Fib(n - 2).add(Fib(n - 1));
            return memF[n];
        }
		

}