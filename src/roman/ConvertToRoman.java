package roman;

public class ConvertToRoman {

	public static final String UNIT = "I";
	public static final String FIVE = "V";
	public static final String TEN = "X";
	public static final String FIFTY = "L";
	public static final String HUNDRED = "C";
	public static final String FIVEHUNDRED = "D";
	public static final String THOUSAND = "M";
	 	
	public static final String romanArray[]= {UNIT,FIVE,TEN,FIFTY,HUNDRED,FIVEHUNDRED,THOUSAND};
	
	
	String romanVal (int toConvert)
	{
		
		String workingString="";
		int workingInt = toConvert; 
	
		if (workingInt < 1) 
			return ""; 
		
		int units = workingInt % 10;
		int tens = (workingInt %100) /10;
		int hundreds = (workingInt % 1000) /100;
		int thousands = (workingInt %10000) /1000;
		
		for (int i=0;i<thousands;i++)
			workingString = workingString + romanArray[(romanArray.length-1)];
				
		String hundredsString = HeavyLifting(hundreds,4);
		String tensString = HeavyLifting(tens,2);
		String unitString = HeavyLifting(units,0);
		
		workingString = workingString + hundredsString + tensString + unitString;

		System.out.println("You entered: " + toConvert + " and the answer is: " + workingString);
		return workingString;
		
		
	}


	private String HeavyLifting(int inputValue, int unit) {
		// TODO Auto-generated method stub
		String convString="";
		int workingValue = inputValue;
		if (workingValue == 0)
			return "";
		
		String single = romanArray[unit];
		String mid = romanArray[++unit];
		String next = romanArray[++unit];
				
		if (workingValue== 9) {
			return single + next;		
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
				// this work for zero
				for (int i=0;i<workingValue;i++)
				{
					convString = convString + single;
				}
			}
			
		return convString ;
	}

	
	
}
