class Kite 
{
	public static void main(String[] args) 
	{
		int star=1,space=3;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=space;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			System.out.println();
			if(i<=3){
				star+=2;
				space--;
			}
			else{
				star-=2;
				space++;
			}
		}
		int s=1,s1=3;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=s1;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=s;j++){
				System.out.print("$");
			}
			System.out.println();
		}
		char ch='A';
		int s2=3;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=s2;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=s;j++){
				System.out.print(ch);
			}
			System.out.println();
			if(i<=3){
				ch+=2;
				space--;
			}
			else{
				ch-=2;
				space++;
			}
		}
	}
}
