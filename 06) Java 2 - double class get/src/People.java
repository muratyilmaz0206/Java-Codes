
public class People {

	String name;
	int gender;
	int age;
	
	
	People father;
	People mother;
	
	
	
	People (String pName){
		name=pName;
	}
	
	
	/* Default constructor even if it is not declared.
	 * people(){
	 * } 
	 */
	
	String getGender(){
	
	if(gender == this.FEMALE)
		return "FEMALE";
	else if (gender == this.MALE)
		return "MALE";
	return "not defined";
	
}
	
	public static int FEMALE =1;
	public static int MALE =0;
	
}
