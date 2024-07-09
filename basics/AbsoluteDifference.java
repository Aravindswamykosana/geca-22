class AbsoluteDifference{
	public static void main(String[]args){
		int a=199;
		int b=108;
		if(((Math.abs(a-100)<=10) && (Math.abs(b-200)<=10)) || ((Math.abs(a-200)<=10) && (Math.abs(b-100)<=10)) ){
			System.out.println(true);}
		else{
			System.out.println(false);}
	}
}