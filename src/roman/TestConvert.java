package roman;
import static org.junit.Assert.*;
import org.junit.Test;
import roman.Conversion;
import roman.ConvertToRoman;

public class TestConvert {

//	@Test
//	public void testMoreThan10() {
//		fail("Not yet implemented");
//	}
	
	@Test
	public void testEquals5() {
		int checkVal = 5;
//		
		ConvertToRoman mess = new ConvertToRoman();
		String message = mess.LessThan10(checkVal);
		System.out.println("Hello xxx  " + message);
		
		assertEquals("V",message);  
	}

	@Test
	public void testLessThan10() {
		int checkVal = 7;
//		
		ConvertToRoman mess = new ConvertToRoman();
		String message = mess.romanVal(checkVal) ;
				
		System.out.println("Hello ccc  " + message);
		
		assertEquals("<9",message);
	}

//	@Test
//	public void testGreaterThan9() {
//		int checkVal = 11;
//		Conversion message = new Conversion();
//		message.Conversion(checkVal);
//		System.out.println("Hello2 " + message);
//		
//		assertEquals(">9",message);
//	}
}
