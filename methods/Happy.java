class Happy {
	public static boolean happy(int n){
		if(n==1){
			return true;
		}
		if(n==4){
			return false;
		}
		int sum=0;
		while(n!=0){
			int r=n%10;
			sum=sum+(r*r);
			n/=10;
		}
		return happy(sum);
	}
	public static void main(String[] args) {
		int n=38;
			if(happy(n)){
				System.out.println("happy num");
			}
			else{
				System.out.println("not a happy num");
			}
	}
}
