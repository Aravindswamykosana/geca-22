class ElseIf{          /*max 0f f0ur*/
	public static void main(String[]args){
		int a=400,b=400,c=20,d=8;    /*b is max*/  
		int max=0;
		if((a>b && a>c) && (a>d)){   /*if all values are given same then d is max*/
			max=a;
		}
		else if(b>c && b>d){
			max=b;
		}
		else if(c>d){
			max=c;
		}
		else{
			max=d;
		}
		System.out.println(max);
	}
}