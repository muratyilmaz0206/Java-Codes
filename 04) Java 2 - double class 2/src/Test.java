
public class Test {


	public static void main(String[] args) {
		
		People pp = new People("Smith");
		pp.age=40;
		pp.gender="Male";
		
		
		People p2 = new People("Amanda");
		p2.age=38;
		p2.gender="Female";
		
		
		People p0 = new People("Marry");
		p0.age=18;
		p0.gender="Female";
		p0.father = pp;
		p0.mother=p2;
		
		
		System.out.println(p0.name+"'s" + " father name is "
		+ p0.father.name
		+ " and mother is "
		+ p0.mother.name); // syso + control + space
		
		
		
	}

}
