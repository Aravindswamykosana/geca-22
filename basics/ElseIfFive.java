class ElseIfFive{          /*min 0f five*/
	public static void main(String[]args){
		int a=400,b=400,c=20,d=8,e=56;    /*b is max*/  
		int min=0;
		if((a<b && a<c) && (a<d && a<e)){   /*if all values are given same then e is max*/
			min=a;
		}
		else if(b<c && b<d && b<e){
			min=b;
		}
		else if(c<d && c<e){
			min=c;
		}
		else if(d<e){
			min=d;
		}
		else{
			min=e;
			}
		System.out.println(min);
	}
}