package setter_getter_implementation;

class Student4
{
	int id;
	String name;
	String address;
	String degree;
	
	static String institute = "Anudip Foundation";
	static int count = 0;
	
	public Student4(int id,String name, String address, String degree)
	{
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.degree = degree;
	}
	Student4(Student4 s)
	{
		id=s.id;
		name=s.name;
		address=s.address;
		degree=s.degree;
	}
	public Student4()
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
public class ClassDemo4
{
	public static void main(String args[])
	{
		Student4 s = new Student4(101,"Deesha","Kolkata","BCA");
		System.out.println("Id : "+s.getId()+"\nName : "+s.getName()+"\nAddress : "+s.getAddress()+"\nDegree : "+s.getDegree());
		Student4 r = new Student4();
		r.setId(102);
		r.setName("Srkian");
		r.setAddress("Mumbai");
		r.setDegree("BCA");
		System.out.println("Id : "+r.getId()+"\nName : "+r.getName()+"\nAddress : "+r.getAddress()+"\nDegree : "+r.getDegree());
		System.out.println(r.degree);
		
		Student4 copystu = new Student4(s);
		System.out.println("Copy data - name - "+copystu.getName());
		System.out.println(r);
	}
}