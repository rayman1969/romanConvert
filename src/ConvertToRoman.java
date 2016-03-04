
public class ConvertToRoman {

	public static void main(int toConvert) {
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
		System.out.println(workingString);
	}

}
