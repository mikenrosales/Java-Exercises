public class Area extends Circle{
	private double radius;

	public Area(){}

	public Area(String name, String color, double radius){
		super(name, color);
		this.radius = radius;
	}

	// getters and setters
	public double getRadius(){
		return radius;
	}

	public void setRadius(double radius){
		this.radius = radius;
	}

	public double computeArea(){
		return 3.1416 * radius * radius;
	}

	public void display(){
		super.display();
		System.out.println("Radius: "+radius);
	}

	@Override
	public String toString(){
		return super.toString() + "\nRadius: "+ radius;
	}

	@Override
	public boolean equals(Object obj){
		if(obj instanceof Area){
			if(this.radius == ((Area)obj).radius){
				return true;
			}
		}
		return false;
	}
}