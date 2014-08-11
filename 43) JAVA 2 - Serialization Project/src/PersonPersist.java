import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;


public class PersonPersist {
	List persons = new ArrayList<>();
	
	public PersonPersist() {
		 Person p1 = new Person("Hendry Manth", 10, "Male");
		 Person p2 = new Person("Bob Smith", 21, "Male");
		 Person p3 = new Person("Richa Athens", 21, "Female");		 
		 persons.add(p1);
		 persons.add(p2);
		 persons.add(p3);
		 
		 for(int i=0; i<4; i++){
			 String name = JOptionPane.showInputDialog("name");
			 int age = Integer.parseInt( JOptionPane.showInputDialog("age"));
			 String gender = JOptionPane.showInputDialog("gender");
			 
			 Person temp = new Person(name, age, gender);
			 persons.add( temp);
		 }
		 
		 storeInFile(persons);
	}
	
	public void storeInFile( Object whatToWrite){
		try{
			FileOutputStream fos = new FileOutputStream("persons.bin");
			ObjectOutputStream os = new ObjectOutputStream(fos);
			os.writeObject(whatToWrite);
			os.close();
		}catch(Exception e){
			System.out.println( e.toString() );
		}
	}
	 
	public static void main(String[] args) {
		new PersonPersist();
	}

}
