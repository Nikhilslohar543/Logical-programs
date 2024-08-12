package logical_programms;

public class Test {

	void m2(Operation o) {
		
		int sum = o.add(10, 10);
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {

		
		Test t = new Test();
		
		//t.m2(new Operation_impl());
		
		t.m2((a, b) -> a+b);
		
		
		String s;
	}

}
