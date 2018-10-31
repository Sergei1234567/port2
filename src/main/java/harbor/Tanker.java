package harbor;

class Tanker extends AbstractShip implements Comparable<Tanker> {
    public float getVolume() {
        return volume;
    }

    private float volume;
    public static final float DEFAULT_RENTAL = 250;

    public Tanker(String name, float length, float width, float displacement, float volume) {
        super(name, length, width, displacement);
        this.volume = volume;
    }

    @Override
    public float calculatePayment() {
        return volume * DEFAULT_RENTAL;
    }

    public float calculatePayment(float rentTax) {
        if (rentTax > 0) {
            return volume * rentTax;
        } else {
            return calculatePayment();
        }
    }

    public int compareTo(Tanker o) {

        if (o.getVolume() < 0) {
            return 1;
        } else if (o.getVolume() == 0) {
            return 0;
        } else {
            return -1;
        }
    }
}
