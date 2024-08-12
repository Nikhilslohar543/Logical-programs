package logical_programms;

public class Student implements Comparable<Student>{
	
	int id;
	String name;
	int marks;
	
	public Student(int id, String name, int marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return marks;
	}

	public void setRoll(int marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		
//		return Integer.compare(this.marks, o.marks);
		
//		if(this.id > o.id) {
//			return 1;
//		}
//		else if(this.id < o.id) {
//			return -1;
//		}
//		else 
//			return 0;
//			
		return this.name.compareTo(o.name);
		
	}

}
