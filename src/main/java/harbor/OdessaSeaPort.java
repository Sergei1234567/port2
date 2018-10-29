package harbor;

public class OdessaSeaPort {

    public static String sortSumPaymentAsc(AbstractShip[] arrayShips) {
        String result = "";

        if (arrayShips == null || arrayShips.length == 0) {
            return "";
        }

        for (int i = arrayShips.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayShips[i] == null) {
                    break;
                }
                if (arrayShips[j].calculatePayment() > arrayShips[j + 1].calculatePayment()) {
                    AbstractShip tmp = arrayShips[j];
                    arrayShips[j] = arrayShips[j + 1];
                    arrayShips[j + 1] = tmp;
                }
            }
        }

        for (int index = 0; index < arrayShips.length; index++) {
            if (arrayShips[index] != null) {
                result += arrayShips[index].getName() + "=" + arrayShips[index].calculatePayment();
            }
        }

        return result;
    }

}