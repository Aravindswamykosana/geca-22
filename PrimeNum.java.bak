import java.util.Scanner;
class PrimeNum 
{
	public static boolean prime(int n){
		int c=0;
		for(int j=1;j<=n;j++){
			if(n%j==0){
				c++;
			}
		}
		if(c==2){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter m value:");
		int m=sc.nextInt();
		System.out.println("enter n value:");
		int n=sc.nextInt();
		for(int i=m;i<=n;i++){
			if(prime(i))
				System.out.println(i);
		}
	}
}