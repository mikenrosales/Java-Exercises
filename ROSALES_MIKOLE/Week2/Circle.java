public class Circle{
	// private variables 
	private int x;
	private int y;
	private float rad;
	private double area;
	private double circu;

	// Constructor with method for circu and area computation
	public Circle(){}
	
	public Circle(int x, int y, float rad){
		this.x = x;
		this.y = y;
		this.rad = rad;
		//method for computing
		this.area = Math.PI * (rad * rad);
		this.circu = 2 * Math.PI * rad;
	}

	//Getters and Setters
	public void setX(int x){
		this.x = x;
	}

	public void setY(int y){
		this.y = y;
	}

	public void setRad(float rad){
		this.rad = rad;
	}

	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

	public float getRad(){
		return rad;
	}

	//builder
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("Center Point = (" + x + "," + y + ") Radius = "+rad+" || Area "+ area+" Circumference " + circu);
		return sb.toString();
	}

	//flag
	public boolean equals(Object obj){
		boolean ans = false;
		if(obj instanceof Circle){
			Circle c = (Circle)obj;
			if(this.x==c.x && this.y==c.y)
				ans = true;
		}
		return ans;
	}

	//main
	public static void main(String[] args){
		Circle c1 = new Circle(); // empty circle
		Circle c2 = new Circle(3, 4, 5); // x, y, rad
		System.out.println(c1 + "\n" + c2);

	}
}

