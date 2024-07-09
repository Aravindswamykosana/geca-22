class  User{
	public static void main(String[] args) {
		Reverse obj=new Reverse();
		System.out.println(obj.name="arvind");
		System.out.println(obj.phno=9949858798l);
		System.out.println(obj.email="Arvind@gmail.com");
		System.out.println(obj.address="punjagutta hyd ");
		System.out.println(Reverse.cc);
		//System.out.println(obj.cc);
		obj.save();
		Reverse obj1=new Reverse();
		System.out.println(obj1.name="swamy");
		System.out.println(obj1.phno=7995861396l);
		System.out.println(obj1.email="swamy@gmail.com");
		System.out.println(obj1.address="ameerpet hyd ");
		//System.out.println(Reverse.cc);
		System.out.println(obj1.cc);
		obj1.save();
	}
}
