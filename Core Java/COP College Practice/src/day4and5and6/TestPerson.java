package day4and5and6;
//Q2
public class TestPerson {

	public static void main(String[] args) {
		Person P1 = new Person();
		P1.display();
		Person P2=new Person("mahi",25,"Pune");
		//P2.display();
		int a=P2.getAge();
		System.out.println("Age:"+a);
		P2.setter("MK", 26, "MUMBAi");
		P2.display();
		

	}

}
