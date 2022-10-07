public class ShapeMain{
	public static void main(String[] args){
		Area a1 = new Area();
		// Area a1 = new Area("Circle", "Red", 30);
		// Area a2 = new Area("Circle", "Red", 30);
		// System.out.println(a1.equals(a2));
		a1.setName("Circle");
		a1.setColor("Red");
		a1.setRadius(30);
		System.out.println(a1);
		System.out.println("Area: "+a1.computeArea());


	}
}