package s045;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EsProfeTest {

	//@Test //costrutto uscito con java 5
	//void test() { //test fino a JUnit 3 era obbligatorio, ma ora non lo � pi�
	//	fail("Not yet implemented");
	//}
	
	@Test
	void testNull() {
		String result = EsProfe.toUpper(null); //EsProfe � la classe del main del codice
		assertNull(result);
	}

}
