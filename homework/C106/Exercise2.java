

public class Exercise2 {
	public static int peach(int day, int sday){
		if(day == sday){
			return 1;
		}
		else{
			return (peach(day + 1, sday)+1)*2;
		}
	}

	public static void scan(){
		System.out.println("please input two number: ");
		Scanner sr = new Scanner(System.in);

		int a = sr.nextInt();
		int b = sr.nextInt();

		if(a < b){
			System.out.println(Exercise2.peach(a,b));
		}
		else{
			System.out.println("the first number <= the second number");
			Exercise2.scan();
		}
	}
/*
	int a = sr.nextInt();
	int b = sr.nextInt();

	if(a < b){
		System.out.println(Exercise2.peach(a,b));
	}
	else{
		System.out.println("the first number <= the second number");
		Exercise2.scan();
	}
	*/
	public static void main(String[] args){
		
	}
}
