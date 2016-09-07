

class WhileDemo3 {
	public static void main(String[] args) {
		//定义一个统计变量，默认值是0
		int count = 0;

		int end = 884800;
		int start = 1;

		while(start < end) {
			count++;
			start <<= 1;      //左移一位相当于乘以2
		//	System.out.println(start);
		}

		System.out.println("要叠"+count+"次");
	}
}

