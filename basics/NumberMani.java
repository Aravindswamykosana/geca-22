class NumberMani{
	public static void main(String[]args){
		/*int n=523861,c=0;
		while(n!=0){
			int r=n%10;
			if(r%2!=0)//if(r%2==0)
			c++;
			n/=10;
		}
		System.out.println(c);*/

		/*int n=287361,sum=0;
		while(n!=0){
			int r=n%10;
			sum+=r;
			n/=10;
		}
		System.out.println(sum);*/

		/*int n=523861,sum=0;
		while(n!=0){
			int r=n%10;
			if(r%2!=0)
			sum+=r;
			n/=10;
		}
		System.out.println(sum);*/

		/*int n=143,p=1;
		while(n!=0){
			int r=n%10;
			p*=r;
			n/=10;
		}
		System.out.println(p);*/

		/*int n=523861,product=1;
		while(n!=0){
			int r=n%10;
			if(r%2==0)
			product*=r;
			n/=10;
		}
		System.out.println(product);*/

		/*int n=123,product=1,sum=0;
		while(n!=0){
			int r=n%10;
			product*=r;
			sum+=r;
			n/=10;
		}
		System.out.println("product:"+product+" "+"sum:"+sum);
		if(sum==product){
		System.out.println("it is spy number");
		}else{
		System.out.println("it is not a spy number");}*/

		/*int n=28;
		int sum=0;
		for(int i=1;i<=n/2;i++){
			if(n%i==0){
			sum+=i;}
		}
		System.out.println("sum:"+sum+"->"+"n:"+n);
		if(sum==n){
		System.out.println("perfect");
		}else{
		System.out.println("not a perfect");}*/

		int rev=0,n=2893;
		while(n!=0){
		int r=n%10;
		rev=rev*10+r;
		n=n/10;}
		System.out.println(rev);
	}
}