package s045;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EsTest2 {

	//@Test //costrutto uscito con java 5
		//void test() { //test fino a JUnit 3 era obbligatorio, ma ora non lo � pi�
		//	fail("Not yet implemented");
		//}
		
		@Test
		void testNull() {
			String result = Es.toUpper(null); //EsProfe � la classe del main del codice
			assertNull(result);
		}
		
		@Test
		void testEmpty() {
			String result = Es.toUpper("");
			assertTrue(result.isEmpty());
		}
		
		@Test
		void testBob() {
			String result = Es.toUpper("Bob");
			assertEquals("BOB", result);
		}


}
