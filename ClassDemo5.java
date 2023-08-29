package setter_getter_implementation;

class Student5
{
	int id;
	String name;
	String address;
	String degree;
	
	static String institute = "Anudip Foundation";
	static int count = 0;
	
	public Student5(int id,String name, String address, String degree)
	{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.degree = degree;
		count++;
		System.out.println("No. of object : "+count);
	}
	Student5(Student5 s1)
	{
		id = s1.id;
		name = s1.name;
		address = s1.address;
		degree = s1.degree;
	}
	public Student5()
	{
		super();
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getAddress() 
	{
		return address;
	}
	public void setAddress(String address) 
	{
		this.address = address;
	}
	public String getDegree() 
	{
		return degree;
	}
	public void setDegree(String degree) 
	{
		this.degree = degree;
	}
	public static String getInstitute()
	{
		return institute;
	}
	@Override
	public String toString() {
		return "Student5 [id=" + id + ", name=" + name + ", address=" + address + ", degree=" + degree + "]";
	}
}
	
public class ClassDemo5
{
	public static void main(String args[])
	{
		Student5 deesha = new Student5(101,"Deesha","Kolkata","BCA");
		Student5 nisha = new Student5(102,"Nisha","Mumbai","MCA");
		Student5 anjali = new Student5(103,"Anjali","Chennai","Btech");
		System.out.println("No. of students enrolled : "+Student5.count);
	}
}