package com.sort.employee;

import java.util.Comparator;


class EmpNameComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.empName.compareTo(e2.empName);
	}
}

class EmpAgeComparator implements Comparator<Employee>{
	public int compare(Employee e1, Employee e2) {
		return e1.age - e2.age;
	}
}
