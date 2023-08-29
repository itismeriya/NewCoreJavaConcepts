package setter_getter_implementation;

class Student1
{
	int id;
	String name;
	String address;
	String degree;
	
	public Student1(int id,String name, String address, String degree)
	{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.degree = degree;
	}
	public Student1()
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
}
public class Class_Demo
{
	public static void main(String args[])
	{
		Student1 s = new Student1(101,"Deesha","Kolkata","BCA");
		System.out.println("Id : "+s.getId()+"\nName : "+s.getName()+"\nAddress : "+s.getAddress()+"\nDegree : "+s.getDegree());
		Student1 r = new Student1();
		r.setId(102);
		r.setName("Srkian");
		r.setAddress("Mumbai");
		r.setDegree("BCA");
		System.out.println("Id : "+r.getId()+"\nName : "+r.getName()+"\nAddress : "+r.getAddress()+"\nDegree : "+r.getDegree());
	}
}