class Ri8Arrow
{
	public static void main(String[] args) 
	{
		int star=1,space=3;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=5;j++){
				if(i>=3 && i<=5){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			for(int j=1;j<=star;j++){
				System.out.print("*");
			}
			System.out.println();
			if(i<=3){
				star++;
				space--;
			}
			else{
				star--;
				space++;
			}
		}
	}
}