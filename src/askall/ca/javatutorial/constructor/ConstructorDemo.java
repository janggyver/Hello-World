package askall.ca.javatutorial.constructor;

class Calculator{
	int left;
	int right;
	public Calculator(int left, int right){
		this.left = left;
		this.right = right;
	}
	
	public void sum(){
		System.out.println(this.left + this.right);
	}
	
	public void avg(){
		System.out.println((this.left + this.right)/2);
	}
}

class SubtractableCalculator extends Calculator{
	
	public SubtractableCalculator(int left, int right){
		super(left, right);
	}
	public void subtract(){
		System.out.println(this.left - this.right);
	}
}

public class ConstructorDemo {
	public static void main(String[] args){
		DividableInheritance c1 = new DividableInheritance(10, 20);
		c1.sum();
		c1.avg();
		c1.subtract();
		c1.division();
	}
}
