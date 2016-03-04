package roman;

public class ConvertToRoman {

	String romanVal (int toConvert)
	{
		System.out.println("you entered: " + toConvert);
		String workingString="";
		int workingInt = toConvert; 
	
		if (workingInt < 1) {
			return ""; 
		}
		int units = workingInt % 10;
		int tens = (workingInt %100) /10;
		int hundreds = (workingInt % 1000) /100;
				
		if (workingInt > 9) {
			workingString=">9"; 
		}
		else
		{
//			workingString="<9";
			String unitString = Units(units);
			workingString = workingString + unitString;
		}
		System.out.println("The answer is: " + workingString);
		return workingString;
		
	}

	public String Units (int units) {
	
		String unitString="";
		
		if (units/5 == 1) {
			unitString = "V";
			units = units % 5;
		}
		
		if (units > 0) {
			if (units == 4) {
				unitString = unitString + "IV";
			}
			else {
				// does this work for zero
				for (int i=0;i<units;i++)
				{
					unitString = unitString + "I";
				}
			}
			
		}
//		else {
//			
//		}
		return unitString;
		
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
