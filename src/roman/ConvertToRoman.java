package roman;

public class ConvertToRoman {

	String romanVal (int toConvert)
	{
//	public String Conversion(int toConvert) {
		// TODO Auto-generated method stub
		System.out.println("you entered" + toConvert);
		String workingString="";
		int workingInt = toConvert; 
	
		if (workingInt > 9) {
			workingString=">9";
		}
		else
		{
			workingString="<9";
//			String unitString = LessThan10(workingInt);
		}
		System.out.println("The answer is: " + workingString);
		return workingString;
		
	}

	public String LessThan10 (int units) {
	
		
		if (units/5 == 1) {
			return "V";
		}
		else {
			return "";
		}
	}
	
	public String LessThan5 (int units) {
		if (units < 5) {
			return "I";
		}
		else {
			return "V";
		}
	}
	
	
}
