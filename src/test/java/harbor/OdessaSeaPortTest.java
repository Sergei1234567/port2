package harbor;

import org.junit.Test;

import static org.junit.Assert.*;

public class OdessaSeaPortTest {

    @Test
    public void sortSumPaymentAsc_Test() {
        OdessaSeaPort port = new OdessaSeaPort();
        AbstractShip[] arrayShips = new AbstractShip[3];

        arrayShips[0] = new Cargo("TestCargoName", 100, 100, 100, 10);
        arrayShips[1] = new Tanker("TestNameTatnker", 100, 100, 100, 100);
        arrayShips[2] = new Liner("TestNameLiner", 100, 100, 100, 300);

        assertEquals("{TestNameTatnker=25000};" + "{TestNameCargo=55000};" +
                "{TestNameLiner=100000};",port.sortSumPaymentAsc(arrayShips));
    }

}