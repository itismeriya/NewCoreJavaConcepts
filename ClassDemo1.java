package setter_getter_implementation;

class Student
{
	int id;
	String name;
	String address;
	String degree;
	
	void setData(int id,String name, String address, String degree)
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.degree = degree;
		System.out.println("This : "+this);
	}
	void getData()
	{
		System.out.println("Id : "+id+"\nName : "+name+"\nAddress : "+address+"\nDegree : "+degree);
	}
}
public class ClassDemo1
{
	public static void main(String args[])
	{
		Student deesha = new Student();
		deesha.setData(101,"Deesha","Kolkata","BCA");
		deesha.getData();
		System.out.println("Object : "+deesha);
}
}