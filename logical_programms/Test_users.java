package logical_programms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test_users {

	public static void main(String[] args) {

		List<User> u = new ArrayList<User>();

		u.add(new User(4, "z", 55));
		u.add(new User(3, "d", 32));
		u.add(new User(6, "a", 22));
		u.add(new User(1, "c", 20));
		u.add(new User(2, "p", 40));
		
		System.err.println("sorting through name...");

		Collections.sort(u, new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				return o1.name.compareTo(o2.name);
			}

		});

		for (User user : u) {
			System.out.println(user);
		}
		
		
		System.err.println("sorting through id...");
		
		Collections.sort(u, new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				return Integer.compare(o1.id, o2.id);
			}
		});
		
		for(User user : u) {
			System.out.println(user);
		}
	}

}
