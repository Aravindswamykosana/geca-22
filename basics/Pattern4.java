class Pattern4{
	public static void main(String[]args){
	/*wajp to print special characters like *,$,@?	
	int star=5,dollar=0;
	for(int i=1;i<=5;i++){
		for(int j=1;j<=dollar;j++){
			System.out.print("$");
		}
		for(int j=1;j<=star;j++){
			if(j==1 || j==star){
			System.out.print("*");
			}else{
			System.out.print("@");}
		}
		for(int j=1;j<=dollar;j++){
			System.out.print("$");
		}
		System.out.println();
		if(i<=2){
		star-=2;dollar++;
		}else{
		star+=2;dollar--;
		}
		}*/
		
	/*wajp to print left side single arrow?	
	int star=1,space=3;
	for(int i=1;i<=7;i++){
		for(int j=1;j<=space;j++){
			System.out.print("  ");
		}
		for(int j=1;j<=star;j++){
			System.out.print("* ");
		}
		if(i>=3 && i<=5){
		for(int j=1;j<=5;j++){
			System.out.print("* ");
		}
		}
		System.out.println();
		if(i<=3){
		star++;space--;
		}else{
		star--;space++;}
		}*/
	
	/*wajp to print double arrow?	
	int star=1,space=3;
	for(int i=1;i<=7;i++){
		for(int j=1;j<=space;j++){
			System.out.print("  ");
		}
		for(int j=1;j<=star;j++){
			System.out.print("* ");
		}
		for(int j=1;j<=5;j++){
			if(i>=3 && i<=5){
			System.out.print("* ");
			}
			else{
			System.out.print("  ");}
		}
		for(int j=1;j<=star;j++){
			System.out.print("* ");
		}
		System.out.println();
		if(i<=3){
		star++;space--;
		}else{
		star--;space++;
			}
		}*/

	}
}