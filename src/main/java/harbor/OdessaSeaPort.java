package harbor;

import java.util.Arrays;

public class OdessaSeaPort {

    public static String sortSumPaymentAsc(AbstractShip[] arrayShips) {

        String result = "";

        if (arrayShips == null || arrayShips.length == 0) {
            return "";
        }

        Arrays.sort(arrayShips);

        for (AbstractShip arrayShip : arrayShips) {
            if (arrayShip != null) {
                result += arrayShip.getName() + "=" + arrayShip.calculatePayment();
            }
        }
        return result;
    }

}