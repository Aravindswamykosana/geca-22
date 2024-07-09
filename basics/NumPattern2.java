class NumPattern2{
	public static void main(String[]args){
		/*int n=1,col=1,space=3;
		for(int i=1;i<=3;i++){
			for(int j=1;j<=col;j++){
				System.out.print(n+" ");
				n++;
			}
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=col;j++){
				n--;
				if(!(i==3 && j==1))
				System.out.print(n+" ");
			}
			System.out.println();
			col++;space-=2;
		}*/

		/*int n=1,col=1,space=3;
		for(int i=1;i<=5;i++){
			n=col;
			for(int j=1;j<=col;j++){
				System.out.print(n+" ");
				n--;
			}
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=col;j++){
				n++;
				if(!(i==3 && j==1))
				System.out.print(n+" ");
			}
			System.out.println();
			if(i<=2){
			col++;space-=2;
			}else{
			n--;
			col--;space+=2;
			}
		}*/

		/*int n1=0,n2=1,n3=n1+n2;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.printf("%3d ",n1);
				n1=n2;
				n2=n3;
				n3=n1+n2;
			}
		System.out.println();
		}*/

		int n=1,k=0;
		for(int i=1;i<=4;i++){
			n=i+k;
			k=n;
			for(int j=1;j<=n;j++){
				System.out.printf("%2d ",n);
				n--;
			}
			System.out.println();
		}
	}
}