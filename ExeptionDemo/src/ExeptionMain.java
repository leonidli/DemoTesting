import java.util.Arrays;

import javax.swing.plaf.InputMapUIResource;

public class ExeptionMain {

	public static void main(String[] args) {

		int [] input = {1, 2, 10, 10, 5};

	
		try {
			divide(input, 10);
			double divide =divide(input, 10);
			System.out.println("Everything went well");
		}catch (NegativeInputNotAllowedException ex) {
			ex.printStackTrace();
			System.out.println("Something went wrong"+ex.getMessage());
		}catch (CustomDivisionByZeroException ex) {
			System.out.println(ex.getMessage());
		}
		finally {
		System.out.println("Do this anyway!");	
		}
	//	if(divide)
		System.out.println("And executing");
}

	private static double divide(int[] input, int b) 
			throws NegativeInputNotAllowedException, CustomDivisionByZeroException{
		
		double [] out = new double [input.length];
		for(int i = 0; i<input.length; i++) {
			if(input[i] == 0) {
				throw new CustomDivisionByZeroException("Division by zero attempt ");
			}else if (input[i]<0){
				
				throw new NegativeInputNotAllowedException("Negative input is not allowed!")
			}
			else out.add( new Double (b/input[i]));
			}
		return out;
		}
		


		public static double divide2() {
		}
		
		private void psvm() {
			// TODO Auto-generated method stub

		}
			
			public static void main(String[] args) {
				
			List<Integer> asList =Arrays.asList("sss", "hljh", "lklk", "yfg");
	//		List<Integer> strings = getStrings(asList);
			Integer sum1 = getString(asList);
			Integer sum2 = getString(asList);
			
			System.out.println(strings.size());
			}	
					
			
			public statis Integer getString(List<Integer>input){
				Integer sum = null; 
						for(int i: input) {
							sum= sum + i;
						}
				return sum;
		}
		
			}

