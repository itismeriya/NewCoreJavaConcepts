package basicprograms;
class Student{
    int id;
    String name;
    String address;
    String degree;
    Student(int id,String name,String address){
      super();
      this.id=id;
      this.name=name;
      this.address=address;

    }
    Student(int id,String name,String address,String degree){
       this(id, name,address);
      this.degree=degree;
      }
    void getId(){

        System.out.println("Id:"+id+" Name: "+name+" Address: "+address);
    }
 }
public class Demo {
    public static void main(String[] args) {
        Student koyel=new Student(1023, "riya", "Kolkata");
        koyel.getId();
    }
}