import java.util.Scanner;
class StrongNum 
{
	public static int strong(int n){
		int fact=1;
		for(int i=1;i<=n;i++){
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter m value:");
		int m=sc.nextInt();
		System.out.println("enter n value:");
		int n=sc.nextInt();
		for(int i=m;i<=n;i++){
			int sum=0,temp=i;
			while(temp!=0){
				int r=temp%10;
				sum=sum+strong(r);
				temp/=10;
			}
			if(sum==i){
				System.out.println(i+" is a strong number");
			}
		}
	}
}
