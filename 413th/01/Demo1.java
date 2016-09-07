
public class Demo1 {

	public static void main(String[] args) {
		
		int score = -1;
		if(score >= 85 && score <= 100){
			System.out.println("成绩为优");
		}
		else if(score >= 75 && score <85){
			System.out.println("成绩为良");
		}
		else if(score >= 60 && score < 75){
			System.out.println("成绩为及格");
		}
		else if(score >= 0 && score < 60){
			System.out.println("成绩为不及格");
		}
		else if(score > 100 || score < 0){
			System.out.println("非法成绩");
		}
	}

}


