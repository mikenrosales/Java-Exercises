public class Trial{
	private int n1, n2, sum;

	public Trial(){}
	public Trial(int n1, int n2){
		this.n1 = n1;
		this.n2 = n2;
		this.sum = n1 + n2;

	}

	//setters
	public void setN1(int n1){
		this.n1 = n1;
	}
	public void setN2(int n1){
		this.n2 = n2;
	}

	public void setSum(int sum){
		this.sum = sum;
	}

	//getters
	public int getN1(){
		return n1;
	}	
	
	public int getN2(){
		return n2;
	}	

	//methods
	public int getSum(int n1, int n2){
		return n1 + n2;
	}

	public static double circu(float rad){
		return 2 * Math.PI * rad;
	}

	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("first number: "+n1+" Second number: "+n2+" Sum is: "+sum);
		return sb.toString();
	}	

	//main
	public static void main(String[] args) {
		Trial t1 = new Trial(1,2);
		System.out.println(t1);
		// System.out.println("The sum is: "+ sum(1,2));
		// System.out.println("The circumference is: "+ circu(2.0f));

	}
}
