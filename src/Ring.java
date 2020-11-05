public class Ring {
    int zahl;
    Ring nachfolger;

    public void setNachfolger(Ring nachfolger) {
        this.nachfolger = nachfolger;
    }

    public Ring getNachfolger() {
        return nachfolger;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }

    public int getZahl() {
        return zahl;
    }
}
