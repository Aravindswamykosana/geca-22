class Exam
{
	public static void main(String[] args) 
	{
		int n=5,pc=0,i=1;
		while (true){
			int c=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					c++;
				}
			}
			if(c==2){
				pc++;
				System.out.println(i);
			}
			if(pc==n){
				break;
			}
			i++;
		}
	}
}
