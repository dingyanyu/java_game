public class C105Table2{
	public static void main(String[] args){
		C105Table2.set(5);
	}

	public static void set(int n){
		for(int i = 1; i <= n; i++){

			for(int j = 1; j <= i; j++){
				if((i==3 && j == 3) || (j==3 && i==4)){
					System.out.print(" "+j+"*"+i+"="+i*j+" ");
				}
				else{
					System.out.print(j+"*"+i+"="+i*j+" ");
				}
			}
			System.out.println(" ");
		}

	}
}

