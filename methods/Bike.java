class  Bike{
	static String tyrescolour="black";
	String brand;
	double topspeed;
	double milage;
	public Bike(String brand,double topspeed,double milage){
		this.brand=brand;
		this.topspeed=topspeed;
		this.milage=milage;
	}
	public void ride(){
		System.out.println("your bike name is:"+this.brand+" and tyre colour is::"+tyrescolour);		
	}
	public void travel(){
			System.out.println("your topspeed is:"+topspeed);
	}
}
