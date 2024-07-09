class MaxOfFour{
	public static void main(String[]args){
		int a=100,b=20,c=40,d=15;
		int max=(a>b)?((a>c)?((a>d)?a:d):((c>d)?c:d)):((b>c)?((b>d)?b:d):((c>d)?c:d));
		System.out.println(max);
	}
}