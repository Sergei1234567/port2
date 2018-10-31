package harbor;

class Cargo extends AbstractShip implements Comparable<Cargo> {
    public float getTonnage() {
        return tonnage;
    }

    private float tonnage;
    public static final float DEFAULT_RENTAL = 550;

    public Cargo(String name, float length, float width, float displacement, float tonnage) {
        super(name, length, width, displacement);
        this.tonnage = tonnage;
    }

    @Override
    public float calculatePayment() {
        return tonnage * DEFAULT_RENTAL;
    }

    public float calculatePayment(float rentTax) {
        if (rentTax > 0) {
            return tonnage * rentTax;
        } else {
            return calculatePayment();
        }
    }

    public int compareTo(Cargo o) {
        if (o.getTonnage() < 0) {
            return 1;
        } else if (o.getTonnage() == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}
