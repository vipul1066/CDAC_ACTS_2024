import java.util.Scanner;
public class Student{
	private int rollNo;
	private String name;
	private int marks;
	private static int rollnogenerate=1;
	public Student(){
		this.rollNo=rollnogenerate++;
		this.name="";
		this.marks=0;
	}
	public Student( String name, int marks){
		this.rollNo=rollnogenerate++;
		this.name=name;
		this.marks=marks;
	}
	public void print(){
		System.out.println("Student Data: ["+ "Student Rollno: "+rollNo+ " Student name: "+name+" Student marks: "+marks+ "]");
	}
	
	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter no of student: ");
			int n= sc.nextInt();
			System.out.println("Enter student Data: ");
			sc.nextLine();
			for(int i=0;i<n;i++){
			System.out.println("Enter student Name: ");
			String b=sc.nextLine();
			System.out.println("Enter student Marks: ");
			int c = sc.nextInt();
			sc.nextLine();
			Student student = new Student(b,c);
			student.print();
			}
	}
}