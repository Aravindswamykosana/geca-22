class Prime{
	public static void main(String[]args){
		/*int m=10,n=20;
		int sum=0;
		for(int i=m;i<=n;i++){
			int c=0;
			for(int j=1;j<=i;j++){
				if(i%j==0)
				c++;
			}
			if(c==2)
				sum+=i;}
				System.out.println(sum);

	}*/
//}

/*class factorial{
	public static void main(String[]args){
		int m=1,n=10;
		for(int i=m;i<=n;i++){
			if(i%2==0){
			int fact=1;
			for(int j=1;j<=i;j++){
				fact*=j;
				}
			System.out.println(i+"::"+fact);
		}
	   }	
	}
}*/


		int m=1,n=11;
		for(int i=m;i<=n;i++){
			int c=0;
			for(int j=1;j<=i;j++){
				if(i%j==0)
				c++;
			}
			if(c==2){
				if(i%n==0){
				System.out.println(i);
				}
				else if(i%(n-1)==0){
				System.out.println(i);
				}
				//System.out.println(i);
			}
		}
	}
}

	
		




			
		