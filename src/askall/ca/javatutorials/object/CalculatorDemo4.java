package askall.ca.javatutorials.object;


class Calculator{
	static final double PI = 3.14;
	static int base = 0;
	int left, right;
	public void setOperands(int left, int right){
		this.left = left;
		this.right = right;
	}
	
	public void sum(){
		System.out.println(this.left + this.right + base);
	}
	
	public void avg(){
		System.out.println((this.left+this.right + base)/2);
	}
}

class Calculator3{

	public static void sum(int left, int right){
		System.out.println(left+right);
	}
	public static void avg(int left, int right){
		System.out.println((left+right)/2);
	}
}

public class CalculatorDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c1 = new Calculator();
		c1.setOperands(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOperands(20, 40);
		c2.sum();
		c2.avg();
		
		System.out.println(Calculator.PI);

		Calculator.base = 10;
		c1.sum();
		c2.avg();
		
		Calculator3.avg(10, 20);
		
		
	}

}
