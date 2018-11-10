
public class Demo {
// input.lenth() == 3 -> input.toUpperCase();
// input.lenth() == 4 -> input.toLowerCase();	
// input
	
	
	
	public static String checkString (String input) throws IncorrectDataException {
//		if(input == null) return "";
		if(input != null) {
		if(input.length()== 3) {
			return input.toUpperCase();
		}
			if(input.length() == 4) {
				return input.toLowerCase();
			}
		
		return input;
	}else {
		throw new IncorrectDataException("input is null!");
	}
	}
	
//	public static boolean doSomething() {
//		boolean flag = false;
//		if(flag) {
//			return "Hello world!";
//		}
//		return test;
//	}

}
