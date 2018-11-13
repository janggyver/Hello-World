package askall.ca.javatutorials.enumDemo;

enum Fruit{
	APPLE("Red"), PEACH("Pink"), BANANA("Yellow");
	private String color;

	Fruit(String color){
    	this.color = color;
        System.out.println("Call Constructor "+this);
    }
	
	public String getColor(){
		return this.color;
	}
}

public class EnumDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit fruit = Fruit.APPLE;
		
		switch(fruit){
        case APPLE:
            System.out.println(57+" kcal" + Fruit.APPLE.getColor());
            break;
        case PEACH:
            System.out.println(34+" kcal"+ Fruit.PEACH.getColor());
            break;
        case BANANA:
            System.out.println(93+" kcal" + Fruit.BANANA.getColor());
            break;
		}
		
		for(Fruit f : Fruit.values()){
			System.out.println("¿­°Å : " + f.getColor());
		}
	}

}
