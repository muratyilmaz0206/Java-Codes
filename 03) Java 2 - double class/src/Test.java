
public class Test {


	public static void main(String[] args) {
		
		People pp = new People("Smith");
		pp.age=40;
		pp.gender="Male";
		
		
		People p0 = new People("Marry");
		p0.age=18;
		p0.gender="Female";
		p0.father = pp;
		
		
		System.out.println(p0.name+"'s" + " father name is "
		+ p0.father.name); // syso + control + space
		
		
		
	}

}
