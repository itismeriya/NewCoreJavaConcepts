package setter_getter_implementation;

class Student3
{
	int id;
	String name;
	String address;
	String degree;
	
	public Student3(int id,String name, String address, String degree)
	{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.degree = degree;
	}
	Student3(Student3 s1)
	{
		id = s1.id;
		name = s1.name;
		address = s1.address;
		degree = s1.degree;
	}
	public Student3()
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
public class ClassDemo3
{
	public static void main(String args[])
	{
		Student3 s = new Student3(101,"Deesha","Kolkata","BCA");
		System.out.println("Id : "+s.getId()+"\nName : "+s.getName()+"\nAddress : "+s.getAddress()+"\nDegree : "+s.getDegree());
		Student3 r = new Student3();
		r.setId(102);
		r.setName("Srkian");
		r.setAddress("Mumbai");
		r.setDegree("BCA");
		System.out.println("Id : "+r.getId()+"\nName : "+r.getName()+"\nAddress : "+r.getAddress()+"\nDegree : "+r.getDegree());
		System.out.println(r.degree);
		
		Student3 copystu = new Student3(s);
		System.out.println("Copy data - name - "+copystu.getName());
		System.out.println(r);
	}
}