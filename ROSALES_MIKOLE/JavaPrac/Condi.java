import java.util.*;

public class Condi{
	private int id;
	private int age;
	

	// public Condi(){}
	public Condi(){
		Scanner input = new Scanner(System.in);
		id = input.nextInt();
		age = input.nextInt();

		this.id = id;
		this.age = age;
	}

	public void setId(){
		
		this.id = id;
	}

	public void setAge(){
		
		this.age = age;
	}

	public int getId(int id){

		return id;
	}

	public int getAge(int age){

		return age;
	}

	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("ID = "+id+" Age = "+age);
		return sb.toString();
	}

	public static void main(String[] args) {
		// Condi i1 = new Condi();
		// Condi i2 = new Condi();
		// System.out.println(i1 +"\n"+ i2);
	}

}