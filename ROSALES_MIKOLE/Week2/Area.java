public class Area{
	private int length;
	private int width;

	public Area(int length, int width){
		this.length = length;
		this.width = width;
	}

	public void getArea(){
		int area = length * width;
		System.out.println("Area "+area);
	}


	public static void main(String[] args) {
		Area rectangle = new Area(5, 6);
		rectangle.getArea();
	}
}
