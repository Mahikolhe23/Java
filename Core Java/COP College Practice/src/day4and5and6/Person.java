package day4and5and6;
//Q2
public class Person {
		private String name;
		private int age;
		private String city;
		
		public Person() {
			name="Ram";
			age=21;
			city="Pune";
		}
		public Person(String name,int age , String city) {
			this.name=name;
			this.age=age;
			this.city=city;
		}
		public void display() {
			System.out.println("Name: "+name+"\nAge: "+age+"\nCity: "+city);
		}
		public void setter(String name ,int age,String city) {
			this.name=name;
			this.age=age;
			this.city=city;
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public String getCity() {
			return city;
		}
		
		


}
