class Boolean{
	public static void main(String[]args){
		boolean weekday=true;  //false   //true   //false
		boolean vacation=false;	//true  //true   //false
		String res=(weekday && !vacation)?"not rest":"rest";
		System.out.println(res);
	}
}