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
	public void testLessThan1() {
		int checkVal = 0;
		
		ConvertToRoman mess = new ConvertToRoman();
		String message = mess.romanVal(checkVal) ;
				
		assertEquals("",message);  
	}

	@Test
	public void testEquals1() {
		int checkVal = 1;
		
		ConvertToRoman mess = new ConvertToRoman();
		String message = mess.romanVal(checkVal) ;
		
		
		assertEquals("I",message);  
	}
	
	@Test
	public void testEquals2() {
		int checkVal = 2;
		
		ConvertToRoman mess = new ConvertToRoman();
		String message = mess.romanVal(checkVal) ;
		
		
		assertEquals("II",message);  
	}
	
	@Test
	public void testEquals3() {
		int checkVal = 3;
		
		ConvertToRoman mess = new ConvertToRoman();
		String message = mess.romanVal(checkVal) ;
		
		
		assertEquals("III",message);  
	}
	
	@Test
	public void testEquals4() {
		int checkVal = 4;
		
		ConvertToRoman mess = new ConvertToRoman();
		String message = mess.romanVal(checkVal) ;
		
		
		assertEquals("IV",message);  
	}
	
	@Test
	public void testEquals5() {
		int checkVal = 5;
		
		ConvertToRoman mess = new ConvertToRoman();
		String message = mess.romanVal(checkVal) ;
		
		
		assertEquals("V",message);  
	}

	@Test
	public void testEquals7() {
		int checkVal = 7;
//		
		ConvertToRoman mess = new ConvertToRoman();
		String message = mess.romanVal(checkVal) ;
				
	
		assertEquals("VII",message);
	}

}
