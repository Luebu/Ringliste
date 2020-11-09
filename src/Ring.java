public class Ring {
    private int zahl;
    private Ring nachfolger;

    Ring(int pN) {
        zahl = pN;
    }

    public Ring getNachfolger() {
        return nachfolger;
    }

    public void setNachfolger(Ring nachfolger) {
        this.nachfolger = nachfolger;
    }

    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }
}
