package askall.ca.javatutorial.constructor;

public class DividableInheritance extends SubtractableCalculator {
	public DividableInheritance(int left, int right){
		super(left,right);
	}
	
	public void division(){
		System.out.println((float)this.left/this.right);
	}
	@Override
	public void sum(){
		System.out.println("Result is    : " + this.left + this.right);
	}
}
