package harbor;

import org.junit.Test;

import static org.junit.Assert.*;

public class OdessaSeaPortTest {

    @Test
    public void sortSumPaymentAsc_Test() {
        AbstractShip[] arrayShips = new AbstractShip[3];
        arrayShips[0] = new Cargo("TestNameCargo", 100, 100, 100, 100);
        arrayShips[1] = new Tanker("TestNameTanker", 100, 100, 100, 100);
        arrayShips[2] = new Liner("TestNameLiner", 100, 100, 100, 100);


        assertEquals("TestNameTanker=25000.0TestNameCargo=55000.0TestNameLiner=100000.0",
                OdessaSeaPort.sortSumPaymentAsc(arrayShips));
    }

}