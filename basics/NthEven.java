//wajp to print nth even & odd values?
class NthEven{
	public static void main(String[]args){
		/*int m=1,n=10;
		for(int i=m;i<=n;i++){
			if(i%2==0){
				if(i%(n-1)==0){
					System.out.println(i);}
				else if(i%n==0){
					System.out.println(i);}
			//System.out.println(i);
			}
		}*/

		
		int m=1,n=9;
		for(int i=m;i<=n;i++){
			if(i%2!=0){
				if(i%(n-1)==0){
					System.out.println(i);}
				else if(i%n==0){
					System.out.println(i);}
			//System.out.println(i);
			}
		}
	}
}
