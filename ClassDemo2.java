package setter_getter_implementation;

import java.util.Scanner;
class Student2 
{
	int id;
	String name;
	String address;
	String degree;
	Scanner S = new Scanner(System.in);
	
	void setData()
	{
		System.out.println("Enter Id : ");
		id = S.nextInt();
		S.nextLine(); //consume delimiter
		System.out.println("Enter Name : ");
		name = S.nextLine();
		
		System.out.println("Enter Address : ");
		address = S.nextLine();
		
		System.out.println("Enter Degree : ");
		degree = S.nextLine();
	}
	void getData()
	{
		System.out.println("Id : "+id+"\nName : "+name+"\nAddress : "+address+"\nDegree : "+degree);
	}
}
public class ClassDemo2
{
	public static void main(String args[])
	{
		Scanner S = new Scanner(System.in);
		Student2 deesha = new Student2();
		deesha.setData();
		deesha.getData();
		
		Student2 nisha = new Student2();
		nisha.setData();
		nisha.getData();
	}
}