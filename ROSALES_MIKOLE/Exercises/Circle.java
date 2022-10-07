public class Circle{
	// variables
	private double radius;
	private String color;

	// constructors
	public Circle(){
		radius = 1.0;
		color = "red";
	}

	public Circle(double r){
		radius = r;
		color = "red";
	}

	// methods
	public double getRadius(){
		return radius;
	}

	public double getArea(){
		return radius*radius*Math.PI;
	}

}