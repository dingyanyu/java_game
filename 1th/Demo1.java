

public class Demo1 {
	public static void main(String[] args){

		Clerk clerk1 = new Clerk("lin",24,333.3f);
		System.out.println("the name is "+clerk1.name+"; the salary is "+
					clerk1.getSal());
	}
}


class Clerk {
	public String name;
	private int age;
	private float salary;

	public Clerk(String name, int age, float sal){
		this.name = name;
		this.age = age;
		this.salary = sal;
	}

	//To access a private property through a member method
	public float getSal(){
		return this.salary;
	}
	
	
}

