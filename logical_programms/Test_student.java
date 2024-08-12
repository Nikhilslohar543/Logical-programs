package logical_programms;

import java.util.ArrayList;
import java.util.Collections;

public class Test_student {

	public static void main(String[] args) {

		ArrayList<Student> sl = new ArrayList<Student>();
		
		sl.add(new Student(1,"z",80));
		sl.add(new Student(5,"p",60));
		sl.add(new Student(4,"a",70));
		sl.add(new Student(2,"c",50));
		sl.add(new Student(3,"b",90));
		
		Collections.sort(sl);
		System.out.println(sl);
		
	}

}
