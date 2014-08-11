
public class Test {

 
	public static void main(String[] args) {
		 People pp = new People("Smith");
		 pp.age = 40;
		 pp.gender = People.MALE;
		 
		 People p2 = new People("Amanda");
		 p2.age = 38;
		 p2.gender = People.FEMALE;
		 
		 People p0 = new People("Marry");
		 p0.age = 18;
		 p0.gender = People.FEMALE;
		 p0.father = pp;
		 p0.mother = p2;	
		 			 
		 
		 
		 System.out.println(p0.getName() + "\'s" + // syso + ctrl + space
				 			" father name is " +
				 			p0.father.getName() + ", and mother is " + 
				 			p0.mother.getName());
		 
		 System.out.println( p0.getName() + "'s gender is " + p0.getGender() );
		 
		 Employee e = new Employee("Micheal");
		 e.salary = 2500;
		 e.mother = p2;
		 e.age = 19;
		 e.gender = People.MALE;
		 
		 System.out.println( e.getName() + "'s salary is " +
				 				e.salary + " and gender is " +
				 				e.getGender() );
				 				
	}

}
