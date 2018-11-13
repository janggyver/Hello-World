package askall.ca.javatutorials.generic;

class EmployeeInfo2{
    public int rank;
    EmployeeInfo2(int rank){ this.rank = rank; }
}
class Person2<T, S>{
    public T info;
    public S id;
    Person2(T info, S id){ 
        this.info = info;
        this.id = id;
    }
}
public class GenericDemo2 {
    public static void main(String[] args) {
        EmployeeInfo2 e = new EmployeeInfo2(1);
        //Integer i = new Integer(10);
        try{
            Person2<EmployeeInfo2, Integer> p1 = new Person2<EmployeeInfo2, Integer>(e, 10);
            System.out.println(p1.id.intValue());       	
            System.out.println(p1.info.rank);       	
            
        }catch(Exception ex){
        	System.out.println(ex.getStackTrace());
        }

    }
}
