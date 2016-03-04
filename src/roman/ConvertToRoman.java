package roman;

public class ConvertToRoman {

	public static final String UNIT = "I";
	public static final String FIVE = "V";
	public static final String TEN = "X";
	public static final String FIFTY = "L";
	public static final String HUNDRED = "C";
	public static final String FIVEHUNDRED = "D";
	
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
				
//		String tensString = Tens(tens);
//		String unitString = Units(units);
		String hundredsString = HeavyLifting(hundreds,100);
		String tensString = HeavyLifting(tens,10);
		String unitString = HeavyLifting(units,1);
		
		workingString = workingString + hundredsString + tensString + unitString;

		System.out.println("The answer is: " + workingString);
		return workingString;
		
	}


	private String HeavyLifting(int inputValue, int unit) {
		// TODO Auto-generated method stub
		String convString="";
		int workingValue = inputValue;
// 		9 is a special case
		
//		switch (unit) {
//		case 
//		}
		
		String mid = "";
		String single = "";
		
//		switch unit {
//		case 1:
		if (unit ==1)
		{ 
			mid=FIVE;
			single=UNIT;
//			break
		}
		
		if (unit ==10)
		{ 
			mid=FIFTY;
			single=TEN;
//			break
		}
		
		if (unit ==100)
		{ 
			mid=FIVEHUNDRED;
			single=HUNDRED;
//			break
		}
		
		
		
		if (workingValue== 9) {
			return single + mid;		
		}
		
		if (workingValue/5 == 1) {
			convString = mid;
			workingValue = workingValue % 5;
		}
		
//		
			if (workingValue == 4) {
				convString = convString + single + mid;
			}
			else {
				// does this work for zero
				for (int i=0;i<workingValue;i++)
				{
					convString = convString + single;
				}
			}
			
		return convString ;
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
