//wajp to print even values from 1 to 10 & find factorials?
class For2{
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

	/*	int m=10,n=20;
		for(int i=m;i<=n;i++){
			if(i%2!=0){
			int pow=1;
			for(int j=1;j<=5;j++){
				pow*=i;
			}
		
		System.out.println(i+"::"+pow);
		}
	   }*/
	}
}
		
			