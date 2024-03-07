import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUnitTest {

	@Test
	void testArea1() {
	Area a1=new Area(3,2,1);
	float risAtteso=2.5f;
	float risOttenuto=a1.Calcolo();
	assertEquals(risAtteso,risOttenuto,0.1);
	}
	@Test
	void testArea2() {
	Area a1=new Area(6,5,5);
	float risAtteso=27.5f;
	float risOttenuto=a1.Calcolo();
	assertEquals(risAtteso,risOttenuto,0.1);
	}
	@Test
	void testArea3() {
	Area a1=new Area(32,5,1);
	float risAtteso=18.5f;
	float risOttenuto=a1.Calcolo();
	assertEquals(risAtteso,risOttenuto,0.1);
	}
}
