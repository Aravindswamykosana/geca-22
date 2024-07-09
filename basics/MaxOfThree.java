class MaxOfThree{
	public static void main(String[]args){
		int a=30,b=20,c=25;
		int max=(a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println(max);
		int d=20,e=300,f=25;
		int max1=(d>e)?((d>f)?d:f):((e>f)?e:f);
		System.out.println(max1);
		int a1=20,b1=30,c1=250;
		int max2=(a1>b1)?((a1>c1)?a1:c1):((b1>c1)?b1:c1);
		System.out.println(max2);
	}
}