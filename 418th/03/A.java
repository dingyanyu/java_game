
class A{
	int i;
	class B{
		int j;

		int funB(){
			int result = A.this.i + this.j;
			System.out.println(result);
			return result;
		}
	}
}

