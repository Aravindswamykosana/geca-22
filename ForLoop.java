class ForLoop 
{
	public static void main(String[] args) 
	{
		/*for(char ch='Z';ch>='A';ch--){
		System.out.println(ch);
		}*/
		

		/*for(int i=100;i>=50;i--){
				if(i%2==0)
			System.out.println(i);}*/


			/*for(int i=20;i<=40;i++){
				if(i%2!=0)
			System.out.println(i);}*/
			

			/*for(char ch='A';ch<='Z';ch++){
				switch(ch){  if(!(ch<='Z' && ch>='z'))
					case 'A':   System.out.println(ch);
					case 'E':
					case 'I':
					case 'O':
					case 'U':break;
					default:System.out.println(ch);}*/


					/*char ch='A',ch1='a';
					while(ch<='Z' && ch<='z')
					{
						System.out.println(ch+" | "+ch1);
						ch++;
						ch1++;
					}*/


					/*char ch='A';
					int a=1;
					while(ch<='Z' && a<=26)
					{
						System.out.println(ch+" | "+a);
						ch++;
						a++;
					}*/


					/*char ch='A',ch1='a';
					do
					{
						System.out.println(ch+" | "+ch1);
						ch++;
						ch1++;
					}while(ch<='Z' && ch<='z');*/


					/*char ch='A';
					int a=1;
					do
					{
						System.out.println(ch+" | "+a);
						ch++;
						a++;
					}while(ch<='Z' && a<='z');*/


				/*   wajp to print upper and lower case alphabets side by side?	
					for(char ch='A',ch1='a';ch<='Z';ch++,ch1++){
						
							System.out.println(ch+" | "+ch1);
					}*/

				 /* wajp to print upper alphabets & num's  side by side?
					int i=1;
					for(char ch='A';ch<='Z';ch++,i++){
						
							System.out.println(ch+" | "+i);
					}*/


					
				//wajp to print primes from fibnocci series to n?

				/*int n=1000;
				int n1=0,n2=1,n3=n1+n2;
					System.out.print(n1+" "+n2+"  ");
				while(n3<=n){
					int c=0;
					for(int i=1;i<=n;i++){
						if(n3%i==0)
						c++;
					}
					if(c==2)
						System.out.print("  "+n3);
					n1=n2;
					n2=n3;
					n3=n1+n2;
				}*/

			/*	int gcd=1;
				int a=8,b=10,c=20;
				int min=((a<b && a<c)?a:(b<c)?b:c);
				for(int i=min;i>=1;i--){
					if(a%i==0 && b%i==0 && c%i==0){
						gcd=i;
						break;
					}
				}
				System.out.println(gcd);*/

			//wajp to print lcm values max of 3?
		/*	int a=16,b=9,c=9,mul=2;
			int max=(a>b && a>c)?a:(b>c)?b:c;
			int lcm=max;
			while(true){
				if(lcm%a==0 && lcm%b==0 && lcm%c==0){
					System.out.println(lcm);
					break;
				}
				lcm=max*mul++;
			}*/


			int star=4;
			for(int i=1;i<=4;i++){
				for(int j=1;j<=star;j++){
						System.out.print("@ ");
				}
				System.out.println();
				star--;
			}
				

	}
}
