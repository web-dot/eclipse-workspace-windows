package com.collections.comparator;
import java.util.Comparator;

class EmployeeNameComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.empName.compareTo(e2.empName);
	}
}

class EmployeeAgeComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.empAge - e2.empAge;
	}
}
