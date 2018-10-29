package harbor;

import java.util.Arrays;

public class OdessaSeaPort {

    public static String sortSumPaymentAsc(AbstractShip[] arrayShips) {
        String result = "";

        if (arrayShips == null) {
            return result;
        }

        Arrays.sort(arrayShips);

        for (int i = 0; i < arrayShips.length; i++) {
            result += arrayShips[i].getName() + "=" + arrayShips[i].calculatePayment();
        }
        return result;
    }
}