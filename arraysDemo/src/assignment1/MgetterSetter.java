package assignment1;

class Student
{
	private int sid;
	private String name;
	private String address;
	private int marks;
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address= address;
	}
	public void setMarks(int marks) {
		this.marks= marks;
	}
	public int getSid() {
		return sid;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getMarks() {
		return marks;
	}
	@Override
	public String toString() {
		String st = "Student [sid=" + sid + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
		return st;
	}
	
//	public int getSid() {
//		return sid;
//	}
//	public void setSid(int sid) {
//		this.sid = sid;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getAddress() {
//		return address;
//	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
//	public int getMarks() {
//		return marks;
//	}
//	public void setMarks(int marks) {
//		this.marks = marks;
//	}
	
	
}

public class MgetterSetter {
	public static void main(String[] args) {
		
		Student st = new Student();
		
		st.setSid(101);
		st.setName("rahul");
		st.setAddress("Pune");
		st.setMarks(82);
		
		System.out.println(st.getName());
		System.out.println(st.getSid());
		System.out.println(st.getAddress());
		System.out.println(st.getMarks());
		
		System.out.println(st.toString());
	}

}
