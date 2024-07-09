class NestedIfElseThree{            //max of four
	public static void main(String[]args){
		int a=29,b=30,c=69,d=90;
		if(a>b){
			if(a>c){
				if(a>d){
				System.out.println(a+" is max");
					}
			else{
				System.out.println(d+" is max");
				}
			}else{
				if(c>d){
					System.out.println(c+" is max");
					}
				else{
					System.out.println(d+" is max");
					}
				}
			}
				else{
					if(b>c){
						if(b>d){
							System.out.println(b+" is max");
							}
						else{
							System.out.println(d+" is max");
							}
						}
					else{
						if(c>d){
							System.out.println(c+" is max");
							}
						else{
							System.out.println(d+" is max");
							}
						}
					}
             }
}

			
				