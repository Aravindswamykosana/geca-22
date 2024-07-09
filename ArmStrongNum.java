import java.util.Scanner;
class ArmStrongNum 
{
	public static int count(int num){
		int c=0;
		while(num!=0){
			c++;
			num/=10;
		}
		return c;
	}
	public static int power(int rem,int pow){
		int power=1;
		for(int i=1;i<=pow;i++){
			power*=rem;
		}
		return power;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter m value:");
		int m=sc.nextInt();
		System.out.println("enter n value:");
		int n=sc.nextInt();
		for(int i=m;i<=n;i++){
			int temp=i,sum=0;
			int count=count(temp);
			while(temp!=0){
				int r=temp%10;
				sum=sum+power(r,count);
				temp/=10;
			}
			if(sum==i){
				System.out.println("arm strong number is:"+i);
			}
		}
	}
}
