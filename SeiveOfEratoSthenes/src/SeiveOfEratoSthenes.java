import java.util.Arrays;
import java.util.Scanner;

public class SeiveOfEratoSthenes {

	
	 static boolean[]sieveOfEratoSthenes(int n){
		boolean isPrime[]=new boolean[n+1];
		Arrays.fill(isPrime, true);
		isPrime[0]=false;
		isPrime[1]=false;
		
		
		for(int i=2;i*i<=n;i++) {
			for(int j=2*i;j<=n;j=j+i) {
				isPrime[j]=false;
			}
		}
		return isPrime;
	 }
	
	
	public static void main(String[] args) {
		System.out.println("enter the number till which you want to find the prime numbers");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
	boolean isPrime[]=sieveOfEratoSthenes(num);
	for(int i=1;i<=num;i++) {
	System.out.println(i+" "+ isPrime[i]);
	}
	}

}
