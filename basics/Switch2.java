class Switch2{
	public static void main(String[]args){
		int year=3;
		String branch="cse";
		switch(year){
			case 1 :System.out.println("first year");
				switch(branch){
					case "cse":
					case "mech":
					case "civil":
					case "agri":
					case "ece":System.out.println("sub->m1,m2,chem,phys,eng,draw");break;
				default:System.out.println("other branch");
			}
			break;
			case 2:System.out.println("2nd year");
				switch(branch){
					case "cse":System.out.println("sub->oops,java,python,mefa,dbms,cn");break;
					case "mech":
					case "civil":
					case "agri":
					case "ece":System.out.println("sub->i don't know but branch sub there");break;
					default:System.out.println("other branch");
				}
			break;
			case 3:System.out.println("3rd year");
				switch(branch){
					case "cse":System.out.println("sub->cd,mfcs,c++,devops,mob,m4,m3");break;
					case "mech":
					case "civil":
					case "agri":
					case "ece":System.out.println("sub->i don't know");break;
					default:System.out.println("other branch");
				}
			break;
			case 4:System.out.println("4th year");
				switch(branch){
					case "cse":System.out.println("sub->final project,es,iot");break;
					case "mech":
					case "civil":
					case "agri":
					case "ece":System.out.println("sub->i don't know");break;
					default:System.out.println("other branch");
				}
			break;
			default:System.out.println("u have backlogs now");
				
		}
	}
}