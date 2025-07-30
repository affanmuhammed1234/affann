package affan;

class Student{
	int rollnumber;
	String name;
	int m1,m2,m3;
	float avg;
	
	Student( String name,int rollnumber , int m1 , int m2 , int m3){
		this.name = name;
		this.rollnumber = rollnumber;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
}
public float calculateAverage() {
	return (m1+m2+m3)/3;
}
public void displayDetails() {
	System.out.println("Roll Number:"+ rollnumber);
	System.out.println("Name:"+ name);
	System.out.println("Mark 1:"+ m1);
	System.out.println("Mark 2:"+ m2);
	System.out.println("Mark 3:"+ m3);
	System.out.println("Average:"+ calculateAverage() );
}
}
public class affan_1 {
	public static void main(String[]args) {
		Student Student1=new Student("Affan",8,40,41,42);
		Student Student2=new Student("Affan X",80,04,14,24);
		Student1.displayDetails();
		Student2.displayDetails();
		
	}



}


