package roman;

public class Conversion {
	
		
//	public Conversion(int toConvert) {
	public String Conversion(int toConvert) {
		// TODO Auto-generated method stub
		String workingString="";
		int workingInt = toConvert; 
		if (workingInt > 9) {
			workingString=">9";
		}
		else
		{
			workingString="<9";
		}
		System.out.println("answer:"+ workingString);
		return workingString;
	}

	public String LessThan10 (int units) {
		if (units < 5) {
			return "I";
		}
		else {
			return "VI";
		}
	}

	public static String check() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

