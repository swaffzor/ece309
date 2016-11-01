public class Calculator {

	public static void main(String[] args) {
		
		System.out.println(Add("2+2"));
		
	}
	

	//	+ unary eliminator

	//	- unary -- add n

	//	- unary -- replace n

	//	Replace x variable

	//	find ()

	//	Solve ^

	//	Solve r

	//	Solve *
		public String multiply(String nugget){
			return nugget;
			
		}
	//	Solve / 

	//	Solve + (Jeremy)
	public static String Add(String expression){
		String[] temp = expression.split("\\+");
		String result;
		int[] nums = new int[2];
		int sum;
		
		nums[0] = Integer.parseInt(temp[0]);
		nums[1] = Integer.parseInt(temp[1]);
		sum = nums[0] + nums[1];
		result = Integer.toString(sum);
		
		return result;
	}

	//	Solve -

	//	Return Boolean - Check there are no more operators

	//	Space replacer

	//	Find end of expression


}
