import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GunballMachineTest {

	@Test
	void testInsertQuarter() {
		GumballMachine gm1 = new GumballMachine(2);
		gm1.insertQuarter();
		gm1.turnCrank();
		gm1.insertQuarter();
		gm1.turnCrank();
		gm1.insertQuarter();
		gm1.turnCrank();
	}

}
