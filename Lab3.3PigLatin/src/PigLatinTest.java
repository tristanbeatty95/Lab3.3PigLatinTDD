import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PigLatinTest {

	@Test
	void vowelTest1() {
		assertEquals("appleway", PigLatin.convertToLatin("apple"));
	}
	
	@Test
	void vowelTest2() {
		assertEquals("oasisway", PigLatin.convertToLatin("oasis"));
	}
	
	@Test
	void vowelTest3() {
		assertEquals("elephantway", PigLatin.convertToLatin("elephant"));
	}

	@Test
	void vowelTest4() {
		assertEquals("eucalyptusway", PigLatin.convertToLatin("eucalyptus"));
	}
	
	@Test
	void vowelTest5() {
		assertEquals("eraseway", PigLatin.convertToLatin("erase"));
	}
	
	@Test
	void consonantTest() {
		assertEquals("obotray", PigLatin.convertToLatin("robot"));
	}
	
	@Test
	void consonantTest2() {
		assertEquals("akerbay", PigLatin.convertToLatin("baker"));
	}
	
	@Test
	void twoconsonantTest() {
		assertEquals("okenbray", PigLatin.convertToLatin("broken"));
	}
	
	@Test
	void threeconsonantTest() {
		assertEquals("atsplay", PigLatin.convertToLatin("splat"));
	}
	
	@Test
	void lowerCaseConversionTest() {
		assertEquals("splat", "Splat".toLowerCase());
	}
}
