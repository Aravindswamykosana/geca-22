class P13 {
	public static void main(String[] args) {
		int n=1;
		for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.print(n++);
				if(n>9)
					n=1;
					
					
			}
			System.out.println();
		}
	}
}
