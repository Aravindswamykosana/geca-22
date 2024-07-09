class MinOfSeven{
	public static void main(String[]args){
		int a=10,b=20,c=30,d=35,e=40,f=45,g=50;
		int max=(a>b)
				?((a>c)
				?((a>d)
				?((a>e)
				?((a>f)?((a>g)?a:g):((f>g)?f:g)))
				:((e>f)?((e>g)?e:g):((f>g)?f:g)))
				:((d>e)
				?((d>f)
				?((d>g)?d:g):((f>g)?f:g))
				:((e>f)?((e>g)?e:g):((f>g)?f:g))))
				:((c>d)
				?((c>e)
				?((c>f)?((c>g)?c:g):((f>g)?f:g))
				:((e>f)?((e>g)?e:g):((f>g)?f:g)))
				:((d>e)
				?((d>f)?((d>g)?d:g):((f>g)?f:g))
				:((e>f)?((e>g)?e:g):((f>g)?f:g)))))
  				:((b>c)
				?((b>d)
				?((b>e)
				?((b>f)?((b>g)?b:g):((f>g)?f:g))
				:((e>f)?((e>g)?e:g):((f>g)?f:g)))
				:((d>e)
				?((d>f)?((d>g)?d:g):((f>g)?f:g))
				:((e>f)?((e>g)?e:g):((f>g)?f:g))))
				:((c>d)
				?((c>e)
				?((c>f)?((c>g)?c:g):((f>g)?f:g))
				:((e>f)?((e>g)?e:g):((f>g)?f:g)))
				:((d>e)
				?((d>f)?((d>g)?d:g):((f>g)?f:g))
				:((e>f)?((e>g)?e:g):((f>g)?f:g)))));		
		System.out.println(max);
	}
}