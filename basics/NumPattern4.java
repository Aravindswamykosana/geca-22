class NumPattern4{
	public static void main(String[]args){
		/*wajp to print alphabets and numbers?
		int n=1;
		char ch='a';
		for(int i=1;i<=6;i++){
			for(int j=1;j<=6;j++){
				if(i%2!=0){
				System.out.print(n);}
				else
				System.out.print(ch);}
		System.out.println();
		if(i%2==0){
		ch++;
		}else{
		n++;}
		}*/

		/*int n=1;
		char ch='a';
		for(int i=1;i<=7;i++){
			ch='a';
			n=1;
			for(int j=1;j<=7;j++){
				if(i%2!=0){
				System.out.print(n);n++;}
				else
				System.out.print(ch);ch++;}
		System.out.println();
		}*/

		/*int space=3,n=1,col=1;
		char ch='a';
		for(int i=1;i<=4;i++){
			for(int j=1;j<=space;j++){
				System.out.print("  ");
			}
			for(int j=1;j<=col;j++){
				if(j%2!=0){
				System.out.print(n+" ");n++;}
				else{
				System.out.print(ch+" ");ch++;}
			}
			System.out.println();
			col+=2;space--;}*/
			
			/*char ch='a';
			for(int i=1;i<=5;i++){
				for(int j=1;j<=5;j++){
					if(i==3 || j==3 || (j==1 && i<=3) || (j==5 && i>=3) || (i==1 && j>=3) || (i==5 && j<=3)){
					System.out.print(ch+" ");ch++;
					}else{
					System.out.print("\\"+" ");}
				}
				System.out.println();}*/

			/*System.out.print("this is a \"java\" class");  \n=1space-\t=8spaces like 1tab.*/


		char ch='a';
		for(int i=1;i<=6;i++){
			for(int j=1;j<=4;j++){
				System.out.print(ch);ch++;
				if(ch>='j'){
				ch='a';
				}
			}
		System.out.println();
		}
	}	
}