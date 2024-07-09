class Monkey{
	public static void main(String[]args){
		boolean m1=false;
		boolean m2=false;
		if(m1^m2){    //m1==m2 
			System.out.println("safe");    //trouble
		}else{
			
			System.out.println("trouble");}   //safe
	}
	
}