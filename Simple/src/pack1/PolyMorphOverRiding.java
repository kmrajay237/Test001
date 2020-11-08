package pack1;

public class PolyMorphOverRiding {
	public static void main(String[] args) {
		ParentPoly pp=new ParentPoly();
		pp.property();
		pp.marriage();
		pp.honeymoon();
//		pp.inviteFriends();
//		pp.distributeMarriageCards();

		ParentPoly pp1 = new ChildPoly();
		pp1.property();
		pp1.marriage();
		pp1.honeymoon();
//		pp1.inviteFriends();
//		pp1.distributeMarriageCards();
		
		ChildPoly ccp=new ChildPoly();
		ccp.property();
		ccp.marriage();
		ccp.honeymoon();
		ccp.inviteFriends();
		ccp.distributeMarriageCards();
		
//		ChildPoly cp1=new ParentPoly();
		
	}
}

class ParentPoly {
	public void property() {
		System.out.println("Land+Ca$h+Gold");
	}

	public void marriage() {
		System.out.println("Alia || Shraddha || Nora Fatehi");
	}
	

	public void honeymoon() {
		System.out.println("Goa + Darjeeling + Ooty");
	}

}

class ChildPoly extends ParentPoly {
	public void inviteFriends() {
		System.out.println("20 Friends");
	}

	public void distributeMarriageCards() {
		System.out.println("100 Famalies");
	}

	public void marriage() {
		System.out.println("Arya Stark");
	}
	
}
