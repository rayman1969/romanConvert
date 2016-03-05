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

	@Test
	public void testEquals9() {
		int checkVal = 9;
//		
		ConvertToRoman mess = new ConvertToRoman();
		String message = mess.romanVal(checkVal) ;
				
	
		assertEquals("IX",message);
	}
	@Test
	public void testEquals24() {
		int checkVal = 24;
//		
		ConvertToRoman mess = new ConvertToRoman();
		String message = mess.romanVal(checkVal) ;
				
	
		assertEquals("XXIV",message);
	}
	@Test
	public void testEquals40() {
		int checkVal = 40;
//		
		ConvertToRoman mess = new ConvertToRoman();
		String message = mess.romanVal(checkVal) ;
				
	
		assertEquals("XL",message);
	}

	@Test
	public void testEquals47() {
		int checkVal = 47;
//		
		ConvertToRoman mess = new ConvertToRoman();
		String message = mess.romanVal(checkVal) ;
				
	
		assertEquals("XLVII",message);
	}
	@Test
	public void testEquals93() {
		int checkVal = 93;
//		
		ConvertToRoman mess = new ConvertToRoman();
		String message = mess.romanVal(checkVal) ;
				
	
		assertEquals("XCIII",message);
	}
	@Test
	public void testEquals247() {
		int checkVal = 247;
//		
		ConvertToRoman mess = new ConvertToRoman();
		String message = mess.romanVal(checkVal) ;
				
	
		assertEquals("CCXLVII",message);
	}
	@Test
	public void testEquals900() {
		int checkVal = 900;
//		
		ConvertToRoman mess = new ConvertToRoman();
		String message = mess.romanVal(checkVal) ;
				
	
		assertEquals("CM",message);
	}

	@Test
	public void testEquals557() {
		int checkVal = 557;
//		
		ConvertToRoman mess = new ConvertToRoman();
		String message = mess.romanVal(checkVal) ;
				
	
		assertEquals("DLVII",message);
	}

	@Test
	public void testEquals1822() {
		int checkVal = 1822;
//		
		ConvertToRoman mess = new ConvertToRoman();
		String message = mess.romanVal(checkVal) ;
				
	
		assertEquals("MDCCCXXII",message);
	}
	@Test
	public void testEquals1969() {
		int checkVal = 1969;
//		
		ConvertToRoman mess = new ConvertToRoman();
		String message = mess.romanVal(checkVal) ;
				
	
		assertEquals("MCMLXIX",message);
	}
}
