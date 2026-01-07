package Comparator;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		Employee e1 = new Employee("A", 2000, 3);
		Employee e2 = new Employee("B", 2500, 1);
		Employee e3 = new Employee("C", 3000, 2);

		ArrayList<Employee> a1 = new ArrayList<>();
		a1.add(e1);
		a1.add(e2);
		a1.add(e3);

		Collections.sort(a1, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getId() - o2.getId();
			}
		});

		System.out.println("By ID");
		System.out.println(a1);

		Collections.sort(a1, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return (int) (o1.salary - o2.salary);
			}
		});
		System.out.println("By salary");
		System.out.println(a1);

		Collections.sort(a1, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.name.compareTo(o2.name);
			}
		});
		System.out.println("By name");
		System.out.println(a1);
	}
}