

public class C105table {

	public static void main(String[] args){
		for(int i = 1; i <= 9; i++){

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
