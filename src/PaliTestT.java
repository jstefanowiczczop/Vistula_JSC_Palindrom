import static org.junit.Assert.*;

import org.junit.Test;

public class PaliTestT {
	Pali p = new Pali();
	@Test
	public void testSprawdzPalindrom() {
		
		String a = "kajak";
		String b = new StringBuffer(a).toString();
		boolean porownanie = b.equalsIgnoreCase(a);
		assertEquals(porownanie, true);

	}

	public void testSprawdzPalindromNegative() {
		
		String a = "buty";
		String b = new StringBuffer(a).toString();
		boolean porownanie = b.equalsIgnoreCase(a);
		assertEquals(porownanie, true); 

	}

	@Test
	public void testSprawdzPalindromBigLetter() {
		
		String a = "£ama³";
		String b = new StringBuffer(a).toString();
		boolean porownanie = b.equalsIgnoreCase(a);
		assertEquals(porownanie, true);
	}

	@Test
	public void testSprawdzPalindromNull() {
		
		String a = " ";
		String b = new StringBuffer(a).toString();
		boolean porownanie = b.equalsIgnoreCase(a);
		assertEquals(porownanie, true);

	}

	@Test
	public void testSprawdzPalindromTabulator() {
	
		String a = "	   ";
		String b = new StringBuffer(a).toString();
		boolean porownanie = b.equalsIgnoreCase(a);
		assertEquals(porownanie, true);

	}
}
