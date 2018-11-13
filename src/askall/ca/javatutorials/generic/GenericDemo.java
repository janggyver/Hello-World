package askall.ca.javatutorials.generic;

class StudentInfo{
	public int grade;
	StudentInfo(int grade){
		this.grade = grade;
	}
}

class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank){
		this.rank = rank;
	}
}

class Person<T>{
	public T info;
	Person(T info){
		this.info = info;
	}
}

public class GenericDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person<StudentInfo> p1 = new Person<StudentInfo>(new StudentInfo(1));
		StudentInfo s1 = p1.info;
		System.out.println(s1.grade);
		
		
		//System.out.println(ei.rank);
	}

}
