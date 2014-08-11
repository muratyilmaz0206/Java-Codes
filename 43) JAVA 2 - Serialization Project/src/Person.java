import java.io.Serializable;


public class Person implements Serializable {

	
	private String fullName;
	 private int age;
	 private String gender;
	 
	public  Person(String pFullName, int pAge, String pGender){
		 setFullName(pFullName)	;
		 setAge(pAge);
		 setGender(pGender);
	}
	 
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String pfullName) {
		this.fullName = pfullName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	 
	 
}
