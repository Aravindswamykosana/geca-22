class Alphabet3{
	public static void main(String[]args){
		char ch='4';
		if(ch>='a' && ch<='z'){
			System.out.println(ch+" is alphabet");
			System.out.println(ch+" is lower");
		    }
		else{
			if(ch>='A' && ch<='Z'){
			System.out.println(ch+" is alphabet");
			System.out.println(ch+" is upper");
			}
			
		 else{
			if(ch>=0 || ch<=9){
				System.out.println("digit");}
			else
				System.out.println("special char");
				
				
			}
		}	
	}
}
				