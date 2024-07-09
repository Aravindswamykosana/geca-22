class Switch1{
	public static void main(String[]args){
		char ch='9';
		if(ch>='A' && ch<='Z' || ch>='a' && ch<='z'){
			System.out.println("alphabet");
				switch(ch){
					case 'A':
					case 'E':
					case 'I':
					case 'O':
					case 'U':System.out.println("upper vowel");break;
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':System.out.println("lower vowel");break;
					default:System.out.println("consonent");
				}
			}
		         else if(ch>='0' && ch<='9'){
					System.out.println("digit");}
		         else{
					System.out.println("special char");
		   }
	}
}
					