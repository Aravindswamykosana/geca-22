class New
{
	public static int fact(int k){
		int power=1;
		for(int i=1;i<=k;i++){
			power*=i;
		}
		return power;
	}
	public static void main(String[]args){
		int k=153,temp=k,c=0;
			int sum=0;
			while(k!=0){
				c++;
				k/=10;
			}
			k=temp;
			while(k!=0){
				int r=k%10;
				sum+=fact(r);
				k/=10;
			}
			if(sum==temp){
				System.out.println("arm strong number");
			}
			else{
				System.out.println("not a arm strong number");
			}
		}
}