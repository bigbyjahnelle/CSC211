//I didnt want to submit 4 different files, but if separated it works 
public class Shape{                        // In the Shape.java file 
    private int sides;
    
    public Shape(int sides){
        this.sides=sides; 
    }
    public int getSides(){
        return sides; 
    }
    public void setSides(int sides){
        this.sides=sides; 
    }
}
public class Circle extends Shape{.        //In the Circle.java file 
    public Circle(){
        super(0);
    }
}
public class Rectangle extends Shape{.     //In the Rectangle.java file 
    public Rectangle (){
        super(4); 
    }
}
public class Main
{
	public static void main(String[] args) {
		Circle circle = new Circle();
		System.out.println("Circle sides: "+circle.getSides()); 
		Rectangle rectangle = new Rectangle();
		System.out.println("Rectangle sides: "+rectangle.getSides()); 
	}
}
