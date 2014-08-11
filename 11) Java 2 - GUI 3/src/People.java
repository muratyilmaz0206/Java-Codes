
public class People {
	private String name;
	int gender = -1;
	int age;
	
	People father;
	People mother;
	
	People(String pName){
		name = pName;
	}
	
	/* Default constructor even if it is not declared 
	 * People(){
	 * }	 */	
	String getGender(){
		
		if ( gender == this.FEMALE)
			return "Female";
		else if (gender == this.MALE )
			return "Male";
	
		return "not defined";
	}
	
	public String getName() {
		return name;
	}



	public static int FEMALE = 0;
	public static int MALE   = 1;
	
}
