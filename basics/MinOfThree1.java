class MinOfThree1{
	public static void main(String[]args){
		int a=10,b=20,c=5;
		int min=a<b?((a<c)?a:c):((b<c)?b:c);
		System.out.println(min);
	}
}