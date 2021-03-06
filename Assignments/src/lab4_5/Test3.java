package lab4_5;

public class Test3 {
	
	public static void main(String[] args) {

		Polygon[] objects = {new Triangle(4,5,6),
								 new Square(3),
								 new Rectangle(3,4)};
		//compute perimeter
		//display polygon name, and perimeter
		for(Polygon cc : objects) {
			System.out.println("For this " + cc.getClass().getSimpleName() + "\n\tPerimeter = " + cc.computePerimeter());
		}
    
	}
}