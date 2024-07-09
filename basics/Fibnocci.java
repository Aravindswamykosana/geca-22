//wajp to print fibnocci values and later primes?
/*class Fibnocci{
	public static void main(String[]args){
		int n1=0,n2=1,n3=n1+n2,n=100;
		while(n3<=n){
			int c=0;
			for(int i=1;i<=n;i++){
				if(n3%i==0){
				c++;}
			}
			if(c==2)
			System.out.println(n3);
			n1=n2;
			n2=n3;
			n3=n1+n2;
		}*/


class Gcf{
	public static void main(String[]args){
		int gcf=1;
		int a=10,b=8,c=20;
		int min=(a>b && a>c)?a:(b>c)?b:c;
		for(int i=min;i>=1;i--){
			if(a%i==0 && b%i==0 && c%i==0){
			gcf=i;
			break;}
		}
		System.out.println(gcf);
			
	}
}