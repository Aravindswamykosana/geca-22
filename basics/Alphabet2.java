class Alphabet2{
	public static void main(String[]args){
		char ch='2';
		if(ch>='A' && ch<='Z'){
			System.out.println(ch+" is alphabet");
			System.out.println(ch+" is upper case");}
		else if(ch>='a' && ch<='z'){
			System.out.println(ch+" is alphabet");
			System.out.println(ch+" is lower case");}
		else if(ch>=0 || ch<=9){
			System.out.println("digit");
		}
		else
			System.out.println(ch+" is a special");
			
	}
}