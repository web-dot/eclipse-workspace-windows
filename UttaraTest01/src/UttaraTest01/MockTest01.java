package UttaraTest01;

interface Jumpable{};
class AnAnimal{};
class Lion extends Animal implements Jumpable{};

class Student{int marks = 10;}


class Pencil {}
class ColorPencil extends Pencil {
String color;
ColorPencil(String color) {this.color = color;}
}



class Doctor {
	protected int age;
	protected void setAge(int val) { age = val; }
	protected int getAge() { return age; }
}

class Surgeon extends Doctor {
	Surgeon(String val) {
		specialization = val;	
	}
	String specialization;
	String getSpecialization() {
		return specialization;
	}
}


public class MockTest01 {

	public static void main(String[] args) {
		/*
		Jumpable var1 = new Jumpable();
		Animal var2 = new Animal();
		Lion var3 = new Animal();
		Jumpable var4 = new Animal();
		Jumpable var5 = new Lion();
		Jumpable var6 = (Jumpable)(new Animal());
		*/
		
		int a = 0;
		while (a == a++) {
		a++;
		System.out.println(a);
		}

	}

}
