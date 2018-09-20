package askall.ca.javatutorials.condition;

public class DefineDemo {

	public static void main(String[] args) {
		String[] classGroup = {"최진혁", "최유빈", "한이람", "이고잉"};
		for(int i = 0; i < classGroup.length; i++){
			System.out.println(classGroup[i]);	
		}
		
		for(String e: classGroup){
			System.out.println(e + " 이 나왔네요");
		}

	}

}
