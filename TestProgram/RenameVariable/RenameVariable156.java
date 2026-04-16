@SuppressWarnings("preview")public class X {
public static void printLowerRight(Rectangle r) {
	int res = switch(r) {
	case Rectangle(ColoredPoint(Point(int xy, int y), Color c),
	                   ColoredPoint lr) r1  -> {
	                	   //r1.
	                	   
	                	   r1=null;
				System.out.println("x= " + xy);
				System.out.println("y= " + y);
				System.out.println("lr= " + lr);
				System.out.println("lr.c()= " + lr.c());
				System.out.println("lr.p()= " + lr.p());
				System.out.println("lr.p().x()= " + lr.p().x());
				System.out.println("lr.p().y()= " + lr.p());
				System.out.println("c= " + c);
				System.out.println("r1= " + r1);
		yield xy;  
	} 
	default -> 0;
	}; 
	System.out.println("Returns: " + res);
}
public static void main(String[] args) {
	printLowerRight(new Rectangle(new ColoredPoint(new Point(15, 5), Color.BLUE), 
	new ColoredPoint(new Point(30, 10), Color.RED)));
}
}
record Point(int x, int y) {}
enum Color { RED, GREEN, BLUE }
record ColoredPoint(Point p, Color c) {}
record Rectangle(ColoredPoint upperLeft, ColoredPoint lowerRight) {}