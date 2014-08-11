import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;


public class GetPersonDetails {


	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("persons.bin");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			List persons = (ArrayList)ois.readObject();
			
			for (Object object : persons) {
				Person temp = (Person)object;
				System.out.println( temp.getFullName() + " " + temp.getAge() + " " + temp.getGender() );
			}
			
			
		}catch(Exception e){
			System.out.println( e.toString());
		}

	}

}
