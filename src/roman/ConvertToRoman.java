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
				
		String tensString = Tens(tens);
		String unitString = Units(units);
		workingString = workingString + tensString + unitString;

		System.out.println("The answer is: " + workingString);
		return workingString;
		
	}

	private String Tens(int tens) {
		// TODO Auto-generated method stub
		String tenString="";
// 		90 is a special case
		
		if (tens== 9) {
			return "XC";
			
		}
		
		if (tens/5 == 1) {
			tenString = "L";
			tens = tens % 5;
		}
		
//		if (tens > 0) {
			if (tens == 4) {
				tenString = tenString + "XL";
			}
			else {
				// does this work for zero
				for (int i=0;i<tens;i++)
				{
					tenString = tenString + "X";
				}
			}
		return tenString;
	}

	public String Units (int units) {
	
		String unitString="";
// 		9 is a special case
		
		if (units== 9) {
			return "IX";
			
		}
		
		if (units/5 == 1) {
			unitString = "V";
			units = units % 5;
		}
		
//		if (units > 0) {
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
