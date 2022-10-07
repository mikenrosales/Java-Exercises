public class Circle{
	private String name;
	private String color;

	public Circle(){} // default constructor

	public Circle(String name, String color){ // custom constructor
		this.name = name;
		this.color = color;
	}

	// getters and setters
	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}

	// display class
	public void display(){
		System.out.println("Name:"+ name);
		System.out.println("Color:"+ color);
	}

	// toString
	public String toString(){
		return "Name: " + name + "\nColor: " + color;
	}

	// isEqual
	public boolean equals(Object obj){
		if(obj instanceof Circle){
			if(this.name == ((Circle)obj).name && this.color == ((Circle)obj).color){
				return true;
			}
		}
		return false;
	}
}